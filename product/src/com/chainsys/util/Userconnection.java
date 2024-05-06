package com.chainsys.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.dao.ProductDetails;
import com.chainsys.dao.Userlog;
import com.chainsys.model.Product;

public class Userconnection extends ProductDetails{

	public static Object quantity;


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Userlog u=new Userlog();
		Connection connection = getConnection();
		 Scanner scanner = new Scanner(System.in);

//	        System.out.println("Enter User ID:");
//	        int userId = scanner.nextInt();
//	        scanner.nextLine(); 

	        System.out.println("Enter Name:");
	        String name = scanner.nextLine();
	        
	        System.out.println("Enter Address:");
	        String address = scanner.nextLine();
	        System.out.println("Enter password:");
	        String password = scanner.nextLine();

	        
//	        insertuser(name,password,product,model,quantity,totalprice,address);

//	        Userjdbc user = new Userjdbc(userId, name,password, address);
//	        update1
//	        scanner.close();
	    }
	public static void quantity(int ONEPLUSqty) throws SQLException, ClassNotFoundException {
			Connection connection = loginconnection.getConnection();

	        String insertQuery = "INSERT INTO productusers  VALUES ?";
	        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
	        preparedStatement.setInt(1, ONEPLUSqty);

	        int rows = preparedStatement.executeUpdate();
	        System.out.println(rows + " rows inserted");
	}
	
	
	
	public static void insertuser(String username,String password,String product,String model1,int quantity,double totalprice,String address) throws ClassNotFoundException, SQLException {
        Connection connection = Userconnection.getConnection();
        System.out.println(username + password +product+model1+quantity+totalprice+address );
        String insertQuery = "INSERT INTO productuserss (username,password,product,model,quantity,totalprice,address) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        preparedStatement.setString(3, product);
        preparedStatement.setString(4,model1);
        preparedStatement.setInt(5, quantity);
        preparedStatement.setDouble(6, totalprice);
        preparedStatement.setString(7, address);



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
