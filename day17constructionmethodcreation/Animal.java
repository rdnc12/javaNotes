package day17constructionmethodcreation;

public class Animal {
	int age = 7;
	String name ="Dog";
	boolean mammal;
	
	Animal(){
		this(false); // Animal(boolean mammal)
		System.out.println("No parameter");
	}
	
	Animal(boolean mammal){
		//this(); // constructor without parameter Animal()
		this(3,"Cat"); // Animal(int age, String name)
		System.out.println("boolean");
	}
	
	Animal(int age, String name){
		System.out.println("int and String");
		//this(true); // Constructor call must be the first statement in a constructor
	}

	public static void main(String[] args) {
		Animal a1 = new Animal();
		

	}

}
