package com.javaLearnings;
// Program showing use of this keyword holding object ref of current running class
import java.util.Scanner;
class User {// instance variable memory in object
	String name, mailId;
	long phNo;

//local variable memory in method
User(String name, String mailId, long phNo){
	this.name = name;
	this.mailId = mailId;
	this.phNo = phNo;
}
void getUser(){//Getter Method
	System.out.println("==== User Details ====");
	System.out.println("User Name: "+name);
	System.out.println("User Mail Id: "+mailId);
	System.out.println("User Phone No: "+phNo);
}
}
public class DemoCon5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the User Name:");
		String uName = s.nextLine();
		System.out.println("Enter the User Mail Id:");
		String umailId = s.nextLine();
		System.out.println("Enter the Phone No:");
		long uphNo = s.nextLong();
		User u = new User(uName, umailId, uphNo); //constructor call
		u.getUser();

	}

}
