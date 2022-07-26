package com.cybage.dao;

import java.io.Closeable;
import java.util.List;

import com.cybage.pojo.Restaurant;

public interface RestaurantDao extends Closeable{
	Integer addRestaurant(Restaurant restaurant);
	List<Restaurant> allRestaurant();
	Integer deleteResaturant(int restaurantId);
	Integer updateResaturant(Restaurant restaurant);
	Restaurant findByEmailAndPassword(String email,String password);
	public Restaurant findByRestaurantId(int restaurantId);
}
