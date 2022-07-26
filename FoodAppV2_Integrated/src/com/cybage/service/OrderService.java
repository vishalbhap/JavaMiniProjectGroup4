package com.cybage.service;

import java.util.List;

import com.cybage.pojo.OrderFood;

public interface OrderService {
	public void addOrder(OrderFood orderFood);
	public List<OrderFood> showOrders(int userId);
	public void cancelOrder(int orderId);
}
