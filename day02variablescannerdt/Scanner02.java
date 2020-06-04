package day02variablescannerdt;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// get two integers from an user
		// print their sum and product on the console

		// 1st step
		Scanner scan = new Scanner(System.in);
		// 2nd step
		System.out.println("Please, enter two numbers to add and multiply");
		// 3rd step
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("The sum: " + (num1 + num2));
		System.out.println("The product: " + num1 * num2);
		System.out.println("The division: " + num1 / num2);
		scan.close();

	}

}
