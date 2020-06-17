package day13wrapperscopewhile;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// Type a java code by using while loop,
		// Write a program that prompts the user input a positive integer
		// It should then print factorial of that number

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a positive integer");

		int num = scan.nextInt();
		int i = 1;
		int fact = 1;

		while (i < num) {
			fact = i * num;
			i++;
		}
		System.out.println("Factorial of " + num + " is " + fact);
		scan.close();

	}

}
