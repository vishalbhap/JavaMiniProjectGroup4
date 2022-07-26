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

import com.cybage.dao.FoodItemDao;
import com.cybage.dao.FoodItemDaoImpl;
import com.cybage.pojo.FoodItem;

/**
 * Servlet implementation class UserSearchDisplayController
 */
@WebServlet("/UserSearchFoodController")
public class UserSearchFoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSearchFoodController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FoodItemDao service=new FoodItemDaoImpl();
		String item=request.getParameter("searchItem");
		String searchItem=item.toLowerCase();
		System.out.println(searchItem);
		
		List<FoodItem> searchFoods=new ArrayList<FoodItem>();
		searchFoods=service.searchFood(searchItem);
		//System.out.println(searchFoods);
		request.setAttribute("searchFood", searchFoods);
		RequestDispatcher context=request.getRequestDispatcher("displaySearchedFood.jsp");
		context.forward(request, response);
		
	}

}
