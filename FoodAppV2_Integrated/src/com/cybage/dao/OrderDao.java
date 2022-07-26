package com.cybage.dao;

import java.util.List;

import com.cybage.pojo.OrderFood;

public interface OrderDao {
	public void addOrder(OrderFood orderFood);
	public List<OrderFood> showOrders(int userId);
	public void cancelOrder(int orderId);
	
	
}
