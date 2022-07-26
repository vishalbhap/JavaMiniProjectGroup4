package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.pojo.Cart;
import com.cybage.pojo.Restaurant;
import com.cybage.util.DBUtil;

public class CartDaoImpl implements CartDao{
	private Connection connection;
	
	public CartDaoImpl() {
		try {
			this.connection = DBUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addCart(Cart cart) {
		String sql = "INSERT INTO cart (userId,foodId) VALUES(?,?)";
		try( PreparedStatement insertStatement = connection.prepareStatement(sql)) {
			insertStatement.setInt(1, cart.getUserId());
			insertStatement.setInt(2, cart.getFoodId());	
			insertStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public List<Cart> showCart() {
		String sql = "SELECT * FROM cart";
		List<Cart> cart = new ArrayList<Cart>();
		try(PreparedStatement selectStatement = connection.prepareStatement(sql);
			ResultSet resultSet = selectStatement.executeQuery();){
			while(resultSet.next())
				cart.add(new Cart(resultSet.getInt("cartId"), resultSet.getInt("userId"), resultSet.getInt("foodId")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cart;
	}

	@Override
	public void deleteCart(int foodId) {
		String sql = "DELETE FROM cart WHERE foodId = ?";
		try(PreparedStatement deleteStatement = connection.prepareStatement(sql)) {
			deleteStatement.setInt(1, foodId);
		 deleteStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
