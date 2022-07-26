package com.cybage.service;

import java.util.List;

import com.cybage.dao.OrderDao;
import com.cybage.dao.OrderDaoImpl;
import com.cybage.pojo.OrderFood;

public class OrderServiceImpl implements OrderService{
	
	private OrderDao orderDao = new OrderDaoImpl();

	@Override
	public void addOrder(OrderFood orderFood) {
		orderDao.addOrder(orderFood);
		
	}

	

	@Override
	public void cancelOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<OrderFood> showOrders(int userId) {
		return orderDao.showOrders(userId);
	}
	
}
