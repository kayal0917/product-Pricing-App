package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.dao.Adminproduct;

public class Adminconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//				        System.out.println("Enter User ID:");
//				        int userId = scanner.nextInt();
//				        scanner.nextLine(); 
//				        

	}

	public static void admininsert(String adminusername, String adminpassword)
			throws ClassNotFoundException, SQLException {
		Connection connection = Adminconnection.getConnection();
//					Scanner scanner = new Scanner(System.in);
//					 System.out.println("Enter adminuser:");
//			         adminname = scanner.next();
//
//			        System.out.println("Enter adminpassword:");
//			        String adminpassword = scanner.next();
//			        

		String insertQuery = "INSERT INTO admin (adminuser, adminpassword) VALUES (?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, adminusername);
		preparedStatement.setString(2, adminpassword);

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
