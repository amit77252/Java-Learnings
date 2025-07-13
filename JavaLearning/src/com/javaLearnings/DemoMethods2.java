package com.javaLearnings;
import java.util.Scanner;
public class DemoMethods2 {//Main Class. Program to read and display Product Details

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter Product ID:");
		//int prId = s.nextInt(); Exception at Runtime due to nextInt(). Start using parseInt()
		int prId = Integer.parseInt(s.nextLine());
		System.out.println("Enter Product Name:");
		String name = s.nextLine();
		System.out.println("Enter Product Price:");
		float price = s.nextFloat();
		System.out.println("Enter Product Qty:");
		int qty = s.nextInt();
		
		System.out.println("====Product Details====");
		System.out.println("Product Id: "+prId);
		System.out.println("Product Name: "+name);
		System.out.println("Product Price: "+price);
		System.out.println("Product Qty: "+qty);
		s.close();
	}

}
