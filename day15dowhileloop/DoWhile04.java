package day15dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {

		// Ask user to enter his/her first name
		// If the initial is lower case print a message like "Make the initial upper
		// case"
		// If the initial is upper case print a message like "You did it right"​

		Scanner scan = new Scanner(System.in);
		String firstName = "";

		do {
			System.out.println("Enter your first name");
			firstName = scan.next();

			if (firstName.charAt(0) >= 'a' && firstName.charAt(0) <= 'z') {
				System.out.println("Make the initial upper case");
			}

		} while (!(firstName.charAt(0) >= 'A' && firstName.charAt(0) <= 'Z'));

		System.out.println("You did it right");

		scan.close();

	}
}
