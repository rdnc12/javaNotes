package day03ScannerIncrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		//How to get string from user
		
		// 1 step
		// instead of red underline tell Java is complainig or
		// compiled time error
		Scanner scan = new Scanner(System.in);
		
		//2nd step
		System.out.println("Please give me your first and last name");
		// 3rd step
		// if you use next, java will return just first word in the string
		// if you use nextline, java will return all strings
		String fullName = scan.next();
		System.out.println(fullName);
		scan.close();

	}

}
