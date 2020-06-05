package day06ifelsestatement;

import java.util.Scanner;

public class IfelseIf04 {

	public static void main(String[] args) {
		/*
		 * Ask user ta enter annual salary, if the salary is more than or equal to
		 * $80.000 output will be “I accept the offer”, if the salary is between $60.000
		 * and $80.000 out put will be “I negotiate to increase”, otherwise output will
		 * be “I do not accept the offer.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your annual salary");
		double salary = scan.nextDouble();

		if (salary < 60000) {
			System.out.println("I do not accept the offer");
		} else if (salary >= 60000) {
			System.out.println("I negotiate to increase");
		} else {
			System.out.println("I accept the offer");
		}

		scan.close();
	}

}
