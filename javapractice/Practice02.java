package javapractice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// Write a Java program and compute the sum of the digits of an integer.

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me two digits integer");
		int number = sc.nextInt();

		if (number < 100 || number < 10) {
			System.out.println("Result: " + (number / 10 + number % 10));
		} else {
			System.out.println("We only accept two digits number");
		}

		//Write a Java program to print the ascii value of a given character.

		System.out.println("Give me a character");
		int chr = sc.next().charAt(0);

		System.out.print("The ASCII value of character: ");
		System.out.print(chr);

		// Ask from user three integer values and return true
		// if one of them is 20 or less than 20 the substractions of two integers.
		// example 35 55 60 => 60-55=5 60-35=25 55-35=20 => false
		//

		System.out.println("First number");
		int num1 = sc.nextInt();
		System.out.println("Second number");
		int num2 = sc.nextInt();
		System.out.println("Third number");
		int num3 = sc.nextInt();

		int firstProcess = Math.abs(num1 - num2);
		int secondProcess = Math.abs(num1 - num3);
		int thirdProcess = Math.abs(num2 - num3);

		if (firstProcess < 20 || secondProcess < 20 || thirdProcess < 20) {
			if (firstProcess < 20) {
				System.out.println(firstProcess);
			}
			if (secondProcess < 20) {
				System.out.println(secondProcess);
			}
			if (thirdProcess < 20) {
				System.out.println(thirdProcess);
			}
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		sc.close();

	}

}
