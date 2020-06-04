package day05ifelsestatementdt;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		/*
		 * Type java code by using if statement. When you enter the initial of the day
		 * of a week, output should be all possible names of the days. For example; if
		 * the initial is ’S’ output should be “Saturday or Sunday”
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial of a day in uppercases");

		// To get char from user you have to use this code
		char initialOfDay = sc.nextLine().charAt(0);

		if (initialOfDay == 'S') {
			System.out.println("Sunday or SAturday");
		}
		if (initialOfDay == 'M') {
			System.out.println("Monday");
		}
		if (initialOfDay == 'T') {
			System.out.println("Tuesday or Thursday");
		}
		if (initialOfDay == 'W') {
			System.out.println("Wednesday");
		}
		if (initialOfDay == 'F') {
			System.out.println("Friday");
		}

		sc.close();

	}

}
