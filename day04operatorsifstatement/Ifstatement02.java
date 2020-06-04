package day04operatorsifstatement;

public class Ifstatement02 {

	public static void main(String[] args) {
		/*
		 * Type java code by using if-else statement, if the password is “JavaLearner”,
		 * output will be “The password is true”. Otherwise, output will be “The
		 * password is false”.
		 */

		String password = "JavaLearner";

		// Strings are in heap memory and its reference is in the
		// stack memory

		// == is used just for primitives, do not use == for string
		// For string we use equals() method

		if (password.equals("JavaLearner")) {
			System.out.println("The password is true");
		} else {
			System.out.println("The password is false");
		}

	}

}
