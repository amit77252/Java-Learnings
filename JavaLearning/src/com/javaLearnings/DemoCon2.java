package com.javaLearnings;
//Program showing Static Block, Instance Block and Constructor
class CTest2{
	int a = 10;
	static int b = 12;
	static {
		System.out.println("==== Static Block ====");
		System.out.println("The value b: "+b);
	}
	{
		System.out.println("==== Instance Block ====");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
	}
	CTest2(){
		System.out.println("==== Constructor CTest2() ====");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
	}
	void display() {
		System.out.println("==== Instance Method display() ====");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);

	}
}
public class DemoCon2 {

	public static void main(String[] args) {
		CTest2 ob = new CTest2(); // Constructor Call
		ob.display(); // Method call

	}

}
