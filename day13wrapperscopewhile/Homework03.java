package day13wrapperscopewhile;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Type a java code by using while loop,
		// Write a program that prompts the user to input an integer
		// It should then find sum of the digits of that number

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");

		int number = scan.nextInt();
		int x = 0;
		int sum = 0;

		while (number > 0) {
			x = number % 10;
			sum = sum + x;
			number = number / 10;

		}
		System.out.println("Sum of the digits of that integer = " + sum);
		scan.close();

	}

}
