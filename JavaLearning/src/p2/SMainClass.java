package p2;
import java.util.Scanner;
import static p1.Calculate.*;
public class SMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any value:");
		double x = s.nextDouble();
		double r = cal(x); //static method call
		System.out.println("The SQRT of "+x+" is "+r);
		s.close();
	}

}
