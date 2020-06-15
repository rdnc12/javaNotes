package day12forloop;

public class Forloop03 {

	public static void main(String[] args) {
		// print the integers which are divisible by 3
		// from 1 to 70 on the same line

		for (int i = 1; i <= 70; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		// find the sum of first 10 counting numbers and
		// print on the console
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

}
