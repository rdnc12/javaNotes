package day05ifelsestatementdt;

import java.util.Scanner;

public class IfelseStatement02 {

	public static void main(String[] args) {
		// Ask user to give you a char
		// if the char is same with your initial of firstname
		// print "You got it!" on the console
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a char in uppercase");
		char initial = sc.nextLine().toUpperCase().charAt(0);
		
		if(initial == 'E') {
			System.out.println("You got it!");
		}else {
			System.out.println("Please try again.");
		}
		
		sc.close();

	}

}
