package day29overriding;

public class Dog extends Animal {

	public static void main(String[] args) {
		

	}
	public void sound() {
		System.out.println("Bark bark bark!!!!");
	}
	
	/*
	 * This annotation tells to Java, i will do override and do it this way.
	 * It is a message to Java.
	 * If we kill the connection between Animal and Dog, Java will complaining.*/
	
	@Override // Override annotation
	public void eat() {
		System.out.println("Dog eats meat.");
	}

}
