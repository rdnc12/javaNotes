package day09nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		/*
		 * Use switch statement Ask user to enter the name of a month The program should
		 * print the number of month For example March ==> 3, June ==> 6
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, give a month.");
		String month = scan.nextLine().toUpperCase();

		switch (month) {
		case "JANUARY":
			System.out.println("1 " + month);
			break;
		case "FEBRUARY":
			System.out.println("2 " + month);
			break;
		case "MARCH":
			System.out.println("3 " + month);
			break;
		case "APRIL":
			System.out.println("4 " + month);
			break;
		case "MAY":
			System.out.println("5 " + month);
			break;
		case "JUNE":
			System.out.println("6 " + month);
			break;
		case "JULY":
			System.out.println("7 " + month);
			break;
		case "AUGUST":
			System.out.println("8 " + month);
			break;
		case "SEPTEMBER":
			System.out.println("9 " + month);
			break;
		case "OCTOBER":
			System.out.println("10 " + month);
			break;
		case "NOVEMBER":
			System.out.println("11 " + month);
			break;
		case "DECEMBER":
			System.out.println("12 " + month);
			break;
		default:
			System.out.println("Wrong entry ");
		}

		scan.close();

	}

}
