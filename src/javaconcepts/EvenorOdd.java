package javaconcepts;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		evenOrOdd(num);

	}

	private static void evenOrOdd(int num) {
		if (num % 2 == 0)
			System.out.println("The number " + num + " is even");
		else
			System.out.println("The number " + num + " is odd");

	}

}
