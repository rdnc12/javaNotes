package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter gender and age If the gender is male and age is les than 20
		 * print Boy otherwise print man on the console if the gender is female and the
		 * age is less than 20 print Girl otherwise print Woman
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter your gender");
		// if you want to convert all characters in a string
		// to lower case use toLowerCase()
		// if you want to convert all characters in a string
		// to upper case use toUpperCase()
		// String gender = sc.next().toLowerCase();
		String gender = sc.next();
		System.out.println("Please, enter your age");
		int age = sc.nextInt();

		if (gender.equalsIgnoreCase("male")) {
			if (age < 20) {
				System.out.println("Boy");
			} else {
				System.out.println("Man");
			}

		} else if (gender.equalsIgnoreCase("female")) {
			if (age < 20) {
				System.out.println("Girl");
			} else {
				System.out.println("Woman");
			}

		} else {
			System.out.println("Undefined gender");
		}

		sc.close();
	}

}
