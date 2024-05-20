package com.chainsys.dao;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

//import com.chainsys.test.UserProduct;
import com.chainsys.util.Adminconnection;

public class Adminproduct {
	public static String adminuser1 = "kayal17";
	public static String Password1 = "123@";

    public static void login() throws ClassNotFoundException, SQLException {

		System.out.println("Welcome to Admin account");
		String adminuser1 = "kayal17";
		String Password1 = "123@";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = scanner.nextLine();

		try {
		}
		catch(InputMismatchException p) {
		System.out.println("invalid choice");
		}
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();
		if (username.equals(adminuser1) && password.equals(Password1)) {
			System.out.println("Welcome");
			Adminconnection admin1=new Adminconnection();
			admin1.admininsert(username,password);
		} 
		
		else{
			System.err.println("Please enter correct admin username and password");
		}
		
		
}
}

	   	
   
		        

		   		        		        

		
	
		
	



		
		
