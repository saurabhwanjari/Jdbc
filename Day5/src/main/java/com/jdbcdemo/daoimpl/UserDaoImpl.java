package com.jdbcdemo.daoimpl;

import com.jdbcdemo.dao.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbcdemo.connection.DbConnection;
import com.jdbcdemo.pojo.User;

public class UserDaoImpl implements UserDao {
	@Override
	public boolean addNewUser(User user)
	{
		 try (Connection con=DbConnection.getDatabaseConnection())
		 {
			 
			 PreparedStatement pst =con.prepareStatement("INSERT INTO userdata VALUES(?,?)");
			 pst.setString(1,user.getUsername());
			 pst.setString(2,user.getPassword());
			 int count=pst.executeUpdate();
			 if(count>0)
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
			 
			 
		 }				
				 
		 
		 catch(SQLException sql) {
			 System.out.println("Db connection not available"+sql);
			 return false;
		 }
		
	}

	@Override
	public boolean checkUserCredentials(User user)
	{
		
		try (Connection con=DbConnection.getDatabaseConnection())
		 {
			 
			PreparedStatement pst = con.prepareStatement("SELECT * FROM"
					+ " userdata WHERE username = ? AND password = ?");
			 pst.setString(1,user.getUsername());
			 pst.setString(2,user.getPassword());
			ResultSet rs=pst.executeQuery();
			
			 if(rs.next())
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
			 
			 
		 }				
				 
		 
			catch (SQLException sql) {
			 System.out.println("Db connection not available"+sql.toString());
			 return false;
		 }
		
		
	}

}
