package day11stringmethods;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a word which has 4 letters and output will be inverse of
		 * the word. For example; if user enters “MARK” output will be “KRAM”
		 */

		// 1st way
		String name1 = new StringBuilder("hi").reverse().toString();
		System.out.println(name1);

		// 2nd way

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = sc.next();

		if (name.length() == 4) {
			System.out.println("" + name.charAt(3) + name.charAt(2) + name.charAt(1) + name.charAt(0));
		}else {
			System.out.println("The word is not equal 4...");
		}

	}

}
