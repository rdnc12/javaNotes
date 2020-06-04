package day05ifelsestatementdt;

import java.util.Scanner;

public class IfelseStatement01 {

	public static void main(String[] args) {

		// Ask user to give you an integer
		// If the integer is less than 10, print "You won" on the console
		// Otherwise, print "You lost"

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer to play");

		int a = sc.nextInt();

		// 1st way : Solve the problem by using if-else statement
		if (a < 10) {
			System.out.println("You won the game!!");
		} else {
			System.out.println("You lost the game!!!");
		}

		System.out.println("The game is finished.");

		// 2nd way: Solve the question just by using if statement
		// by using this way the condition will be checked twice
		// it means more work for java
		if (a < 10) {
			System.out.println("You won the game!!");
		}
		if (a > 10) {
			System.out.println("You lost the game!!!");
		}
		System.out.println("The game is finished.");

		sc.close();
	}

}
