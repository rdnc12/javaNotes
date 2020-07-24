package day41maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProjectForMaps02 {
	
	
	/*
	 * 1) Create a list for color codes
	 2) Create a list for color names
	 3) Match the color codes with color names
	 4) Print code and color like lightsalmon = rbg(255,160,122)
	 Note: work with 7 colors*/

	public static void main(String[] args) {
		
		List<String> codes = new ArrayList<>();
		
		codes.add("rgb(255,160,122)");
		codes.add("rgb(250,128,114)");
		codes.add("rgb(233,150,122)");
		codes.add("rgb(240,128,128)");
		codes.add("rgb(205,92,92)");
		codes.add("rgb(255,0,0)");
		codes.add("rgb(139,0,0)");
		
		List<String> colors = new ArrayList<>();
		
		colors.add("lightsalmon");
		colors.add("salmon");
		colors.add("darksalmon");
		colors.add("lightcoral");
		colors.add("indianred");
		colors.add("red");
		colors.add("darkred");
		
		Map<String, String> colorsCodes = new TreeMap<>();
		
		colorsCodes.put(colors.get(0), codes.get(0));
		
		for(String code : codes) {
			for(String color : colors) {
				colorsCodes.put(color, code);
				continue;
			}
		}
		System.out.println(colorsCodes);

	}

}
