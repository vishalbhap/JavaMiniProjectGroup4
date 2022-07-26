package com.cybage.service;

import java.io.IOException;
import java.util.List;

import com.cybage.pojo.Restaurant;

public interface RestaurantService {
	Integer addRestaurant(Restaurant restaurant);
	List<Restaurant> allRestaurant();
	Integer deleteResaturant(int restaurantId);
	Integer updateResaturant(Restaurant restaurant);
	Restaurant findByEmailAndPassword(String email,String password);
	public Restaurant findByRestaurantId(int restaurantId);
	public void close() throws IOException ;
}
