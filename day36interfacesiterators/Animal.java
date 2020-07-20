package day36interfacesiterators;

public interface Animal {

	void eat();
	
	
	default void drink() {
		System.out.println("Woooow! concrete in an interface");
	}
}
