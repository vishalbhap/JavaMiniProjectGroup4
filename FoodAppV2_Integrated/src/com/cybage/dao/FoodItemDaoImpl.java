package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.pojo.FoodItem;
import com.cybage.util.DBUtil;

public class FoodItemDaoImpl implements FoodItemDao {
	private Connection connection;

	public FoodItemDaoImpl() {
		try {
			this.connection = DBUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<FoodItem> getFoodItemsByCategory(int restaurantId, String foodCategory) {
		List<FoodItem> foodList=new ArrayList<FoodItem>();
		FoodItem foodItem=new FoodItem();
		String sql="select * from food_menu where rest_id=? and food_category=?";
		try {
			PreparedStatement statement = this.connection.prepareStatement(sql);
			statement.setInt(1, restaurantId);
			statement.setString(2, foodCategory);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				foodItem.setFoodId(resultSet.getInt(1));
				foodItem.setFoodName(resultSet.getString(2));
				foodItem.setFoodCategory(resultSet.getString(3));
				foodItem.setPrice(resultSet.getDouble(4));
				foodItem.setOffer(resultSet.getDouble(5));
				foodList.add(foodItem);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodList;
	}
	
	public List<FoodItem> searchFood(String str) {
		String sql="SELECT * FROM food_menu WHERE food_name=? OR food_category=?;";
		List<FoodItem> showFood=new ArrayList<FoodItem>();
		int foodId=0;
		String foodName=null, foodCategory=null;
		double price=0 ,offer=0;
		try {
			PreparedStatement prepareStatement=connection.prepareStatement(sql);
			prepareStatement.setString(1, str);
			prepareStatement.setString(2, str);
			ResultSet result=prepareStatement.executeQuery();
			while(result.next()) {
				foodId=result.getInt(1);
				foodName=result.getString(2);
				foodCategory=result.getString(3);
				price=result.getDouble(4);
				offer=result.getDouble(5);
				showFood.add(new FoodItem(foodId, foodName, foodCategory, price, offer));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return showFood;
	}

	@Override
	public List<FoodItem> getFoodItemsByRestaurant(int restaurantId) {
		String sql = "select fm.food_id, fm.food_name, fm.food_category ,fm.price ,fm.offer from restaurant_menu rm inner join food_menu fm on rm.food_id = fm.food_id inner join restaurant r on rm.rest_id = r.rest_id where rm.rest_id=?";
//		FoodItem foodItem=new FoodItem();
		List<FoodItem> foodList=new ArrayList<FoodItem>();
		try(PreparedStatement statement = this.connection.prepareStatement(sql);) {
			statement.setInt(1, restaurantId);
			try(ResultSet resultSet = statement.executeQuery()){
				while(resultSet.next()) {
					foodList.add(new FoodItem(resultSet.getInt("food_id"), resultSet.getString("food_name"), resultSet.getString("food_category"), resultSet.getDouble("price"), resultSet.getDouble("offer")));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodList;
	}

	@Override
	public FoodItem findByFoodId(int foodId) {
		FoodItem foodItem=new FoodItem();
		String sql = "SELECT * FROM food_menu WHERE food_id = ?";	
		try(PreparedStatement selectStatement = connection.prepareStatement(sql);) {
 			selectStatement.setInt(1, foodId);
 			try(ResultSet resultSet = selectStatement.executeQuery();){
 				if(resultSet.next())
 					foodItem = new FoodItem(resultSet.getInt("food_id"), resultSet.getString("food_name"), resultSet.getString("food_category"), resultSet.getDouble("price"), resultSet.getDouble("offer"));
 			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodItem;
	}
	
}
