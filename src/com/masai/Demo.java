package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mahesh";
		try {
			Connection coon=DriverManager.getConnection(url,"root","M13a1h8@");
			if(coon !=null) {
				System.out.println("connection establish");
			}
			else {
				System.out.println("connection not establish");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
