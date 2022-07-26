package com.cybage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.pojo.User;

public class ChangePasswordDao {
	
	public static Connection getConnection(){  
		
		Connection connection =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject" ,"root","root");
		  } catch (ClassNotFoundException e) {
			e.printStackTrace();
		  } catch (SQLException e) {
			e.printStackTrace();
		}	
	    return connection;
	}
	
	public static int update(User user){  
        int status=0;  
        try{  
            Connection con=ChangePasswordDao.getConnection();  
            //PreparedStatement ps=con.prepareStatement("update user905 set name=?,password=?,email=?,country=? where id=?"); 
            PreparedStatement ps=con.prepareStatement("update userinfo set password=? where userId=? ");
            ps.setString(1,user.getPassword()); 
            ps.setInt(2, user.getUserId());
            //ps.setString(2,user.getUserName());  
            //ps.setString(3,user.getUserEmailId()); 
            //ps.setString(5,user.getUserMobile());  
            //ps.setInt(6,user.getPincode());  
            //ps.setString(7,user.getAddress());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  

}
