package com.javaLearnings;
/*Program to input Basic Salary of an employee and calculate total salary
 * totSal = bSal+DA+HRA
 * DA = 61% of bSal
 * HRA = 91% of bSal
 * No employee draws Basic salary less than 10000
 */
import java.util.Scanner;
class EmployeeSal{
	float calculate(int bSal) {
		float tSal = 0.61F * bSal + 0.91F * bSal;
		return tSal;
	}
}
public class DemoMethods3 {

	public static void main(String[] args) {
		/* float bSal, DA, HRA, totSal;				//My Version
		Scanner s = new Scanner(System.in);			//Not good coding practice
		System.out.println("Enter Basic Salary of Employee:");
		bSal = s.nextFloat();
		if (bSal>10000) {
			DA = 0.61F * bSal;
			HRA =  0.91F * bSal;
			totSal = bSal + DA + HRA;
			System.out.println("Total Salary of Employee:"+totSal);
		}
		else {
			System.out.println("The salary is Invalid...");
		}*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Basic Salary of Employee:");
		int bs = s.nextInt();
		if (bs>10000) {
			EmployeeSal es = new EmployeeSal();
			float totSal = es.calculate(bs);
			System.out.println("Total Salary : "+totSal);
		}
		else {
			System.out.println("The salary is Invalid...");
		}
	}

}
