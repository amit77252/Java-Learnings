/* Program to accept rollNo, Name, branch and marks of 6 subjects and calculate
 * Total Marks
 * Percentage
 * Grade
 * Condition: If percentage >70 - Distinction
 * 60-<70- First Class
 * 50-<60- Second Class
 * 35-<50- Third Class
 * <35- Fail
 * If any subject marks <=34- Fail */
package com.javaLearnings;
import java.util.*;

class CheckBranch{

/*	boolean verify(String br) {

	return switch(br) {
	
		case "CSE": yield true;
		case "ECE": yield true;
		case "EEE": yield true;
		default: yield false;
		
		};

}*/ //Java 13 version
//Java 20 version (Java 14 onwards)
boolean verify(String br) {
    return switch (br) {
        case "CSE", "ECE", "EEE" -> true;
        default -> false;
    };
}

		
}
class TotalMarks{
int add(int s1, int s2, int s3, int s4, int s5, int s6) {
return(s1+s2+s3+s4+s5+s6);
}
}

class Percent{
float calculate(int totMarks) {
return (float) totMarks/6;//TypeCasting

}
}

class StuResult{
public String generate(float per, boolean p) {
if(p) {
return "Fail...";
}
else if(per>=70 && per<=100) {
return "Distinction";
}
else if(per>=60 && per<70) {
return "First Class";
}
else if(per>=50 && per<60) {
return "Second Class";
}
else if(per>=35 && per<50) {
return "Third Class";
}
else {
return "Fail...";
}
}

}
public class DemoMethods7 {// Main Class

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the Roll No:\n");
String rNo = s.nextLine();
int len = rNo.length();
if (len==10) {
System.out.println("Enter The Student Name:\n");
String name = s.nextLine();
System.out.println("Enter the branch (CSE/ECE/EEE)");
String br = s.nextLine();
CheckBranch cb = new CheckBranch();
boolean k = cb.verify(br);
if (k) {
System.out.println("Enter the Marks of Sub 1:\n");
int sub1 = s.nextInt();
System.out.println("Enter the Marks of Sub 2:\n");
int sub2 = s.nextInt();
System.out.println("Enter the Marks of Sub 3:\n");
int sub3 = s.nextInt();
System.out.println("Enter the Marks of Sub 4:\n");
int sub4 = s.nextInt();
System.out.println("Enter the Marks of Sub 5:\n");
int sub5 = s.nextInt();
System.out.println("Enter the Marks of Sub 6:\n");
int sub6 = s.nextInt();
boolean p = false;
if((sub1>=0 && sub1<=100)&& (sub2>=0 && sub2<=100)&& (sub3>=0 && sub3<=100)&&(sub4>=0 && sub4<=100)
&&(sub5>=0 && sub5<=100)&&(sub6>=0 && sub6<=100)) {
if(sub1<=34||sub2<=34||sub3<=34||sub4<=34||sub5<=34||sub6<=34) {
p = true;
}
TotalMarks tm = new TotalMarks();
int tMarks = tm.add(sub1,sub2,sub3,sub4,sub5,sub6);
Percent pr = new Percent();
float per = pr.calculate(tMarks);
StuResult sr = new StuResult();
String result = sr.generate(per,p);
System.out.println("==== Details ====\n");
System.out.println("Student Roll No:"+rNo);
System.out.println("Name:"+name);
System.out.println("Branch:"+br);
System.out.println("Total Marks:"+tMarks);
System.out.println("Percentage:"+per);
System.out.println("Grade:"+result);
}//end of if
else {
System.out.println("Invalid Marks...");
}
}
else {
System.out.println("Invalid Branch...");
}
}
else {
System.out.println("Invalid Roll No...");
}
}

}

