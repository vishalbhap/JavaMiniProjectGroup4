package com.cybage.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.User;
import com.cybage.service.UserService;
import com.cybage.service.UserServiceImpl;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();
	RequestDispatcher requestDispatcher=null;       

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int userId=Integer.parseInt(request.getParameter("userId"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String contactNo=request.getParameter("contactNo");
		String gender=request.getParameter("gender");
		String role=request.getParameter("role");
		User user=new User( name, email, password, contactNo, gender, role);
		userService.addUser(user);
		System.out.println(user);
		
	}

}
