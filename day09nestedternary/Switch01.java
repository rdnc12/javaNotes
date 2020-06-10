package day09nestedternary;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 * If the user pressed 1, 2, 3 the program will print the number that is
		 * pressed; otherwise, program will print "Not allowed".
		 */
		int a = 2;
		// 1st Way: if-else-if()
		if (a == 1) {
			System.out.println("One");
		} else if (a == 2) {
			System.out.println("Two");
		} else if (a == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Not allowed");
		}
		// 2nd Way: switch
		switch (a) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Not allowed");
		}

	}

}
