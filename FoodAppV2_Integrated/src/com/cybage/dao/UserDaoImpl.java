package com.cybage.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.pojo.Restaurant;
import com.cybage.pojo.User;
import com.cybage.util.DBUtil;

public class UserDaoImpl implements UserDao{
	private Connection connection;
	
	public UserDaoImpl() {
		try {
			this.connection = DBUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int update(User user) {
	    try {
			PreparedStatement ps=connection.prepareStatement("update userinfo set password=? where userId=? ");
			ps.setString(1,user.getPassword()); 
			ps.setInt(2, user.getUserId());
			return ps.executeUpdate();  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public User findByEmail(String email) {
		User user = null;
		String sql = "SELECT * FROM userinfo WHERE useremail=?";
		try(PreparedStatement selectStatement = connection.prepareStatement(sql)) {
			selectStatement.setString(1, email);
			try(ResultSet resultSet = selectStatement.executeQuery();){
				if(resultSet.next())
					user = new User(resultSet.getInt("userId"), resultSet.getString("userName"), resultSet.getString("password"), resultSet.getInt("pincode"), resultSet.getString("address"), resultSet.getString("useremail"), resultSet.getString("usermobile"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<Restaurant> searchByArea(int pin) {
		String sql="SELECT * FROM restaurant WHERE rest_pincode=?;";
		List<Restaurant> restaurant =new ArrayList<Restaurant>();
		int restaurantId=0;
	    int	pincode=0;
		String restaurantName=null,address=null;
		String restaurantUserName=null,password=null,email=null;
		try {
			PreparedStatement prepareStatement=connection.prepareStatement(sql);
			prepareStatement.setInt(1, pin);
			ResultSet resultSet=prepareStatement.executeQuery();
			while(resultSet.next()) {
				restaurantId=resultSet.getInt(1);
				restaurantName=resultSet.getString(2);
				restaurantUserName=resultSet.getString(3);
				password=resultSet.getString(4);
				pincode=resultSet.getInt(5);
				email=resultSet.getString(6);
				address=resultSet.getString(7);
				restaurant.add(new Restaurant(restaurantId,restaurantName,restaurantUserName,password,pincode,email,address));
			   }
			
		  } catch (SQLException e) {
			e.printStackTrace();
		} 
		return restaurant;
		//return (List<Restaurant>) new Restaurant(restaurantId,restaurantName,restaurantUserName,password,pincode,email,address);
	}
	@Override
	public void close() throws IOException {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<User> getAllUser() {
		//connection=DBUtil.getConnection();
        List<User> users=new ArrayList<User>();
		
		User user = null;
		   try {
			PreparedStatement preparedStatement=  connection.prepareStatement("select * from userinfo");
		          
		     ResultSet resultSet=preparedStatement.executeQuery();
		          
		     while(resultSet.next()) {
		        	   int userId=  resultSet.getInt(1);
		        	  String userName= resultSet.getString(2);
		        	  String password= resultSet.getString(4);
		        	  int pincode= resultSet.getInt(6);
		        	  String address= resultSet.getString(7);
		        	  String email= resultSet.getString(3);
		        	  String phoneNumber= resultSet.getString(5);
		        	  
		        	  
		              user=new User(userId, userName, password, pincode, address, email, phoneNumber);
		              users.add(user);
		            
		     }
		              //connection.close();
		              return users;
		            
		   } catch (SQLException e) {
			
			e.printStackTrace();
		}
		return users;
		
		
	}

	@Override
	public Integer deleteUser(int userId) {
		String sql = "DELETE FROM userinfo WHERE userid = ?";
		try(PreparedStatement deleteStatement = connection.prepareStatement(sql)) {
			deleteStatement.setInt(1, userId);
			return deleteStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
