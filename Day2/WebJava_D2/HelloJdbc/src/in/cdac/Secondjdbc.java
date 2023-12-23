package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Secondjdbc {
	public static String driver="com.mysql.cj.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/test";
	
	public static String username="root";
	public static String password="cdac";

	
	public static void readAllUser() {
	
		try {
		
			Connection con=DriverManager.getConnection(url, username, password);
			Statement stmt= con.createStatement();
			String sql="select *from user";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
			int id=	rs.getInt("id");
			String username=rs.getString("username");
			String email=rs.getString("email");
			System.out.println(id+ ""+ username+" " +email);
			}

		
	con.close();		
			
		}
		catch(Exception e) {
			 e.printStackTrace();
			}
	}
	
	
	
	public static void insertUser()
	{
	 
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
			String sql="insert into user(username,password,email)values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, "dehli");
			ps.setString(2, "delhipass");
			ps.setString(3, "delhi@gmail.com");
			ps.executeUpdate();
			
			System.out.println("user added");
			

		
			con.close();		
			
		}
		catch(Exception e) {
			 e.printStackTrace();
			}
		
	}
	public static void updateUser()
	{
	 
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
		
			String sql="update user set username=?,email=? where id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, "kerala");
			//ps.setString(2, "delhipass");
			ps.setString(2, "kerala@gmail.com");
			ps.setInt(3, 1);
			ps.executeUpdate();
			
			System.out.println("update successfully");
			

		
			con.close();		
			
		}
		catch(Exception e) {
			 e.printStackTrace();
			}
		
	}
	
	
	public static void deleteuser()
	{
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
		String sql="delete from user where id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 3); // value of id==2 record
		
			ps.executeUpdate();
			
			System.out.println("delete successfully!!!!");
			

		}
		catch(Exception e) {
			 e.printStackTrace();
			}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//readAllUser();
		//insertUser();
		//updateUser();
		deleteuser();
	}

}
