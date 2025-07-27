package com.javaLearnings;
//Program to use constructor syntax
class CTest1{
	int a = 10;
	CTest1(){
		System.out.println("==== Constructor CTest1() ====");
		System.out.println("The value a: "+a);
	}
	void display() {
		System.out.println("==== Instance Method display() ====");
		System.out.println("The value a: "+a);
	}
}
public class DemoCon1 {

	public static void main(String[] args) {
		CTest1 ob = new CTest1(); // Constructor Call (Can be called only once while object creation
		ob.display(); // calling the method
		ob.display(); // multiple times we can call the method in java

	}

}
