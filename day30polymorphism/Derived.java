package day30polymorphism;

 public class Derived {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void getDetails(String temp) {
		System.out.println("Derived class"+ temp);
	}

}

class Test extends Derived{
	
	public void getDetails(String temp) {
		System.out.println("Test class"+ temp);
	}
	
}