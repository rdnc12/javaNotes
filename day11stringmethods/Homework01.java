package day11stringmethods;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his kid’s name, if the name contains “a” output will be
		 * “This name contains ‘a’.” if the name contains “z” output will be “This name
		 * contains ‘z’.” Otherwise, output will be “This name contains neither ‘a’ nor
		 * ‘z’.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = sc.next();

		if (name.contains("a")) {
			System.out.println("This name contains a");
		}
		
		if (name.contains("z")) {
			System.out.println("This name contains z");
		} else {

			System.out.println("This name contains neither a nor z");
		}
	
		sc.close();

	}

}
