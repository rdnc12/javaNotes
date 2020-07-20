package day36interfacesiterators;
/*
 * 1) When you create an object you can select data type ofthe object from the class itself and from all parents.
2) If you have interface parent, select the data type from it. Because it will make your code more flexible
3) When you create an object youcannot use constructors from interfaces but it is fine to use data types from interfaces*/
public interface Carnivorous {
	void eat();
}
