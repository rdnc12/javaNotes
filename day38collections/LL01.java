package day38collections;

import java.util.Collections;
import java.util.LinkedList;

public class LL01 {

	public static void main(String[] args) {
		
		LinkedList <String> sll = new LinkedList<>();
		
		sll.add("A");
		sll.addFirst("B");
		sll.addFirst("C");
		System.out.println(sll);
		
		// addLast and add are same
		sll.addLast("D");
		sll.add("B");
		System.out.println(sll);
		
		System.out.println(sll.getFirst()); //C
		System.out.println(sll.getLast()); //B
		
		Collections.sort(sll);
		System.out.println(sll);
		
		System.out.println(sll.contains("N")); // false
		System.out.println(sll.element()); // retrieve first element but not remove
		System.out.println(sll);
		
		System.out.println(sll.get(2)); // C
		
		sll.removeFirstOccurrence("B");
		System.out.println(sll); //[A, B, C, D]

	}

}
