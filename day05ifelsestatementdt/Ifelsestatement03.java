package day05ifelsestatementdt;

import java.util.Scanner;

public class Ifelsestatement03 {

	public static void main(String[] args) {
		//Ask user to give you the quantity of the products
		// and the unit price of the product
		// if the quantity is more than 1000, print" YOu got 10% discount"
		// and print the total price on the console
		// otherwise, print "No discount" and print the total price
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me quantity of products");
		int quantity = scan.nextInt();
		System.out.println("Give me unit price");
		int price = scan.nextInt();
		
		if(quantity>1000) {
			System.out.println("You got 10% discount");
			System.out.println("Total Price: " + (price*quantity*0.9));
		}else {
			System.out.println("You got no discount");
			System.out.println("Total Price: " + (price*quantity));
		}
		
		scan.close();

	}

}
