package day12forloop;

public class ForLoop02 {

	public static void main(String[] args) {
		// Print your name 20 times on the console
		for (int i = 1; i <= 10; i++) {
			System.out.println("E");
		}

		// prnt the integers from 3 to 20 on the same line
		// with a space between them

		for (int i = 3; i < 21; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		
		// prnt the integers from 20 to 3 on the same line
		// with a space between them
		for (int i = 20; i > 2; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		// print the even integers from 12 to 32 on the same line
		for (int i = 12; i <= 32; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// print the odd integers from 12 to 32 on the same line
		for (int i = 13; i <= 32; i+=2) {
			System.out.print(i + " ");
		}
		
	}

}
