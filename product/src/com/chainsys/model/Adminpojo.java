package com.chainsys.model;

public class Adminpojo {
public static int id;
String adminname;
String adminpassword;
public static String product;
public static String model;
public static String price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
public String getAdminpassword() {
	return adminpassword;
}
public void setAdminpassword(String adminpassword) {
	this.adminpassword = adminpassword;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
@Override
public String toString() {
	return "Adminpojo [id=" + id + ", adminname=" + adminname + ", adminpassword=" + adminpassword + ", product="
			+ product + ", model=" + model + ", price=" + price + "]";
}


}