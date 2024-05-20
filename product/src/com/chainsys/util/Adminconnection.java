package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

		String insertQuery = "INSERT INTO admin (adminusername, adminpassword) VALUES (?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, adminusername);
		preparedStatement.setString(2, adminpassword);

		int rows = preparedStatement.executeUpdate();
		System.out.println(rows + " rows inserted");
	}
//	public static void update(String price) throws ClassNotFoundException, SQLException{         
//        Connection connection = Userconnection.getConnection();
//      System.out.println(connection);
//      System.out.println("Enter a price");
//      Scanner sc = new Scanner(System.in);
//      price= sc.next();
//      String save="UPDATE admin SET  price =?  WHERE id=1";
//      PreparedStatement prepareStatement = connection.prepareStatement(save);
//      prepareStatement.setString(1, price);
//      int rows = prepareStatement.executeUpdate();
//      System.out.println(rows+" updated");
//  }
//	public static void update1(String product,String model,String price) throws ClassNotFoundException, SQLException{         
//        Connection connection = Userconnection.getConnection();
//      System.out.println(connection);
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a product");
//      product= sc.next();
//      System.out.println("Enter a model");
//      model= sc.next();
//      System.out.println("Enter a price");
//      price= sc.next();
//      String save = "UPDATE admin SET product = ?, model = ?, price = ? WHERE id = 2";
//      PreparedStatement prepareStatement = connection.prepareStatement(save);
//      prepareStatement.setString(1, product);
//      prepareStatement.setString(2, model);
//      prepareStatement.setString(3, price);
//
//      int rows = prepareStatement.executeUpdate();
//      System.out.println(rows+" updated");
//  }
//	public static void update1(String product,String model,String price) throws ClassNotFoundException, SQLException{         
//        Connection connection = Userconnection.getConnection();
//      System.out.println(connection);
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a product");
//      product= sc.next();
//      System.out.println("Enter a model");
//      model= sc.next();
//      System.out.println("Enter a price");
//      price= sc.next();
//      String save = "UPDATE admin SET product = ?, model = ?, price = ? WHERE id = 1";
//      PreparedStatement prepareStatement = connection.prepareStatement(save);
//      prepareStatement.setString(1, product);
//      prepareStatement.setString(2, model);
//      prepareStatement.setString(3, price);
//
//      int rows = prepareStatement.executeUpdate();
//      System.out.println(rows+" updated");
//  }
//	public static void update1(String product,String model,String price) throws ClassNotFoundException, SQLException{         
//        Connection connection = Userconnection.getConnection();
//      System.out.println(connection);
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a product");
//      product= sc.next();
//      System.out.println("Enter a model");
//      model= sc.next();
//      System.out.println("Enter a price");
//      price= sc.next();
//      String save = "UPDATE admin SET product = ?, model = ?, price = ? WHERE id = 3";
//      PreparedStatement prepareStatement = connection.prepareStatement(save);
//      prepareStatement.setString(1, product);
//      prepareStatement.setString(2, model);
//      prepareStatement.setString(3, price);
//
//      int rows = prepareStatement.executeUpdate();
//      System.out.println(rows+" updated");
//  }
//	public static void delete() throws ClassNotFoundException, SQLException {
//        Connection connection = Userconnection.getConnection();
//        System.out.println(connection);
//        String query="DELETE from admin where id=3"; 
//        PreparedStatement prepareStatement = connection.prepareStatement(query);
//        int rows = prepareStatement.executeUpdate();
//        System.out.println(rows + " deleted");
//  }
	public static void read() throws ClassNotFoundException, SQLException{         
        Connection connection = Userconnection.getConnection();
      System.out.println(connection);
      String save="SELECT * FROM admin WHERE id='1'";
      PreparedStatement prepareStatement = connection.prepareStatement(save);
      Statement stmt = connection.createStatement();
      ResultSet rows = stmt.executeQuery(save);
      while (rows.next()) {
          String adminusername = rows.getString("adminusername");
          String adminpassword = rows.getString("adminpassword");
          String product = rows.getString("product");
          String model = rows.getString("model");
          String price = rows.getString("price");

          System.out.println("Retrieved Data");
        
      }
      System.out.println(rows+" retrieved");
  }
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productlogin", "root",
				"Jay@0917");
		return connection;

	}

}
