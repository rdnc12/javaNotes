package day06ifelsestatement;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// Ask user to enter a character, then check whether the character is alphabet
		// or not

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character..");
		char ch = sc.nextLine().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println(ch + " is in alphabet.");
		else
			System.out.println(ch + " is not in alphabet.");
		
		
		sc.close();
	}

}
