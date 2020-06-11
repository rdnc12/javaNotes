package day10stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// 10)  startsWith() is for checking the initial
		// returns boolean
		
		String str = "Thursday night plans";
		System.out.println(str.startsWith("T")); // true
		System.out.println(str.startsWith("M")); // false
		// is the third index r?
		System.out.println(str.startsWith("r", 3)); // true
		System.out.println(str.startsWith("d", 6)); // false
		System.out.println(str.startsWith("day", 5)); // true
		System.out.println(str.startsWith("dty", 5)); // false

	}

}
