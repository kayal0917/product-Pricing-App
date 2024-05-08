package com.chainsys.dao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Userlog {
 public static void logins() {
	 Scanner sc = new Scanner(System.in);
	 String usernameRegex = "[a-zA-Z]"; 
     String passwordRegex = "[a-zA-Z0-9]"; 
	 System.out.println("Enter your username");
	 String enteredUsername = sc.next();
	 System.out.println("Enter your password");
	 String enteredPassword = sc.next();
	 if(enteredUsername.matches(usernameRegex) && enteredPassword.matches(passwordRegex)) {
		 System.out.println(enteredUsername + enteredPassword);

	 }else {
		 System.out.println("Incorrect user");
	 }
 }
 public static String inputPassword() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter password: ");
     String password = scanner.nextLine();
     return password;
 }
 }

//	    public static void login() {
//	        String enteredUsername = inputUsername();
//	        String enteredPassword = inputPassword();
//	        String usernameRegex = "[a-zA-Z0-9]"; 
//	        String passwordRegex = "[a-zA-Z0-9]"; 
//	        if (enteredUsername.matches(usernameRegex)) {
//	            System.out.println("Login successful!");
//	        } else {
//	            System.out.println("Invalid username or password. Please try again.");
//	        }
//	    }
//	    private static String inputUsername() {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.print("Enter username: ");
//	        String username = scanner.nextLine();
//	        return inputUsername();
//	    }
	 
//	    private static boolean isValidUser(String username, String password) {
//	        String usernameRegex = "[a-zA-Z0-9]"; 
//	        String passwordRegex = "[a-zA-Z0-9]"; 
//	        return username.matches(usernameRegex) && password.matches(passwordRegex);
//	    }
//	}
