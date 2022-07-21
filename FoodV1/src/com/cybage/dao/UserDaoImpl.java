package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cybage.model.User;
import com.cybage.utility.JDBCUtility;

public class UserDaoImpl implements UserDao {
	Connection connection=null;
	PreparedStatement preparedStatement=null;

	@Override
	public void addUser(User user) {
		connection=JDBCUtility.getConncetion();
		try {
			 preparedStatement=connection.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
			 preparedStatement.setInt(1, user.getUserId());
			 preparedStatement.setString(2, user.getName());
			 preparedStatement.setString(3, user.getEmail());
			 preparedStatement.setString(4, user.getPassword());
			 preparedStatement.setString(5, user.getContactNo());
			 preparedStatement.setString(6, user.getGender());
			 preparedStatement.setString(7, user.getRole());
			 preparedStatement.execute();
			 connection.close();
			  System.out.println("product inserted successfully");
			  
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
