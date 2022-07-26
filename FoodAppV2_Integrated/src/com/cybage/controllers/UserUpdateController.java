package com.cybage.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.cybage.pojo.User;
import com.cybage.util.DBUtil;

@WebServlet("/UserUpdateController")
public class UserUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserUpdateController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	    	    
	 
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
         System.out.println("Inside Update Profile");
		
		try { 

			Connection con = DBUtil.getConnection(); 

			PreparedStatement st = con.prepareStatement("update userinfo set useremail=?,usermobile=?,address=?,pincode=? where userId=?"); 
			
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			

			// Same for second parameter 
			st.setInt(5, user.getUserId()); 
			//st.setString(1, request.getParameter("uname")); 
			st.setString(1, request.getParameter("email"));
			//st.setString(3, request.getParameter("password"));
			st.setString(2, request.getParameter("phone"));
			st.setString(3, request.getParameter("address"));
			st.setString(4, request.getParameter("pincode"));
			
			// Execute the insert command using executeUpdate() 
			// to make changes in database 
			st.executeUpdate(); 

			// Close all the connections 
//			st.close(); 
//			con.close(); 

			// Get a writer pointer 
			// to display the successful result 
			PrintWriter out = response.getWriter(); 
			out.println("<html><body><b>Successfully Inserted" + "</b></body></html>"); 
			response.sendRedirect("HomeController");
			} 
			catch (Exception e) { 
				e.printStackTrace(); 
		} 	
	}
}

