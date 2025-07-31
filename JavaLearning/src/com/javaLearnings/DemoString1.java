package com.javaLearnings;
/*Program to use string, take input and show string, length and character based on Index
of String*/
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
