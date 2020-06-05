package day06ifelsestatement;

import java.util.Scanner;

public class IfelseIf02 {

	public static void main(String[] args) {
		/*
		 * Ask user to give two integers. Type java code by using if-else if()
		 * statement, if both of the two integers are positive, output will be the sum
		 * of them. If both of the two integers are negative, output will be the
		 * multiplication of them. Otherwise; output will be “I cannot add or multiply
		 * different signed numbers”
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me first integer");
		int num1 = sc.nextInt();
		System.out.println("Give me second integer");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			System.out.println("Result: " + (num1 + num2));
		} else if (num1 < 0 && num2 < 0) {
			System.out.println("Result: " + (num1 * num2));
		} else {
			System.out.println("I can not add or multiply!");
		}

		sc.close();
	}

}
