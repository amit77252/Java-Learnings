package com.javaLearnings;
/* Program to input string, retrive character based on Index and find out
 * the character is vowel or consonent
 */
import java.util.*;
public class DemoString2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int len = str.length();
		System.out.println("Enter the Index of String: ");
		int index = s.nextInt();
		if(index>=0 && index<len) {
			char ch = str.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'
				||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
				
				System.out.println("The Character "+ch+" is a Vowel");
			}
			else {
				System.out.println("The Character "+ch+" is a Consonent");
			}
		}
		else {
			System.out.println("Entered Index is Invalid...");
		}

	}

}
