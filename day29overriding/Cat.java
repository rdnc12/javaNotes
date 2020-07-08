package day29overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 *  Access modifier order narrow to wide
	  	private
	  	default
	  	protected
	  	public
	 * The overriding methods( inside the child class) cannot use
	 * more restricted access modifiers than overridden(inside the parent class) methods
	 * The access modifiers of overriding methods can be same with or wider than overridden method
	 * For example; if overridden method's access modifier is 'default' then overriding method's
	 * can be default, protected and public.*/	

	public void sound() {
		System.out.println("Meoooooooowww!!!!");
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eats cheese.");
	}
	
	
	/*
	 * The return type of overriding methods(inside the child class) must be 
	 * 1-) same with the return type of overridden(inside the parent class)
	 * 2-) the child of the return type of overridden(inside the parent class) */
	@Override
	public Cat drink() {
		
		return new Cat();
	}

	// default methods can be accessed from other classes if you are in the same package
	// You can override default methods, but if you are in a different package, you cannot
	// access to the default methods because of that you cannot override.
	// public and protected methods can be overridden without any issue.
	@Override
	void m2() {
		
	}

	/*
	 * If the return type of overridden method is primitive then
	 * the return type of overriding method must be same with the return type of
	 * overridden method. Because there must be "IS-A" relationship between
	 * the return type in overriding and "IS-A" relationship can be between the
	 * classes but primitives are not classes so we can not talk about "IS-A"
	 * relationship between primitives.*/
//	@Override
//	public byte add() {
//		
//		return 5;
//	}
	
	
}
