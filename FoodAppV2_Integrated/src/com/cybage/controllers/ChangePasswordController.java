package com.cybage.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.cybage.dao.ChangePasswordDao;
import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.pojo.User;
import com.cybage.util.DBUtil;

@WebServlet("/ChangePasswordController")
public class ChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao userDao = new UserDaoImpl();
  
    public ChangePasswordController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        
		String confirm = request.getParameter("confirm");
          
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
        user.setPassword(confirm);
        System.out.println(user.getPassword());
          
        int status=userDao.update(user);  
        if(status>0){ 
        	out.println("Update record successfully");
            response.sendRedirect("HomeController");  
        }
        else{  	
        	out.println("Sorry! unable to update record"); 
        	response.sendRedirect("changePassword.jsp");
        }        
        out.close();  
    }
}