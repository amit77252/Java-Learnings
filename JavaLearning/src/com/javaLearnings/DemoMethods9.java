package com.javaLearnings;
/*Program to Read and Display User Details using Object reference as parameter
to method and return_type concept.
User Details: uName, pWord, fName, lName, city, mailId, phNo.
*/
import java.util.*;

class UserDetails{
	String uName, pWord, fName, lName, city, mailId;
	long phNo;
	
}
class RegisterUser{
	UserDetails register(Scanner s) {
		UserDetails ud = new UserDetails();
		System.out.println("Enter the User Name:");
		ud.uName = s.nextLine();
		System.out.println("Enter the User Password:");
		ud.pWord = s.nextLine();
		System.out.println("Enter the First Name:");
		ud.fName = s.nextLine();
		System.out.println("Enter the Last Name:");
		ud.lName = s.nextLine();
		System.out.println("Enter the User City:");
		ud.city = s.nextLine();
		System.out.println("Enter the User Mail Id:");
		ud.mailId = s.nextLine();
		System.out.println("Enter the User Phone No:");
		ud.phNo = s.nextLong();
		return ud;
	}
}
class DisplayUser{
	void display(UserDetails ud) {
		System.out.println("==== User Details ====\n");
		System.out.println("User Name: "+ud.uName);
		System.out.println("User Password: "+ud.pWord);
		System.out.println("User First Name: "+ud.fName);
		System.out.println("User Last Name: "+ud.lName);
		System.out.println("User City: "+ud.city);
		System.out.println("User Mail Id: "+ud.mailId);
		System.out.println("User Phone No: "+ud.phNo);
		
	}
}
public class DemoMethods9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		RegisterUser ru = new RegisterUser();
		UserDetails ud = ru.register(s);
		DisplayUser du = new DisplayUser();
		du.display(ud);

	}

}
