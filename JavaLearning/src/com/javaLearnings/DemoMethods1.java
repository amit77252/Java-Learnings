//Program to read & display user details
package com.javaLearnings;
import java.util.Scanner;
public class DemoMethods1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the User Name:");
		String name = s.nextLine(); // Read the String Data
		System.out.println("Enter the Mail Id:");
		String mail = s.nextLine();
		System.out.println("Enter the Phone No:");
		long phone = s.nextLong();
		System.out.println("====User Details====");
		System.out.println("User Name :"+name);
		System.out.println("User Mail Id :"+mail);
		System.out.println("User Phone No :"+phone);
		
		s.close(); // Closed object because of warning that object never closed.
	}

}
