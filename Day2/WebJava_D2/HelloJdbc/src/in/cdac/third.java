package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class third {
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
	
	
	
	public static void insertUser(User user)
	{
	 
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
			String sql="insert into user(username,password,email)values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,user.getUsername());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getEmail());
			ps.executeUpdate();
			
			System.out.println("user added");
			

		
			con.close();		
			
		}
		catch(Exception e) {
			 e.printStackTrace();
			}
		
	}
	public static void updateUser(User user)
	{
	 
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
		
			String sql="update user set username=?,email=? where id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
		ps.setString(1,user.getUsername());
			
		ps.setString(2, user.getEmail());
			
			
			ps.setInt(3, 1);
			ps.executeUpdate();
			
			
			System.out.println("update successfully");
			

		
			con.close();		
			
		}
		catch(Exception e) {
			 e.printStackTrace();
			}
		
	}
	
	
	public static void deleteuser(User user)
	{
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
		String sql="delete from user where id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,user.getId()); // value of id==2 record
		
			ps.executeUpdate();
			
			System.out.println("delete successfully!!!!");
			

		}
		catch(Exception e) {
			 e.printStackTrace();
			}
		
	}
	
	
	
	
	public static void main(String[] args) {
		User user =new User();
		user.setId(1);
		user.setUsername("TVM2");
		user.setEmail("tvm@gmail");
		user.setPassword("tvm123");
		//readAllUser();
	//insertUser(user);
//	updateUser(user);
		deleteuser(user);
	}

}
