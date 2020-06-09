package day08ternaryoperator;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		/*
		 * ask user to enter an integer if the integer is greater than 10 print "Good"
		 * on the console Otherwise print "Bad" on the console
		 */

		// 1st way if else statement
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integer");
		int num = scan.nextInt();

		if (num > 10) {
			System.out.println("Good");

		} else {
			System.out.println("Bad");
		}

		// 2nd ternary operator
		String result = num > 10 ? "Good" : "Bad";
		System.out.println(result);

		// 3rd way
		System.out.println(num > 10 ? "Good" : "Bad");

		scan.close();

	}

}
