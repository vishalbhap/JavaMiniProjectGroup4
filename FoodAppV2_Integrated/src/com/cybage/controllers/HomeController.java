package com.cybage.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.dao.CartDao;
import com.cybage.dao.CartDaoImpl;
import com.cybage.pojo.Cart;
import com.cybage.pojo.FoodItem;
import com.cybage.pojo.OrderFood;
import com.cybage.pojo.Restaurant;
import com.cybage.pojo.User;
import com.cybage.service.FoodItemService;
import com.cybage.service.FoodItemServiceImpl;
import com.cybage.service.OrderService;
import com.cybage.service.OrderServiceImpl;
import com.cybage.service.RestaurantService;
import com.cybage.service.RestaurantServiceImpl;

@WebServlet(urlPatterns =  {"/HomeController", "/AllRestaurants", "/AddCart","/ShowCart","/Order", "/AddOrder", "/AddFavorites" ,"/ShowFavorites","/removeCart"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RestaurantService restaurantService = new RestaurantServiceImpl(); 
	private FoodItemService foodItemService = new FoodItemServiceImpl();
	private CartDao cartDao = new CartDaoImpl();
	private OrderService orderService = new OrderServiceImpl();
    public HomeController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher ;
		HttpSession session = request.getSession();
//		List<Integer> cartList =  (List<Integer>) session.getAttribute("cartList");
		List<Integer> favoriteList =  (List<Integer>) session.getAttribute("favoriteList");
		User user =(User) session.getAttribute("user");
		
		String path = request.getServletPath();
		System.out.println(path);
		
		switch (path) {
		case "/HomeController":
		List<Restaurant> restaurantList = restaurantService.allRestaurant();
		request.setAttribute("restaurantList", restaurantList);
		requestDispatcher = request.getRequestDispatcher("/jsp/User/AllRestaurant.jsp");
		requestDispatcher.forward(request, response);
		break;
		
		case "/AllRestaurants":
			List<FoodItem> foodList = foodItemService.getFoodItemsByRestaurant(Integer.parseInt(request.getParameter("restId")));
			request.setAttribute("foodList", foodList);
			request.getRequestDispatcher("/jsp/User/RestaurantMenu.jsp").forward(request, response);
			break;
			
		case "/AddCart":	
			int id = Integer.parseInt(request.getParameter("foodId"));
			cartDao.addCart(new Cart(user.getUserId(), id));
			response.sendRedirect("http://localhost:9090/FoodAppV2/HomeController");
			break;
			
		case "/Order":	
			int cartFoodId = Integer.parseInt(request.getParameter("foodId"));
			session.setAttribute("cartFoodId", cartFoodId);
			request.setAttribute("cartFoodId", cartFoodId);
			request.getRequestDispatcher("/jsp/User/OrderCheckout.jsp").forward(request, response);
			break;
			
		case "/AddOrder":	
//			List<ArrayList> foodListForOrder = (List<ArrayList>) session.getAttribute("foodListForOrder");
			
			int orderFoodId = (int) session.getAttribute("cartFoodId");
			FoodItem findByFoodId = foodItemService.findByFoodId(orderFoodId);
			int price = (int)findByFoodId.getPrice();
			User user1 = (User) session.getAttribute("user");
			
			String deliveryAddress = request.getParameter("delAdd");
			System.out.println("Pankaj");
			OrderFood orderFood = new OrderFood(user1.getUserId(), orderFoodId, "Order Successfull", price, deliveryAddress);
			System.out.println(orderFood);
			orderService.addOrder(orderFood);
			System.out.println();
			
//			request.setAttribute("cartFoodId", cartFoodId);
			List<OrderFood> orderList = orderService.showOrders(user1.getUserId());
			request.setAttribute("orderList", orderList);
//			System.out.println("Tejas");
			System.out.println(orderList);
			request.getRequestDispatcher("/jsp/User/showOrders.jsp").forward(request, response);
			break;
			
		case "/ShowCart":
			List<FoodItem> foodItemList = new ArrayList<FoodItem>();
			List<Cart> cart = cartDao.showCart();
			for(Cart cart1 : cart) {
				foodItemList.add(foodItemService.findByFoodId(cart1.getFoodId()));
			}
			request.setAttribute("foodItemList", foodItemList);
			session.setAttribute("foodListForOrder", foodItemList);
			request.getRequestDispatcher("/jsp/User/ShowCart.jsp").forward(request, response);
			break;
			
		case "/removeCart":	
			cartDao.deleteCart(Integer.parseInt(request.getParameter("foodId")));
			response.sendRedirect("http://localhost:9090/FoodAppV2/HomeController");
			break;
			
		case "/AddFavorites":	
			int restaurantId = Integer.parseInt(request.getParameter("restId"));
			if(!favoriteList.contains(restaurantId))
				favoriteList.add(restaurantId);
			response.sendRedirect("http://localhost:9090/FoodAppV2/HomeController");
			break;
			
		case "/ShowFavorites":
			List<Restaurant> restList = new ArrayList<Restaurant>();
			for(Integer restIds : favoriteList) {
				restList.add(restaurantService.findByRestaurantId(restIds));
			}
			request.setAttribute("restList", restList);
			request.getRequestDispatcher("/jsp/User/ShowFavorites.jsp").forward(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
