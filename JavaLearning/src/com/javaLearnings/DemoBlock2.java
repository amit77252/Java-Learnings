package com.javaLearnings;
//Program to show static variable memory in class
public class DemoBlock2 {
	class BTest{
		static int b;
		static {
			System.out.println("==== Sub Class Static Block ====");
			System.out.println("The Value b= "+b);
		}
		
	}

	public static void main(String[] args) {
		BTest.b =10;
		System.out.println("==== main method() ====");
		System.out.println("The value b= "+BTest.b);

	}

}
