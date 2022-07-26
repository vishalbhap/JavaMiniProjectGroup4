package com.cybage.dao;

import java.io.Closeable;
import java.util.List;

import com.cybage.pojo.Restaurant;
import com.cybage.pojo.User;

public interface UserDao extends Closeable{
	User findByEmail(String email);
	public int update(User user);
	public List<Restaurant> searchByArea(int pin);
	List<User>getAllUser();
	Integer deleteUser(int userId);
}
