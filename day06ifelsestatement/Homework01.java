package day06ifelsestatement;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 * Ask user ta enter any name of the week, then get second ,fourth, and sixth
		 * letter of the day name and print them on the console, in the same line. For
		 * example; if the user enters “Monday” output will be “ody”
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name of the week");

		String dayOfWeek = sc.nextLine().toLowerCase();

		if (dayOfWeek.equals("monday") || dayOfWeek.equals("tuesday") || dayOfWeek.equals("wednesday")
				|| dayOfWeek.equals("thursday") || dayOfWeek.equals("friday") || dayOfWeek.equals("saturday")
				|| dayOfWeek.equals("sunday")) {
			char secondCh = dayOfWeek.charAt(1);
			char fourthCh = dayOfWeek.charAt(3);
			char sixthCh = dayOfWeek.charAt(5);

			System.out.println("Result: " + secondCh + fourthCh + sixthCh);
		} else {
			System.out.println("This is not a day name.");
		}

		sc.close();

	}

}
