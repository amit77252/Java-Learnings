package com.javaLearnings;

public class DemoASCII {

	public static void main(String[] args) {
		System.out.println("==== Upper Case Letters ====");
		for(int i=65;i<=90;i++) {
			char ch = (char)i; //TypeCasting ASCII(int) to char
			System.out.println(ch+" ");
		}
		System.out.println("==== Lower Case Letters ====");
		for(int i=97;i<=122;i++) {
			char ch = (char)i; //TypeCasting ASCII(int) to char
			System.out.println(ch+" ");
		}
		System.out.println("==== Numbers ====");
		for(int i=48;i<=57;i++) {
			char ch = (char)i; //TypeCasting ASCII(int) to char
			System.out.println(ch+" ");
		}
	}

}
