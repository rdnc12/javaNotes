package day19staticblockarray;

public class StaticBlock01 {
	
	static int i;
	static {
		int y =11;
		i = 12;
		System.out.println("1st static block");
	}
	static {
		System.out.println("2nd static block");
	}
	
	StaticBlock01(){
		System.out.println("I am a constructor");
	}

	public static void main(String[] args) {
		/*
		 * 1)Static block is a code block
		 * 2)we use Static Blocks to initialize(assigning first value) static variables
		 * 3)Static Block are executed before main, all methods and constructors
		 * 4)If you have more than one static blocks,Java runs the above one first. */

		System.out.println("I am a main method");
		StaticBlock01 obj1 = new StaticBlock01();
	}

}
