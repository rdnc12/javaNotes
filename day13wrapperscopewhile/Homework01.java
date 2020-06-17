package day13wrapperscopewhile;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input a positive integer. It should then print the multiplication table of
		 * that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please , enter a positive integer");

		int number = scan.nextInt();

		int i = 1;

		if (number >= 0) {
			while (i <= 10) {
				System.out.println(number + " * " + i + " = " + number * i);
				i++;
			}
		} else {
			System.out.println(number + " is not positive integer.Try again!");
		}
		scan.close();

	}

}
