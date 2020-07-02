package day24varargsaccessmodifiersstringbuilder;

public class A {
	
	private int x = 12;
	int y = 13;// y has default access modifier.c

	public static void main(String[] args) {
		
		A obj1 = new A();
		System.out.println(obj1.x);

	}

}
