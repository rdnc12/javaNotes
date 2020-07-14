package day32exception;

public class Interview {
	
	/*
	 * What is the difference between final . finally and finalize() ?
	 * 
	 * 1) final : We can use "final" keyword for 
	 * 		A) VARIABLES==> their values cannot be updated
	 * 		B) METHOD   ==> The body of final method is in its 
	 * 						final state and you cannot update the
	 * 						body of the final method. If you cannot update
	 * 						the body overriding is not meaningful. Because
	 * 						of that Java does not allow to override final methods
	 * 		C) CLASS    ==> Cannot be inherited. A final class cannot be parent 
	 * 						class or a final class cannot have child classes.
	 *  2)finally: We can use "finally" code block after try-catch block. It runs under
	            	every condition. For example; to cut connection with the cloud we can use
	            	finally code block.
	 	3)finalize(): We can use finalize() method to make the unused objects ready to be 
	               destroyed by Garbage Collector. When we call finalize() method it is 
	               not certain finalize() method will run. Java decides when and how to 
	               run finalize().                                                                    

	 * */

	

	public static void main(String[] args) {
		//A) 
		//final int x = 2;
		//x = 13;
	}

}
