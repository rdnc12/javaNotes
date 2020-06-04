package day03scannerincrement;

public class Homework01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 15) Write a program to assign a value of 100.235 to a double variable
		// and then convert it to int. Print it on the console.

		double num1 = 100.235;

		int num2 = (int) num1;

		// System.out.println(num2);

		/*
		 * Write a program to add an integer variable having value 5 and a double
		 * variable having value 6.2. Print the sum on the console
		 */

		int num3 = 5;
		double num4 = 6.2;

		System.out.println(num3 + num4);

		/*
		 * Create an integer variable and increase it by 1, by using three different
		 * ways, then type every result on the console.
		 */

		int num5 = 9;
		// 1st way
		num5 = num5 + 1;
		// 2nd way
		num5 += 1;
		// 3rd way
		num5++;

		////////
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";

		// 61 Study-1
		System.out.println((numA * numB) + "" + (numB - numA) + " " + str1 + (numA - numB));

	}

}
