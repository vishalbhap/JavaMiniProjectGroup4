package com.cybage.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.pojo.FoodItem;
import com.cybage.pojo.Restaurant;
import com.cybage.util.DBUtil;

public class RestaurantDaoImpl implements RestaurantDao{
	private Connection connection;

	public RestaurantDaoImpl() {
		try {
			this.connection = DBUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Integer addRestaurant(Restaurant restaurant) {
		Integer count = null;
		String sql = "INSERT INTO restaurant (rest_name,rest_username,rest_password,rest_pincode,rest_useremail,rest_address) VALUES(?,?,?,?,?,?)";
		try( PreparedStatement insertStatement = connection.prepareStatement(sql)) {
			insertStatement.setString(1, restaurant.getRestaurantName());
			insertStatement.setString(2, restaurant.getRestaurantName());
			insertStatement.setString(3, restaurant.getPassword());
			insertStatement.setInt(4, restaurant.getPincode());
			insertStatement.setString(5, restaurant.getEmail());
			insertStatement.setString(6, restaurant.getAddress());
			count = insertStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<Restaurant> allRestaurant() {
		String sql = "SELECT * FROM restaurant";
		List<Restaurant> restaurant = new ArrayList<Restaurant>();
		try(PreparedStatement selectStatement = connection.prepareStatement(sql);
			ResultSet resultSet = selectStatement.executeQuery();){
			while(resultSet.next())
				restaurant.add(new Restaurant(resultSet.getInt("rest_id"), resultSet.getString("rest_name"), resultSet.getString("rest_username"), resultSet.getString("rest_password"), resultSet.getInt("rest_pincode"),resultSet.getString("rest_useremail"),resultSet.getString("rest_address")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurant;
	}

	@Override
	public Integer deleteResaturant(int restaurantId) {
		String sql = "DELETE FROM restaurant WHERE rest_id = ?";
		try(PreparedStatement deleteStatement = connection.prepareStatement(sql)) {
			deleteStatement.setInt(1, restaurantId);
			return deleteStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer updateResaturant(Restaurant restaurant) {
		String sql = "UPDATE restaurant SET rest_username = ? , rest_pincode = ?,rest_address = ? WHERE rest_id = ?";
		try(PreparedStatement updateStatement = connection.prepareStatement(sql)) {
			updateStatement.setString(1, restaurant.getRestaurantUserName());
			updateStatement.setInt(2, restaurant.getPincode());
			updateStatement.setString(3, restaurant.getAddress());
			updateStatement.setInt(4, restaurant.getRestaurantId());
			return updateStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	@Override
	public Restaurant findByEmailAndPassword(String email,String password) {
		Restaurant restaurant = null;
		String sql = "SELECT * FROM restaurant WHERE email =? AND password = ?";	
		try(PreparedStatement selectStatement = connection.prepareStatement(sql);) {
 			selectStatement.setString(1, email);
 			selectStatement.setString(2, password);
 			try(ResultSet resultSet = selectStatement.executeQuery();){
 				if(resultSet.next())
 					restaurant = new Restaurant(resultSet.getInt("rest_id"), resultSet.getString("rest_name"), resultSet.getString("rest_username"), resultSet.getString("rest_password"), resultSet.getInt("rest_pincode"),resultSet.getString("rest_useremail"),resultSet.getString("rest_address"));
 			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurant;
	}

	@Override
	public Restaurant findByRestaurantId(int restaurantId) {
		Restaurant restaurant = new Restaurant();
		String sql = "SELECT * FROM restaurant WHERE rest_id = ?";	
		try(PreparedStatement selectStatement = connection.prepareStatement(sql);) {
 			selectStatement.setInt(1, restaurantId);
 			try(ResultSet resultSet = selectStatement.executeQuery();){
 				if(resultSet.next())
 					restaurant = new Restaurant(resultSet.getInt("rest_id"), resultSet.getString("rest_name"), resultSet.getString("rest_username"), resultSet.getString("rest_password"), resultSet.getInt("rest_pincode"),resultSet.getString("rest_useremail"),resultSet.getString("rest_address"));
 			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurant;
	}
	@Override
	public void close() throws IOException {
		try {
			System.out.println("close");
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
