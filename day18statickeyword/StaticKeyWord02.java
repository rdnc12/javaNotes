package day18statickeyword;

public class StaticKeyWord02 {

	public static void main(String[] args) {
		// i = 12 ==> static and k=13==>non-static
		
		System.out.println(StaticKeyWord01.i);
		
		
		StaticKeyWord01 obj1 = new StaticKeyWord01();
		System.out.println(obj1.k );
		System.out.println(obj1.i );
		
		//As you see to access variable i(static), we did not create any object we used just the 
				//class name, but to access variable k()non-static we created on object otherwise 
				//Java did not show us variable k
				
				//You can access to a static variable by using class name(recommended),
				//You can access to a static variable by using object as well but it is not recommended
				
				//Static variables are common variables for every object because of that if you make
				//any update on a static variable all objects will see the update


	}

}
