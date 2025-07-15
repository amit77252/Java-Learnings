package com.javaLearnings;
/*Program to read 2 integer from user and perform artithmatic
 * operation based on user choice
 * 1. Addition, 2.Subtraction 3. Multiplication 4.Division 5. ModDivision
 * 
 */
import java.util.Scanner;
class Addition{
	int add(int x, int y) {
		return x+y;
	}
}
class Subtraction{
	int sub(int x, int y) {
		return x-y;
	}
}
class Multiplication{
	int mul(int x, int y) {
		return x*y;
	}
}
class Division{
	float div(int x, int y) {
		return x/y;
	}
}
class ModDivision{
	float modDiv(int x, int y) {
		return x%y;
	}
}
public class DemoMethods6 { //Main Class

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the First No:");
		int a = s.nextInt();
		System.out.println("Enter the Second No:");
		int b = s.nextInt();
		
		System.out.println("Enter the Choice: \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Mod Division ");
		int choice = s.nextInt();
		switch(choice){
		case 1:
			Addition add = new Addition();
			int addition = add.add(a,b);
			System.out.println("Addition:"+addition);
			break;
			
		case 2:
			Subtraction sub = new Subtraction();
			int subt = sub.sub(a,b);
			System.out.println("Subtraction:"+subt);
			break;
			
		case 3:
			Multiplication mul = new Multiplication();
			int mult = mul.mul(a,b);
			System.out.println("Multiplication:"+mult);
			break;
			
		case 4:
			Division divs =new Division();
			float divn = divs.div(a,b);
			System.out.println("Division:"+divn);
			break;
			
		case 5:
			ModDivision modDi =new ModDivision();
			float modD = modDi.modDiv(a,b);
			System.out.println("Mod Division:"+modD);
			break;
			
		default:
			System.out.println("Invalid Input...");
			
		}
			
			
		}
		
	}


