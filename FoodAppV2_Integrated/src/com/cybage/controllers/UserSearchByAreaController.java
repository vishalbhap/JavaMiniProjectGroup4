package com.cybage.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.pojo.Restaurant;
import com.cybage.service.UserServiceImpl;

/**
 * Servlet implementation class UserSearchByAreaController
 */
@WebServlet("/UserSearchByAreaController")
public class UserSearchByAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSearchByAreaController() {
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
		UserServiceImpl userService=new UserServiceImpl();
		PrintWriter out=response.getWriter();
		int pincode=Integer.parseInt(request.getParameter("pincode")) ;
		List<Restaurant> rest=new ArrayList<Restaurant>();
		rest=userService.searchByArea(pincode);
		request.setAttribute("displayRest",rest);
		RequestDispatcher context=request.getRequestDispatcher("showRestaurant.jsp");
		context.forward(request, response);
	
//	    System.out.println(rest);
	}

}
