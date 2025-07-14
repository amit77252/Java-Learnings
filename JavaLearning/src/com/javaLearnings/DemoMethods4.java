package com.javaLearnings;
//Basic java program to take 3 integers as input and display highest number
import java.util.Scanner;
class Greater{
	int compare(int x, int y, int z) {
		if(x>y && x>z) {
			return x;
		}
		else if (y>x && y>z) {
			return y;
		}
		else {
			return z;
		}
	}
}
public class DemoMethods4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a = s.nextInt();
		System.out.println("Enter the value of B:");
		int b = s.nextInt();
		System.out.println("Enter the value of C:");
		int c = s.nextInt();
		if(a>0 && b>0 && c>0) {
			
		Greater gt = new Greater();
		int result = gt.compare(a,b,c);
		System.out.println("The Largest Number is :"+result);
		
		}
		else {
			System.out.println("The Values are invalid...");
		}
		s.close();
	}

}
