package com.chainsys.dao;
import java.util.Scanner;

public class Userlog {


	    public static void login() {
	        String enteredUsername = inputUsername();
	        String enteredPassword = inputPassword();
	        if (isValidUser(enteredUsername, enteredPassword)) {
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Invalid username or password. Please try again.");
	        }
	    }
	    private static String inputUsername() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter username: ");
	        String username = scanner.nextLine();
	        return username;
	    }
	    public static String inputPassword() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter password: ");
	        String password = scanner.nextLine();
	        return password;
	    }
	    private static boolean isValidUser(String username, String password) {
	        String usernameRegex = "a-zA-Z0-9]"; 
	        String passwordRegex = "[a-zA-Z0-9]"; 
	        return username.matches(usernameRegex) && password.matches(passwordRegex);
	    }
	}
