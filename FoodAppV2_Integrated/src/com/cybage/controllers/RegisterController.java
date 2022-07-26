package com.cybage.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cybage.util.DBUtil;

@WebServlet("/Register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    public RegisterController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside Registration");
		
		try { 

			Connection con = DBUtil.getConnection(); 

			PreparedStatement st = con.prepareStatement("insert into userinfo values(?,?,?,?,?,?,?)"); 

			// Same for second parameter 
			st.setString(1, request.getParameter("Id")); 
			st.setString(2, request.getParameter("uname")); 
			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("password"));
			st.setString(5, request.getParameter("phone"));
			st.setString(7, request.getParameter("address"));
			st.setString(6, request.getParameter("pincode"));
			
			// Execute the insert command using executeUpdate() 
			// to make changes in database 
			st.executeUpdate(); 

			// Close all the connections 
			st.close(); 
			con.close(); 

			// Get a writer pointer 
			// to display the successful result 
			System.out.println("Register successful");
			//PrintWriter out = response.getWriter(); 
			//out.println("<html><body><b>Successfully Inserted" + "</b></body></html>"); 
			response.sendRedirect("Login.jsp");
			
			
//			RequestDispatcher rd = request.getRequestDispatcher("userHome.jsp");
//			rd.forward(request, response);
			} 
			catch (Exception e) { 
				e.printStackTrace(); 
		} 
		
	}
}


