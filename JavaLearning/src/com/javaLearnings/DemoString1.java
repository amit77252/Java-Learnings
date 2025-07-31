package com.javaLearnings;
import java.util.*;
public class DemoString1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int len = str.length();
		System.out.println("String length: "+len);
		System.out.println("String object: "+str.toString());
		System.out.println("Enter Index to display Char: ");
		int index = s.nextInt();
		if(index>=0 && index<len) {
			char ch = str.charAt(index); // getting character based on Index
			System.out.println("Char: "+ch);
		}
		else {
			System.out.println("Invalid Index entered...");
		}
		s.close();
	}

}
