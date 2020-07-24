package day12forloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		// print Hello on the console 10 times

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num ==1) {
			
			System.out.println(" It is an ugly number");
		} else {

			System.out.println("It is not an ugly number");
		}

	}

}
