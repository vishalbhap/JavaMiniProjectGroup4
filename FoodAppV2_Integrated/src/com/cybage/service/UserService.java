package com.cybage.service;

import java.util.List;

import com.cybage.pojo.Restaurant;
import com.cybage.pojo.User;

public interface UserService {
	User findByEmail(String email);
	public List<Restaurant> searchByArea(int pin);
	List<User> getAllUser();
	Integer deleteUser(int userId);
}
