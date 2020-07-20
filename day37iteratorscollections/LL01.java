package day37iteratorscollections;

import java.util.LinkedList;
import java.util.List;

public class LL01 {
	// Collections
	// iterable, collection, list, queue and set are interface
	// List is an interface => ArrayList, LinkedList are a class
	// Set is an interface => HashSet, LinkedHashSet are a class

	/*
	 * 1)Linked lists do not use indexes because of that in Linked lists accessing
	 * elements directly is difficult. If you need to access to an element directly
	 * use ArrayList 2)Adding and removing elements are very fast in Linked lists.
	 * Because of that if our program will do most of the time adding and removing
	 * operations using linked list is the best way.
	 */

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();

		// add is a common method in list interface.
		llist.add("Hasan");
		llist.add("Hakki");
		llist.add("Huseyin");
		llist.add("Suleyman");

		System.out.println(llist);

		llist.add(2, "Muhyiddin");
		System.out.println(llist);

		llist.addAll(llist);
		System.out.println(llist);

		llist.remove(2);
		System.out.println(llist);
		
		llist.remove("Suleyman");
		System.out.println(llist);
		
		llist.removeAll(llist);
		System.out.println(llist);
		

	}

}
