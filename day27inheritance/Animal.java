package day27inheritance;

public class Animal {

	public boolean breathe = true;
	int a = 11;
	// private variables or methods cannot be inherited
	// Because private things cannot be accessed from other classes
	private String type = "Animal";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void m() {
		System.out.println(a);
	}

	public void eat() {
		System.out.println("They eat");
	}

	public void drink() {
		System.out.println("They drink");
	}

	public void move() {
		System.out.println("They move");
	}

}
