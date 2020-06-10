package javapractice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance");
		double distance = sc.nextDouble();
		
		System.out.println("Give enviroment of sound");
		String environment = sc.next();

		
		if(environment.equalsIgnoreCase("air")) {
			System.out.println("Time in air:" + (distance / 1100)+" second");
		}
		if(environment.equalsIgnoreCase("water")) {
			System.out.println("Time in air:" + (distance / 4900)+" second");
		}
		if(environment.equalsIgnoreCase("steel")) {
			System.out.println("Time in air:" + (distance / 16400)+" second");
		}
		sc.close();

	}

}
