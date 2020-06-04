package day02variablescannerdt;

import java.util.Scanner;

public class Scanner03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Type a program which calculates the area and the perimeter of a square whose
		 * side length is entered by user. Hint 1: Area of a square is length x length
		 * Hint 2: Perimeter of a square is 4 x length
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter of perimeter length");
		double num1 = sc.nextDouble();
		System.out.println("Area of a square is " + (num1 * num1));
		System.out.println("Perimeter of a square is " + (4 * num1));

	}

}
