package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop02 {

	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		double sum = 0;
		for (Integer el : list) {
			sum +=el;
		}
		System.out.println(sum/list.size());
		
		for (int el : list) {
			if(el % 2 == 0) {
				continue;
			}
		}
		
		System.out.println(list.toString());
	}

}
