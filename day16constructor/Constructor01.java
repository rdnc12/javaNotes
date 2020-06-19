package day16constructor;

public class Constructor01 {

	// When you create a constructor Java deletes the default one
	Constructor01() {

	}

	// Create a constructor which has 1 parameter
	Constructor01(int price) {

	}

	// Create a constructor which has 2 parameters
	Constructor01(boolean b, char ch) {

	}

	// Create a constructor which has 2 parameters
	Constructor01(char ch, boolean b) {
	}

	public static void main(String[] args) {

		// 1) Constructors are used to create objects from Classes
		// 2) Constructor is not method because; a) Constructors do not have return type
		// b) Constructors name's starts with upper case
		// 3) Constructor's name must be same with the class name but methods' name may
		// be same
		// or different with the class name
		// 4) Constructors should be inside the class body
		// 5) When you create a class, Java creates a constructor for the class. The
		// constructor
		// is behind the class, it is invisible inside the class.
		// The constructor which Java created is called "default constructor"
		// The variables inside the method/constructor parentheses are called
		// "parameters"
		// Default constructors do not have any "parameter"s. I mean inside the default
		// constructor parentheses there is no any parameters.
		// 6) When you create any constructor Java deletes the default one

		// To create an object
		// Class name Object name new keyword Constructor
		Constructor01 obj1 = new Constructor01();
	}

}
