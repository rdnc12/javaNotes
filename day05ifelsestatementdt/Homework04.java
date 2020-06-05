package day05ifelsestatementdt;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// + , -, *, /, % basic calculator
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number");
		int secondNum = sc.nextInt();
		System.out.println("Enter operator sign.");
		char operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println("Result= " + (firstNum + secondNum));
			break;
		case '-':
			System.out.println("Result= " + (firstNum - secondNum));
			break;
		case '*':
			System.out.println("Result= " + (firstNum * secondNum));
			break;
		case '/':
			System.out.println("Result= " + (firstNum / secondNum));
			break;
		case '%':
			if (firstNum > secondNum) {
				System.out.println("Result= " + (firstNum % secondNum));
			} else {
				System.out.println("The first number must be greater than second number.");
			}
			break;
		default:
			System.out.println("Wrong operator!!!");
		}

		sc.close();

	}

}
