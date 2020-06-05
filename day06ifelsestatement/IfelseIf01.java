package day06ifelsestatement;

import java.util.Scanner;

public class IfelseIf01 {

	public static void main(String[] args) {
		// Ask user to enter an integer
		// If the number is greater than 0 print positive on the console
		// If the number is less than 0 print negative on the console
		// If the number is 0 print neutral on the console

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		int num = sc.nextInt();

		// if you want you can use else if() for every condition
		// if you are sure the last condition covers all other
		// possibilities, you can use just else instead of else if()
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Neutral");
		}

		sc.close();

	}

}
