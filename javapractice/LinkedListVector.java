package javapractice;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVector {
	/*
	 * What is the difference between Arraylist and LinkedList?
	 * Arraylist is better when we access the data
	 * Linkedlist is good when manipulate the data-like adding or removing
	 * Arraylist can only implement List interface but linkedlist can implement both List and Queue interfaces
	 * 
	 */
	/*
	 *1. Create a class: LinkedListVector
	 * Create an arraylist of string: arrayList
	 * and add the names: john, sam, tom, matt
	 * Remove the second value in the list
	 * Change the first value-john- with juan
	 * 
	 *2.  Create a linkedlist of string:linkedList 
	 * add the names: zoe, marry, sue, elon
	 * remove the names is there if the name contains 'n' in it
	 * 
	 * 
	 * 3. Create a Vector of list :vec
	 * And add the strings: apple, orange, banana, lettuce
	 * and remove banana from the vector
	 */

	public static void main(String[] args) {


		List<String> arrayList = new ArrayList<>();
		arrayList.add("salih");
		arrayList.add("melih");
		arrayList.add("erdinc");
		arrayList.add("tugba");
		
		//arrayList.remove(1);
		arrayList.remove("samed");
		//System.out.println(arrayList.remove("samed")); // false
		//arrayList.set(0, "juan"); // 0 index = juan
		
		System.out.println(arrayList);
		
		
		
		System.out.println("-----linkedlist------");
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("dfdsgdf");
		linkedList.add("fdgfg");
		linkedList.add("bjmhj");
		linkedList.add("hyu");
		linkedList.add("ertyuio");
		
		linkedList.removeIf(n -> (n.contains("n")==true));
		
		System.out.println(linkedList);

		Vector<String> vec = new Vector<String>();
		vec.add("kdfjnglkdjf");
		vec.add("tdfhgh");
		vec.add("dxfcgvbhn");
		vec.add("fcgvhb");
		vec.add("fghj");
		vec.remove("fghj");
		
		System.out.println(vec);
		
		
		
	}

}
