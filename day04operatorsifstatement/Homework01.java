package day04operatorsifstatement;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		/*
		 * Ask user ta enter a 4 digits integer, then print the sum of the first and the
		 * last digit of the number on console.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a 4 digits integer ");

		int num = sc.nextInt(); // 3457

		System.out.println("result: " + (num / 1000 + (num % 10)));

		sc.close();
	}

}
