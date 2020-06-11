package day09nestedternary;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		/*
		 * Write a Java program user will choose answer among A, B, C, or D. If the
		 * answer is true, output will be “True.” If the answer is false, output will be
		 * “False”. Correct answer is ‘C’ for the multiple option question.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose the an answer.");
		char ans = scan.next().toUpperCase().charAt(0);
		
		switch (ans) {
		case 'A':
			System.out.println("Your answer is FALSE");
			break;
		case 'B':
			System.out.println("Your answer is FALSE");
			break;
		case 'C':
			System.out.println("Your answer is TRUE");
			break;
		case 'D':
			System.out.println("Your answer is FALSE");
			break;
		default:
			System.out.println("You didn't choose valid answer");
		}
		
		scan.close();

	}

}
