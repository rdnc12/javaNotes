package day08ternaryoperator;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 * Ask user ta enter a number. If the number is less than 10 and greater than or
		 * equal to 0, calculate its cube. Otherwise, calculate its square. Cube of a =
		 * a*a*a Square of a = a*a
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer.");
		int num1 = sc.nextInt();

		double result = num1 >= 10 && num1 == 0 ? Math.pow(num1, 3) : Math.pow(num1, 2);

		System.out.println(result);
		
		sc.close();
	}

}
