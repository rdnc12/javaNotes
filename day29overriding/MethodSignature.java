package day29overriding;

public class MethodSignature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Method body, return type, access modifier do not make 
	 * new method with same name.
	 * Changing parameter and giving name name make new method
	 * Method signature = method name are parameter
	 * */
	
	public void add(int i) {
		System.out.println("Addition");
	}
	private void add() {
		
	}
	
	public String add(String s) {
		return s;
	}

}
