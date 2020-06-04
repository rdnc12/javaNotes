package day02variablescannerdt;

import java.util.Scanner;

public class Scanner01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Scanner is used to get data from user.
		// To get data from user we have 3 steps

		// 1st step
		Scanner scan = new Scanner(System.in);

		// 2nd step
		System.out.println("Please give me an integer");

		// 3rd step
		int num = scan.nextInt();
		System.out.println(num);

	}

}
