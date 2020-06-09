package day08ternaryoperator;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 * Type java code by using ternary and if-else. Ask user to enter two integers
		 * Write a program to print the minimum one on the console.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer.");
		int num1 = sc.nextInt();
		System.out.println("Enter second integer.");
		int num2 = sc.nextInt();

		if (num1 >= num2) {
			System.out.println(num2);
		} else {
			System.out.println(num1);
		}

		// iternary
		System.out.println(num1 >= num2 ? num2 : num1);

		sc.close();
	}

}
