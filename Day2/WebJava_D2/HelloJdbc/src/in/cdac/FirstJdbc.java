package in.cdac;

import java.sql.DriverManager;

public class FirstJdbc {
	public static void main (String[]args)
	{
try {
	
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/test";
	String username="root";
	String password="cdac";
	Class.forName(driver);
	DriverManager.getConnection(url, username, password);
	System.out.println("connection success");
	
}
catch(Exception e) {
 e.printStackTrace();
}

	
	}
}
