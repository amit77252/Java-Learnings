import java.io.*;
import java.util.Scanner;
 
class Test {
    public static void main(String[] args)
    {
	
//integer data type in java 
	//int x= 10;
	//int y= 010;
	//int z= 0X10;
	//System.out.println(+x+"..."+y+"..."+z);
      
/*Byte and Short data type*/
		//byte b = 10;
		//byte b = 128;
		//System.out.println(b);
		
/*Float & double data type*/

	//float f =  123.456f;
	//double f = 123.456;
	//System.out.println(f);
	
	//double d = 123.456d;
	//double d = 0123.456;
	//double d = 0x123.456;
	//double d = 0786; /* Invalid*/
	//double d = 0xFace; /* Number assigned in octal form to double is valid*/
	//double d = 0786.0; /* higher number of int is valid in double type*/
	//System.out.println(d);
	
/* We can't assign floating point literals to int type*/
	//double d = 10; valid
	// int x = 10; invalid
/* Assigning exponential values in double*/
		/*double d = 1.2e3;
		System.out.println(d);*/
		/* We can specify floating point literal even in exponential form (Scientific notation)*/
		//float f = 1.2e3; Invalid
		//float f = 1.2e3F Valid
		
/* Boolean literals*/

		// True or False
		//boolean b = true;
		//System.out.println(b);
		
/* int x = 10;
System.out.println("The Value of x is "+x);
*/

		// Local Variables|Temporary |Stack | Automatic variables
		// Local variables will be stored in the stack memory
		
		/*
		//int x;
		//System.out.println("Hello");
		
		int x;
		System.out.println(x);
		
		*/
		
		/*
		int x;
		if(args.length >0)
		{
			x=10;
		}
		System.out.println(x);
		
		Test.java:70: error: variable x might not have been initialized
                System.out.println(x);
				*/
		
		//Operators & Assignment
		//Incremental Operators
		/*
		int x = 10;
		int y = ++;
		//int y = ++ (++x); //CE: VALUE
		System.out.println(y);
		*/
		/*
		int x = 10;
		x = 11;
		System.out.println(x);
		*/
		
		/* Typecasting
		byte a = 10;
		byte b = 20;
		//byte c = a+b; // CE max(int,byte,byte)
		
		byte c = (byte)(a+b);  // Typecasting
		System.out.println(c);
		
		*/
		
		/*
		byte + byte = int
		byte + short = int
		short + short = int
		byte + long = long
		long + double = double
		float + long = float
		char + char = int
		char + double = double
		
		byte -->short-->
						int-->long-->float-->double
				char--->
		*/
		
    }
}