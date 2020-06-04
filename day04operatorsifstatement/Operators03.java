package day04operatorsifstatement;

import java.util.Scanner;

public class Operators03 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two integer values. Write a Java Program to swap two
		 * numbers without using the third variable.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me 2 integers to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before swaping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swaping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		sc.close();

	}

}
