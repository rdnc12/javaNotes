package day08ternaryoperator;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer. If the number has 3 digits, output will be
		 * “This number has 3 digits.” Otherwise, output will be “This number has no 3
		 * digits.” How can you decide the number of digits of an integer?
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		String num = sc.next();

		String result = num.length() == 3 ? "This number has 3 digits." : "This number has no 3 digits.";

		System.out.println(result);
		
		sc.close();

	}

}
