package javaconcepts;

import java.util.Scanner;

public class StringExamples {
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("input is :");
		
		StringExamples obj = new StringExamples();
		int length =obj.getStringLength(input);
		System.out.println(length);
		
	}
		
	
	public int getStringLength(String a) 
	{
	int length = a.length();
		return length;	
	}
}
