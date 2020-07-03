package day26encapsulation;

public class E02 {

	public static void main(String[] args) {
	
		E01 obj1 = new E01();
		System.out.println(obj1.retired);
		obj1.getName();
		System.out.println(obj1.getSalary());
		obj1.setSalary(90000000);
		System.out.println(obj1.getSalary());
	}

}
