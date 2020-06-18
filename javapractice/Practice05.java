package javapractice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/*
		 * 7) Ask user to enter password, if the password is okay for the following
		 * conditions output will be “Your password is created successfully.” If the
		 * password is not okay for any of the following conditions Output will be
		 * “Enter a new password according to the give conditions” 
		 * 1.First letter must be uppercase 
		 * 2.Last letter must be lowercase 
		 * 3.Password must contain 6 characters 
		 * 
		 * 8) Ask user ta enter his/her first name, last name and Social
		 * Security Number. Then type a program which makes 
		 * a) initials of the firstname and the last name in uppercase,
		 *  other characters will be in lowercase.
		 * b) all characters except last 4 characters of the Social Security Number “ *
		 * ”. For example; Suleyman Alptekin ***5678
		 */
		
	Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a password:");
//		String password = sc.next();
//		
//		int lengthOfPass = password.length();
//		String firstCh = password.substring(0, 1);
//		String lastCh= password.substring(lengthOfPass-1,lengthOfPass);
//		
//		boolean upperCaseCheck = (firstCh == firstCh.toUpperCase());
//		boolean lowerCaseCheck = (lastCh == lastCh.toLowerCase());
//		boolean lengthCheck = (lengthOfPass == 6);
//		
//		if(upperCaseCheck && lowerCaseCheck && lengthCheck ) {
//			System.out.println("Your password is created successfully.");
//		}else {
//			System.out.println("Enter a new password according to the give conditions.");
//		}
		
		System.out.println("Q8 answer starts here....");
		System.out.println("First name");
		String fName = sc.next();
		System.out.println("Last name");
		String lName = sc.next();
		System.out.println("Social Security Number");
		String ssn = sc.next();
		
		String firstChFName = fName.substring(0, 1).toUpperCase();
		String firstChLName = lName.substring(0, 1).toUpperCase();
		String hideSsn = "***" + ssn.substring(3,ssn.length());
		
		fName = fName.replaceFirst(fName.substring(0, 1),firstChFName);
		lName = lName.replaceFirst(lName.substring(0, 1),firstChLName);
		
		System.out.println(fName + " " + lName+ " " + hideSsn);
		
		sc.close();

	}

}
