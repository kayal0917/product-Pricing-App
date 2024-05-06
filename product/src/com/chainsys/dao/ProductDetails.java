package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.test.UserProduct;
import com.chainsys.util.Userconnection;

public class ProductDetails extends UserProduct {

	private static String address;
	public static int ONEPLUSqty;

	public void m2() throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("");

		System.out.println("Enter a number to choose a product:");
		System.out.println("1. MOBILE");
		System.out.println("2. LAPTOP");
		int choice = scan.nextInt();
		char ch = 'y';
		if (choice == 1 || choice == 2) {
			switch (choice) {
			case 1:
				String mobile = "Mobile";
				System.out.println("\n1.oneplus\n2.samsung\n3.vivo\n4.realme\n");
				int MOBILE = scan.nextInt();
				switch (MOBILE) {
				case 1:
					String model1 = "oneplus";
					System.out.println(
							"Mobile Name : OnePlus Nord CE4\n-->128GB 8GB RAM \n-->Gsm Unlocked Phone Qualcomm Snapdragon 7 Gen 3 50MP");
					System.out.println("  ");
					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y') {
						int ONEPLUSPrice = 45999;
						System.out.println("enter the quantity");
						ONEPLUSqty = scan.nextInt();
						if (ch == 'y') {
							System.out.println("Enter your payment details (cod/pay online):");
							System.out.println("");
							String payment = scan.next();

							System.out.println("Enter Your Details:");
							System.out.println(" ");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
//							System.out.println("Enter your password : ");
//							String password = scan.next();

							double priceCalculation = priceCalculation(ONEPLUSPrice, ONEPLUSqty);
							Userconnection.insertuser(name1, Userlog.inputPassword(), mobile, model1, ONEPLUSqty,
									priceCalculation, address);

							if (payment.equals("cod")) {
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					}
					if (ch == 'n')
						System.out.println("Thank you");
					break;

				case 2:
					String model2 = "samsung";

					System.out.println(
							"Mobile Name : samsung \n-->Galaxy Z Flip3 5G(SM-F711BZEEMEA)\n-->8 GB RAM, 128 GB | 256 GB Storage\n-->Dynamic AMOLED 2X Main Display");
					System.out.println("  ");

					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y') {
						int SAMSUNGPrice = 84999;
						System.out.println("enter the quantity");
						int SAMSUNGqty = scan.nextInt();
						if (ch == 'y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
//							Userlog u= new Userlog();

//							Userconnection.insertuser(name1, password, address);
//							Userconnection.insertuser(name1, password,address);
//							double priceCalculation = priceCalculation(SAMSUNGPrice, SAMSUNGqty);
							double priceCalculation = priceCalculation(SAMSUNGPrice, SAMSUNGqty);
							Userconnection.insertuser(name1, Userlog.inputPassword(), mobile, model2, SAMSUNGqty,
									priceCalculation, address);

							if (payment.equals("cod")) {
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");

						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");

				case 3:
					String model3 = "vivo";

					System.out.println(
							"Mobile Name : Vivo S18e\n-->Qualcomm Snapdragon 7 Gen 3\n-->120 Hz refresh rate 6.67-inch touchscreen ");
					System.out.println("  ");

					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y') {
						int VIVOPrice = 40000;
						System.out.println("enter the quantity");
						int VIVOqty = scan.nextInt();
//						priceCalculation(VIVOPrice, VIVOqty);
						if (ch == 'y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details:");
							System.out.println("");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
							double priceCalculation = priceCalculation(VIVOPrice, VIVOqty);
							Userconnection.insertuser(name1, Userlog.inputPassword(), mobile, model3, VIVOqty,
									priceCalculation, address);

							if (payment.equals("cod")) {
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");

				case 4:
					String model4 = "realme";

					System.out.println("Mobile Name : realme \n Ram : 6GB \n Storage : 64GB");
					System.out.println("  ");

					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y') {
						int REALMEPrice = 20;
						System.out.println("enter the quantity");
						int REALMEqty = scan.nextInt();
						if (ch == 'y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
//							Userconnection.insertuser(name1,password, address);
							double priceCalculation = priceCalculation(REALMEPrice, REALMEqty);

							Userconnection.insertuser(name1, Userlog.inputPassword(), mobile, model4, REALMEqty,
									priceCalculation, address);

							if (payment.equals("cod")) {
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N') {
						System.out.println("Thank you");

					}
					break;
				}
				break;

			case 2:
				String laptop = "laptop";

				System.out.println("\n1.lenovo\n2.hp\n3.dell\n4.asus\n5.aser");
				int LAPTOP = scan.nextInt();

				switch (LAPTOP) {
				case 1:
					String model5 = "lenovo";

					System.out.println(
							"laptop Name : lenovo \n -->IdeaPad 5i 2-in-1 Intel,\n-->35.56cms - Core Windows 11 Home 64 Single Language\n-->256 GB SSD M.2 2242 PCIe Gen4 TLC \n Yahh You Got Warrenty"
									+ warrenty + " Years");
					System.out.println("  ");

					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						int lenovoPrice = 73074;

						System.out.println("enter the quantity");
						int lenovoqty = scan.nextInt();
//						priceCalculation(lenovoPrice, lenovoqty);
						double priceCalculation = priceCalculation(lenovoPrice, lenovoqty);

						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
//							Userconnection.insertuser(name1,password, address);
							Userconnection.insertuser(name1, Userlog.inputPassword(), laptop, model5, lenovoqty,
									priceCalculation, address);
							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");
								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");

				case 2:
					String model6 = "hp";

					System.out.println(
							"laptop Name : HP Laptop 39.6 cm 15s-fq5327TU \n-->Windows 11 Home Single Language 39.6 cm (15.6) \n-->8 GB DDR4 RAM 512 GB SSD Hard drive \n-->True Vision 720p HD camera"
									+ "warrenty" + " Years");
					System.out.println("  ");

					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						int hpPrice = 56908;
						System.out.println("enter the quantity");
						int hpqty = scan.nextInt();
//						priceCalculation(hpPrice, hpqty);
						double priceCalculation = priceCalculation(hpPrice, hpqty);

						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
//							Userconnection.insertuser(name1,password, address);
							Userconnection.insertuser(name1, Userlog.inputPassword(), laptop, model6, hpqty,
									priceCalculation, address);
							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");

								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N') {
						System.out.println("Thank you");
					}
				case 3:
					String model7 = "dell";

					System.out.println(
							"laptop Name :Dell Inspiron 16 Plus\ni7-13700H \n-->RTX 4050 L, 16GB of RAM, and a 1TB SSD"
									+ "warrenty+\" Years");
					System.out.println("  ");

					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						int dellPrice = 25000;
						System.out.println("enter the quantity");
						int dellqty = scan.nextInt();
//						priceCalculation(dellPrice, dellqty);
						double priceCalculation = priceCalculation(dellPrice, dellqty);

						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
//							Userconnection.insertuser(name1,password, address);
							Userconnection.insertuser(name1, Userlog.inputPassword(), laptop, model7, dellqty,
									priceCalculation, address);
							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");

								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");

				case 4:
					String model8 = "asus";

					System.out.println(
							"laptop Name : ASUS Zenbook DUO (2024) UX8406 \n-->PDDR5x RAM and 2 TB SSD\n-->Intel® Core™ Ultra 9 processor with NPU"
									+ "warrenty" + " Years");
					System.out.println("  ");

					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {
						int asusPrice = 159990;
						System.out.println("enter the quantity");
						int asusqty = scan.nextInt();
//						priceCalculation(asusPrice, asusqty);
						double priceCalculation = priceCalculation(asusPrice, asusqty);

						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/pay online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
							// Userconnection.insertuser(name1, password,address);
							Userconnection.insertuser(name1, Userlog.inputPassword(), laptop, model8, asusqty,
									priceCalculation, address);
							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");

								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {
							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N')
						System.out.println("Thank you");
				case 5:
					String model9 = "acer";

					System.out.println(
							"laptop Name : Acer Aspire 3 14 Intel Core i3 N305\n-->512 GB, PCIe Gen3, 8 Gb/s up to 4 lanes, \n-->NVMe A314-36M"
									+ "warrenty" + " Years");
					System.out.println("  ");

					System.out.println("If you want to buy press Y/N");
					ch = scan.next().toLowerCase().charAt(0);
					if (ch == 'y' || ch == 'Y') {

						int aserPrice = 45999;
						System.out.println("enter the quantity");
						int aserqty = scan.nextInt();
//						priceCalculation(aserPrice, aserqty);
						double priceCalculation = priceCalculation(aserPrice, aserqty);

						if (ch == 'y' || ch == 'Y') {
							System.out.println("Enter your payment details (cod/online):");
							String payment = scan.next();

							System.out.println("Enter Your Details");
							System.out.println("Enter your name");
							String name1 = scan.next();
							System.out.println("Enter your address : ");
							String address = scan.next();
//							Userconnection.insertuser(name1, password,address);
							Userconnection.insertuser(name1, Userlog.inputPassword(), laptop, model9, aserqty,
									priceCalculation, address);
							if (payment.equals("cod")) {
								System.out.println("USE THIS COUPON " + coupon + " FOR WARRENTY");

								System.out.println("Pay when u get ur package from delivery person");
							} else if (payment.equals("online")) {
								System.out.println("Choose googlepay/phonepay/paytm");
								String paymentMethod = scan.next();
								System.out.println("your payment method has been selected");

							} else {
								System.out.println("choose any one of option");
							}

							System.out.println(
									"Your order has been placed successfully! Thank you for shopping with us.");
						} else if (ch == 'n' || ch == 'N') {

							System.out.println("Thank You for Contacting us.");
						}
						break;
					} else if (ch == 'n' || ch == 'N') {
						System.out.println("Thank you");

						break;
					}
				}
			}
		}

	}
}

//	public static void update1(String address) throws ClassNotFoundException, SQLException{         
//        Connection connection = Userconnection.getConnection();
//      System.out.println(connection);
//      System.out.println(address);
//      String save="UPDATE productusers SET address=covai WHERE id=8";
//      PreparedStatement prepareStatement = connection.prepareStatement(save);
//      prepareStatement.setString(1, address);
//      int rows = prepareStatement.executeUpdate();
//      System.out.println(rows+" updated");
//  }
