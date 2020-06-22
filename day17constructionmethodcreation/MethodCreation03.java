package day17constructionmethodcreation;

public class MethodCreation03 {
	/*
	 If you create two methods whose names and parameters are same you will get Compile Time Error
	 To fix that problem 
	 1) You can change the names but sometimes we need the methods whose names are same. 
	 Because of that changing the names is not a good solution
	 2) The best solution is changing parameters
	    ==> To change parameters you increase or decrease the number of parameters
	    ==> Change the data type of parameters
	    ==> If the data types of parameters are different, change the order
	    
	 Note: Changing return type, changing access modifier, changing method body does not solve that problem   
	 */


	public static void main(String[] args) {
		add();
	    add(2);

	}

	public static void add() {
		System.out.println("Addition");
	}
	
	public static void add(int x) {
		System.out.println("Second addition");
	}
	
	public static void add(double x) {
		
	}
	
	public static void add(int x, boolean b) {
		
	}
	
	public static void add(boolean b, int x) {
		
	}

}
