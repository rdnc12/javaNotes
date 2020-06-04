package day04operatorsifstatement;

import java.util.Scanner;

public class Ifstatement01 {

	public static void main(String[] args) {
		// Get a number from user, if the number is positive
		// print "Positive" on the console
		// otherwise "Negative" on the console

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a integer");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Positive");
		}

		if (num < 0) {
			System.out.println("Negative");
		}

		if (num == 0) {
			System.out.println("Neither postive nor negative");
		}

		sc.close();

	}

}
