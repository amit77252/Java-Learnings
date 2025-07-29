package com.javaLearnings;
/*Program to show getter, setter method & this keyword*/
import java.util.Scanner;
class Order{
	String id, custName, prodName;
	void setid(String id) {
		this.id = id;
	}
	
	void setcustName(String custName) {
		this.custName = custName;
	}
	
	void setprodName(String prodName) {
		this.prodName = prodName;
	}
	
	String getid() {
		return id;
	}
	String getcustName() {
		return custName;
	}
	String getprodName() {
		return prodName;
	}
}
public class DemoCon6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Order o = new Order();
		
		System.out.println("Enter the order Id:");
		o.setid(s.nextLine());
		System.out.println("Enter the Customer Name:");
		o.setcustName(s.nextLine());
		System.out.println("Enter the Product Name:");
		o.setprodName(s.nextLine());
		
		System.out.println("**** Display Order Details ****");
		System.out.println("Order Id: "+o.getid());
		System.out.println("Customer Name: "+o.getcustName());
		System.out.println("Product Name: "+o.getprodName());
		
	}

}
