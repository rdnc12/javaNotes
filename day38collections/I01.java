package day38collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {

		// Another usage of Iterators
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("B");
		list.add("E");
		list.add("F");
		
		System.out.println(list); // [A, C, D, B, E, F]
		
		// update the list to add x  
		
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			Object el = lit.next();
			lit.set(el + "X");
		}
		System.out.println(list);
		
		// print the elements on the console in reverse order
		
		// if you decide to use hasPrevious() and previous() methods
		// you have to use hasNext() and next() methods first to move
		// pointer to the end of the list.
		while(lit.hasPrevious()) {
			Object el = lit.previous();
			System.out.println(el);
			
		}
	}

}
