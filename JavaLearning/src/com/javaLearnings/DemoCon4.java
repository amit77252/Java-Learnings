package com.javaLearnings;
/*Program to show passing of parameters to parameterised Constructors 
 * while Constructor call which is while object creation process
 */
class CTest4{
	CTest4(float k){
	System.out.println("==== CTest4(float k)====");
	System.out.println("The value k: "+k);
	}
	CTest4(int a, int b){
		System.out.println("====CTest4(int a, int b)====");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
	}
	void display(float c) {// instance method memory in both objects
		System.out.println("====display(c)====");
		System.out.println("The value c: "+c);
	}
}
public class DemoCon4 {

	public static void main(String[] args) {
		System.out.println("**** Object 1 ****");
		CTest4 ob1 = new CTest4(23.12F);// constructor call
		ob1.display(123.12F);// method call
		
		System.out.println("**** Object 2 ****");
		CTest4 ob2 = new CTest4(12.12F);// constructor call
		ob2.display(234.12F);// method call

	}

}
