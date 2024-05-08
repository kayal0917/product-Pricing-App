package com.chainsys.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.dao.Adminproduct;
import com.chainsys.dao.ProductDetails;
import com.chainsys.dao.ProductTabb;
import com.chainsys.dao.Userlog;
import com.chainsys.dao.productses;
import com.chainsys.util.Adminconnection;
import com.chainsys.util.Userconnection;

public class UserProduct extends Userlog {

	public static void main(String[] arg) throws ClassNotFoundException, SQLException {

		user();

		productses i = new productses();
		i.checking();
		i.status();
		ProductTabb t = new ProductTabb();
		t.checkings();
	}
	public static int warrenty = 5;
	public static String coupon = "SFDFDS122";

	public static void user() throws ClassNotFoundException, SQLException {
		ProductDetails p = new ProductDetails();
		Scanner sc = new Scanner(System.in);

		System.out.println("                      WELCOME TO Ash Mobiles");
		System.out.println("");
		System.out.println("Are you a Regular customer(yes/no/admin)");
		String r = sc.next();
		String r1 = "yes", r2 = "no", r3 = "admin";

		if (r.equals(r1)) {
			p.m2();
//			Userconnection.update1(p.name);
//			p.m2();
//			p.update1(address);
		} else if (r.equals(r2)) {
//			Userlog u = new Userlog();
//			u.detailss();
			Userlog.logins();
//			u.login();

			p.m2();
		} else if (r.equals(r3)) {
			Adminproduct admin = new Adminproduct();
			admin.login();
//			String adminUser = admin.adminUser();
//			String adminPassword = admin.adminPassword();
//			Adminconnection ad = new Adminconnection();
//			ad.admininsert(adminUser,adminPassword);
		}

	}

	public static double priceCalculation(int price, int quantity) {
		int totalPrice;

		totalPrice = price * quantity;

		double discount = totalPrice * 0.15;
		System.out.println("original price : " + totalPrice + " Discounted price : " + (totalPrice - discount));
		return totalPrice - discount;
	}
}
