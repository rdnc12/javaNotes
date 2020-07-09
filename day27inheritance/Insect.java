package day27inheritance;

public class Insect extends Animal {
	
	int b = 12;

	void m() {
		System.out.println(b);
	}
	/*
	 * 1-) When you create an object in inheritance constructors
	 * 		start to run from the parent
	 * 2-) If you call a method in inheritance look at the constructor
	 * 		to select the method
	 * 3-) Instance variables initiliaztion is done when the object
	 * 		creation is completed. Instance variables link with its
	 * 		own constructor.*/
	
	public static void main(String[] args) {
		Insect myInsect = new Insect();

	}

}
