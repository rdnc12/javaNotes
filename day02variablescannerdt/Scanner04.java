package day02variablescannerdt;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 * Type a program which calculates the area and the perimeter of a rectangle
		 * whose length and with are entered by user. Hint 1: Area of a rectangle is
		 * width x length Hint 2: Perimeter of a rectangle is 2x(width + length)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width and length");
		double width = sc.nextDouble();
		double length = sc.nextDouble();
		System.out.println("Area of a rectangle is " + width * length);
		System.out.println("Perimeter of a rectangle is " + (2 * (width + length)));
		sc.close();

	}

}
