package com.javaLearnings;
/*Program showing static block execution
 * static block is executed only once with highest priority
 */

public class DemoBlock1 {
	static int a= 10;
	static {
		System.out.println("==== Static Block ====");
		System.out.println("The Value a= "+a);
	}

	public static void main(String[] args) {
		System.out.println("==== Main Method() ====");
		System.out.println("The Value a= "+a);

	}

}
