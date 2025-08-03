package com.javaLearnings;
//Program to read String and print in reverse using for loop
import java.util.Scanner;
public class DemoString2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int len = str.length();
		System.out.println("Display Forward...");
		for(int i=0;i<=len-1;i++) {
			char ch = str.charAt(i);
			System.out.println(ch+" ");
		}
		System.out.println("\nDisplay in reverse...");
		for (int i=len-1;i>=0;i--) {
			char rev = str.charAt(i);
			System.out.println(rev+" ");
		}
		s.close();
	}

}
