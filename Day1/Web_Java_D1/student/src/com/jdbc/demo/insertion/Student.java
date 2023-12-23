package com.jdbc.demo.insertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// load JDBC Driver
			String name ="raj";
			int age =31;
			//2 Define connection URL
			   String url="jdbc:mysql://localhost:3306/student";
				
		    Connection  con= DriverManager.getConnection(url,"root","cdac");
		 
			/*//3 Creating Statement
			
		PreparedStatement stmt =con.prepareStatement("insert into student_tble (stu_name,stu_age )values ('"+name+"',"+age+")");
				//4 Execute Queries
				int i=stmt.executeUpdate();
		if(i>0)
		{
			System.out.println("successfull");
		}
		else
			System.out.println("fail"); */
		    
		    //retriving records 
		 /*   PreparedStatement stmt= con.prepareStatement("SELECT * FROM student_tble");
		    //display record
		    ResultSet rs= stmt.executeQuery();
		    while(rs.next()) {
		    	int id=rs.getInt("id");
		    	String Sname= rs.getString("stu_name");
		    int Sage= rs.getInt("stu_age");
		    System.out.println("ID:"+id+",Name:"+Sname+",Age:"+Sage);
		    }
		    */
		    // updation
		    
		    PreparedStatement stmt= con.prepareStatement("UPDATE student_tble SET Stu_name= 'sachin' where id=2");
		    
		 int i= stmt.executeUpdate();
		 if(i>0)
		 {
			 System.out.println("updation successfull");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
			 
	//	5 Close DB connection
		con.close();
		
	} catch (Exception e)
		{
		e.printStackTrace();
	}

}}
