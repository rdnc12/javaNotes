package day12forloop;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 * Write a program to print counting numbers which are less than 200 and
		 * divisible by 5 On the console by using for-loop.
		 */

		for (int i = 0; i < 200; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();

		/*
		 * Write a program to multiply counting numbers from 7 to 15 by using for-loop.
		 * Print the multiplication on the console
		 */
		int toplam = 1;
		for(int i=7;i<=15;i++) {
			toplam*=i;
		}
		System.out.print(toplam);

	}

}
