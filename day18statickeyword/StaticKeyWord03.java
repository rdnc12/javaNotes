package day18statickeyword;

public class StaticKeyWord03 {

	public static void main(String[] args) {
		StaticKeyWord01 obj1 = new StaticKeyWord01();
		StaticKeyWord01 obj2 = new StaticKeyWord01();
		StaticKeyWord01 obj3 = new StaticKeyWord01();
		obj1.increment();//i++ ==> i=13, k++ ==> k=14
		obj2.increment();//i++ ==> i=14, k++ ==> k=14
		obj3.increment();//i++ ==> i=15, k++ ==> k=14
		
		System.out.println(obj1.k);//14
		System.out.println(obj2.k);//14
		System.out.println(obj3.k);//14
		
		System.out.println(obj1.i);//15
		System.out.println(obj2.i);//15
		System.out.println(obj3.i);//15

		
	}

}
