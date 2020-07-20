package day37iteratorscollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>();
		
		list.add(21);
		list.add(22);
		list.add(23);
		System.out.println(list);
		
		// Loops cannot update a list but loops can navigate among the elements.
		for(int w : list) {
			w = w + 5;
		}
		
		System.out.println(list);
		
		//TO update a list we use Iterators.
		Iterator<Integer> it = list.iterator();
		
		// iterator has pointer before the item. hasNext() checks the item after the pointer exist or not.
		// next() moves  pointer to before the next item.
		while(it.hasNext()) {
			Object el = it.next();
			it.remove();
			
		}
		System.out.println(list);//[]
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(321);
		list1.add(322);
		list1.add(323);
		
		//Increase the value of every element by 5
		ListIterator<Integer> lit = list1.listIterator();
		
		while(lit.hasNext()) {
			Integer el = lit.next();
			lit.set(el + 5);
		}
		System.out.println(list1);
		/*
		 1)Create a list whose elements are String and every element has more than 4 characters
		 2)Make last 3 characters of every element like ***
		 3)Use ListIterator
		*/
		
		List<String> list2 = new ArrayList<>();
		list2.add("dsdf");
		list2.add("dssdgfdg");
		list2.add("dsdfsf");
		list2.add("dsddfgf");
		
		System.out.println(list2);
		ListIterator<String> slit = list2.listIterator();
		
		while(slit.hasNext()) {
			String el = slit.next();
			slit.set(el.replace(el.substring(el.length()-3), "***"));
		}
		
		System.out.println(list2);
		
		
	}

}
