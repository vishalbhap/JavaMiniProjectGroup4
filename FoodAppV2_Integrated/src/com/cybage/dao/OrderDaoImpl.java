package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.pojo.OrderFood;
import com.cybage.util.DBUtil;

public class OrderDaoImpl implements OrderDao{
	
private Connection connection;
	
	public OrderDaoImpl() {
		try {
			this.connection = DBUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addOrder(OrderFood orderFood) {
		String sql = "INSERT INTO orderFood (userId,foodId,orderStatus,deliveryAddress,bill) VALUES(?,?,?,?,?)";
		try( PreparedStatement insertStatement = connection.prepareStatement(sql)) {
			insertStatement.setInt(1, orderFood.getUserId());
			insertStatement.setInt(2, orderFood.getFoodId());
			insertStatement.setString(3, orderFood.getOrderStatus());
			insertStatement.setString(4, orderFood.getDeliveryAddress());
			insertStatement.setInt(5, orderFood.getBill());
			insertStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<OrderFood> showOrders(int userId) {
		
		List<OrderFood> orderList = new ArrayList<OrderFood>();
//		System.out.println("Vishal");
			try {
				
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from orderFood where userId = "+userId);			
				

				while(resultSet.next()) {
					OrderFood orderFood = new OrderFood();
					orderFood.setOrderId(resultSet.getInt(1));
					orderFood.setOrderStatus(resultSet.getString(2));			
					orderFood.setBill(resultSet.getInt(3));
					orderFood.setDeliveryAddress(resultSet.getString(4));
					orderFood.setFoodId(resultSet.getInt(5));
					orderFood.setUserId(resultSet.getInt(6));
					orderList.add(orderFood);
					System.out.println(orderFood);						
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return orderList;
	}

	@Override
	public void cancelOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}

}
