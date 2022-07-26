package com.cybage.service;

import java.io.IOException;
import java.util.List;

import com.cybage.dao.RestaurantDao;
import com.cybage.dao.RestaurantDaoImpl;
import com.cybage.pojo.Restaurant;

public class RestaurantServiceImpl implements RestaurantService{
	RestaurantDao restaurantDao = new RestaurantDaoImpl();
		
	@Override
	public Integer addRestaurant(Restaurant restaurant) {
		return restaurantDao.addRestaurant(restaurant);
	}

	@Override
	public List<Restaurant> allRestaurant() {
		return restaurantDao.allRestaurant();
	}

	@Override
	public Integer deleteResaturant(int restaurantId) {
		return restaurantDao.deleteResaturant(restaurantId);
	}

	@Override
	public Integer updateResaturant(Restaurant restaurant) {
		return restaurantDao.updateResaturant(restaurant);
	}

	@Override
	public void close() throws IOException {
		restaurantDao.close();
	}

	@Override
	public Restaurant findByEmailAndPassword(String email, String password) {
		return restaurantDao.findByEmailAndPassword(email, password);
	}

	@Override
	public Restaurant findByRestaurantId(int restaurantId) {
		return restaurantDao.findByRestaurantId(restaurantId);
	}

}
