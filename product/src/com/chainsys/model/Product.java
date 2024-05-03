package com.chainsys.model;

public class Product {

		int productid;
		String productname;
		int productprice;
		int quantity;
		public int getProductid() {
			return productid;
		}
		public void setProductid(int productid) {
			this.productid = productid;
		}
		public String getProductname() {
			return productname;
		}
		public void setProductname(String productname) {
			this.productname = productname;
		}
		public int getProductprice() {
			return productprice;
		}
		public void setProductprice(int productprice) {
			this.productprice = productprice;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		@Override
		public String toString() {
			return "Product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
					+ ", quantity=" + quantity + "]";
		}
		public Product(int productid, String productname, int productprice, int quantity) {
			super();
			this.productid = productid;
			this.productname = productname;
			this.productprice = productprice;
			this.quantity = quantity;
		}
		
		

	}


