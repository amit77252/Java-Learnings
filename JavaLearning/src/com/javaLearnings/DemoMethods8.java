package com.javaLearnings;

//Program to pass object reference as parameter in java

import java.util.Scanner;

class Customer{

	String id,name,mailId,city;

	long phNo;

}

class CustomerRegister{

	Customer register(Scanner s) {

		Customer ob = new Customer(); //Customer object

		System.out.println("Enter the Customer Id:");

		ob.id = s.nextLine();

		System.out.println("Enter the Name:");

		ob.name = s.nextLine();

		System.out.println("Enter the Mail Id:");

		ob.mailId = s.nextLine();

		System.out.println("Enter the City:");

		ob.city = s.nextLine();

		System.out.println("Enter the Phone No:");

		ob.phNo = Long.parseLong(s.nextLine());

		return ob;

	}

}

class DisplayCustomer{

	void display(Customer c) {

		System.out.println("==== Customer Details ====");

		System.out.println("Customer ID:"+c.id);

		System.out.println("Customer Name:"+c.name);

		System.out.println("Customer Mail ID:"+c.mailId);

		System.out.println("Customer City:"+c.city);

		System.out.println("Customer Phone No:"+c.phNo);

		

	}

}

public class DemoMethods8 {



	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		CustomerRegister rc = new CustomerRegister();

		Customer c = rc.register(s); //Object reference as parameter

		DisplayCustomer dc = new DisplayCustomer();

		dc.display(c);//Object reference as parameter



	}



}