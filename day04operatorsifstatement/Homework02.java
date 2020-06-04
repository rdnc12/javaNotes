package day04operatorsifstatement;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		/*
		 * Type java code, if an integer is even, output will be “The integer is even”.
		 * If the integer is odd, output will be “The integer is odd”.
		 */
		int num = 34;

		if (num % 2 == 0) {
			System.out.println("The integer is even.");
		} else {
			System.out.println("The integer is odd.");
		}

		/*
		 * Type java code by using if statement. When you enter the initial of the day
		 * of a week, output should be all possible names of the days.
		 */
		// Monday Sunday Tuesday Wednesday Thursday Friday SAturday

		char initialLetterOfDay = 'S';

		if (initialLetterOfDay == 'S') {
			System.out.println("Saturday-Sunday");
		}
		if (initialLetterOfDay == 'M') {
			System.out.println("Monday");
		}

		if (initialLetterOfDay == 'T') {
			System.out.println("Tuesday");
		}

		/*
		 * Type java code by using if statement. When you enter the name of the day of a
		 * week, output will be “Weekday” or “Weekend day” according to the name of the
		 * day.
		 */

		String dayOfWeek = "Tuesday";

		if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
			System.out.println("Weekend day");
		} else {
			System.out.println("Weekday");
		}

		/*
		 * Ask user to enter the values of length and width of a rectangle, then check
		 * if it is square or not
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me the values of length and width of a rectangle");

		int length = sc.nextInt();
		int width = sc.nextInt();

		if (length == width) {
			System.out.println("It is a square.");
		}
		sc.close();
	}

}
