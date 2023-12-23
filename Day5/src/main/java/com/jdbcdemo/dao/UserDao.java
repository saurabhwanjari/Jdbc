package com.jdbcdemo.dao;
import com.jdbcdemo.pojo.User;
public interface UserDao {
	public boolean addNewUser(User user);
	public boolean checkUserCredentials(User user);

}
