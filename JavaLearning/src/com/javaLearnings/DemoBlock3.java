package com.javaLearnings;
//Program to show non static block
class BTest{
	int a = 10; //Instance variable memory in object
	static int b = 10; //static variable memory in class
	{
		a++;
		b++;
		System.out.println("==== Instance Block ====\n");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
	}
}
public class DemoBlock3 {

	public static void main(String[] args) {
		System.out.println("==== Object1 ====\n");
		BTest ob1 = new BTest();
		System.out.println("==== Object2 ====");
		BTest ob2 = new BTest();
		

	}

}
