package stringprograms;

import java.util.Scanner;

public class ToCountTheNumberOfWordsInAString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		
		Scanner sc = new Scanner(System.in);
		
		String s=sc.nextLine();
		
		String[] eswar =s.trim().split("  ");
		
		System.out.println("Number of words in the String = "+eswar.length);
		
		String str="Java programming language";
	System.out.println(str.split("\\s +").length);
		
	}
}
