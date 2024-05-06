package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class loginconnection {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Connection connection = getConnection();
			 Scanner scanner = new Scanner(System.in);

//		        System.out.println("Enter User ID:");
//		        int userId = scanner.nextInt();
//		        scanner.nextLine(); 

		        System.out.println("Enter username:");
		        String name = scanner.nextLine();

		        System.out.println("Enter password:");
		        String password = scanner.nextLine();

//		        Userjdbc user = new Userjdbc(userId, name,address);
//		        insertuser(name,address);
		        insertlogin(name,password);

//		        update1
//		        scanner.close();
		    }
		
		
		public static void insertlogin(String username,String password) throws ClassNotFoundException, SQLException {
	        Connection connection = loginconnection.getConnection();

	        String insertQuery = "INSERT INTO productusers (username, password) VALUES (?, ?)";
	        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
	        preparedStatement.setString(1, username);
	        preparedStatement.setString(2, password);

	        int rows = preparedStatement.executeUpdate();
	        System.out.println(rows + " rows inserted");
	    }
		

		public static Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productlogin", "root",
					"Jay@0917");
			return connection;

		}

	


	}


