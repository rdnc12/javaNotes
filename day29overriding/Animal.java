package day29overriding;

public class Animal {

	public static void main(String[] args) {
		

	}

	 void sound() {
		System.out.println("Animal makes sound.");
	}
	
	public void eat() {
		System.out.println("Animal eats.");
	}
	
	/*
	 * We can use class names as return type in methods.
	 * when you use return type different from 'void' you have to use return keyword
	 * After the 'return' keyword you must type sth whose data type is matching with the return type of the method
	 * To create an object we can use 'new' keyword and 'constructor', but sometimes Java gives us different ways
	 * to create an object from a class like String str="Ali"*/
	public Animal drink() {
		return  new Animal();
	}
	
	public int add() {
		return 4;
	}
	
	// If a method is "final" it means you cannot update its body
	public final void product() {
		System.out.println("Multiplication");
	}
	
	//Java does not allow to override static methods because static methods are
	// shared by all objects so
	// 1-) no need to override
	// 2-) if a class updates the body it will affect all other classes this can
	//		cause some problems.
	public static void division() {
		System.out.println("Division");
	}
	
	// You can not access to private methods from other classes.
	// So you can not override private methods.
	private void m1() {
		System.out.println("Method 1");
	}
	
	
	
	void m2() {
		System.out.println("Method 2");
	}

}
