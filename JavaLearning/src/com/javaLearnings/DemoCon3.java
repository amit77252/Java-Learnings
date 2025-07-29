package com.javaLearnings;
//Program to show constructor with return type acts as normal instance method
class CTest3{
	CTest3() {
		System.out.println("==== 0 parameter constructor ====");
		
	}
	int CTest3(){
		System.out.println("==== Display from CTest() ====");
		return (234);
	}
}
public class DemoCon3 {

	public static void main(String[] args) {
		CTest3 ob = new CTest3(); // Constructor Call
		int k = ob.CTest3();
		System.out.println("The Value k: "+k);

	}

}
