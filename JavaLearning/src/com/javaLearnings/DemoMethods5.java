/*Program to read 6 Subjects marks and display
 * totMarks, Percentage, Grade
 */
package com.javaLearnings;
import java.util.Scanner;

class totMarks{
	int add(int s1, int s2, int s3, int s4, int s5, int s6) {
		return s1+s2+s3+s4+s5+s6;
	}
}
class Percentage{
	float calculate(int totMarks) {
		return (float)totMarks/6; //Type Casting
	}
}
class StudentResult{
	String generate(float per) {
		if (per >=70 && per<=100) {
			return "Distiction";
		}
		else if(per>=60 && per<70) {
			return "First Class";
		}
		else if(per>=50 && per<60) {
			return "Second Class";
		}
		else if (per>=35 && per<50) {
			return "Third Class";
		}
		else {
			return "Fail";
		}
	}
}
public class DemoMethods5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Marks of Sub1:");
		int s1= s.nextInt();
		System.out.println("Enter the Marks of Sub2:");
		int s2= s.nextInt();
		System.out.println("Enter the Marks of Sub3:");
		int s3= s.nextInt();
		System.out.println("Enter the Marks of Sub4:");
		int s4= s.nextInt();
		System.out.println("Enter the Marks of Sub5:");
		int s5= s.nextInt();
		System.out.println("Enter the Marks of Sub6:");
		int s6= s.nextInt();
		
		if((s1>=0 && s1<=100)&&(s2>=0 && s2<=100)&&(s3>=0 && s3<=100)&&(s4>=0 && s4<=100)&&
				(s5>=0 && s5<=100)&&(s6>=0 && s6<=100)) {
			totMarks tr = new totMarks();
			int tMarks = tr.add(s1,s2,s3,s4,s5,s6);
			
			Percentage pr = new Percentage();
			float perc = pr.calculate(tMarks);
			
			StudentResult sr = new StudentResult();
			String res = sr.generate(perc);
			
			System.out.println("====Details====");
			System.out.println("Total Marks:"+tMarks);
			System.out.println("Percentage:"+perc);
			System.out.println("Grade:"+res);
		}
		else {
			System.out.println("Invalid Marks...");
		}

	}

}
