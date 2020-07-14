package day32exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) throws IOException {
		/*
		 * To handle compile time exception you have 2 options
		 * 			- You can use "throws" keyword
		 * 			- You can use"try-catch" block*/
		
		/*
		 *if you use more than 1 catch block and if there is parent-child relationship between
		 *exception classes you have to use child exception class first. otherwise, you will
		 *get compile time error. */
		
		/*
		 * finally block runs under every condition. If there is exception of none
		 * finally block runs*/
		
			FileInputStream fis = null;
			
			try {
				 fis = new FileInputStream("src/day31exceptions/Untitled1");
				int i = 0;
				while((i = fis.read()) != -1) {
					System.out.print((char) i);
				}

				System.out.println();
				
				
				System.out.println(5/0);
			} catch (FileNotFoundException e) {
				System.out.println("The path is wrong or the file is not accessible");
			} catch (IOException e) {
				System.out.println("The file is not ok to read or close");
			} catch (ArithmeticException e) {
				System.out.println("Do not divide by 0");
			} finally {
				fis.close();
				System.out.println("Done");
			}
		
		
		

	}

}
