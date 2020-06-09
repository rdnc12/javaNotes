package day08ternaryoperator;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter a String. If the String has 2 characters, output will be
		 * “It is valid for state abbreviations” Otherwise, output will be “It is not
		 * valid for state abbreviations”
		 */

		// To get the number of chars in a String we will use length() method
		String name = "Erdinc";
		System.out.println(name.length());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine().toUpperCase();

		String result = str.length() == 2 ? "It is valid for state abbreviations"
				: "It is not\r nvalid for state abbreviations";

		System.out.println(result);
		sc.close();
	}

}
