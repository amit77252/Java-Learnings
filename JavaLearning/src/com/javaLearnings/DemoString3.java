package com.javaLearnings;
/* Program to input string, retrieve character based on Index and find out
 * the character is vowel or consonant. Program DemoString 1a.java using switch case...
 */
import java.util.*;
public class DemoString3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		int len = str.length();
		System.out.println("Enter the index to retrieve char: ");
		int index = s.nextInt();
		if(index >=0 && index <=len-1) {
			char ch = str.charAt(index);
			int j = (int)ch;// TypeCasting char to int (ASCII)
			if((j>=65 && j<=90) || (j>=97 && j<=122)){
				switch(ch){
				case 'a':
				case 'A':
					System.out.println("Character: "+ch);
					System.out.println("Vowel...");
					break;
				
				case 'e':
				case 'E':
					System.out.println("Character: "+ch);
					System.out.println("Vowel...");
					break;
					
				case 'i':
				case 'I':
					System.out.println("Character: "+ch);
					System.out.println("Vowel...");
					break;
					
				case 'o':
				case 'O':
					System.out.println("Character: "+ch);
					System.out.println("Vowel...");
					break;
				
				case 'u':
				case 'U':
					System.out.println("Character: "+ch);
					System.out.println("Vowel...");
					break;
				default:
					System.out.println("Character: "+ch);
					System.out.println("Consonent...");
					
				} //End of switch
			} //End of if
			else {
				System.out.println("Character: "+ch);
				System.out.println("Others...");
			}
		}
		else {
			System.out.println("Invalid Index...");
		}
		s.close();
	}

}
