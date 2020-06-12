package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// 11) endsWith() determines whether a String ends with
		// specific character(S). it returns boolean
		
		String str = "Friday night plans"; // 18 characters
		System.out.println(str.endsWith("s")); // true
		System.out.println(str.endsWith("ans")); // true
		System.out.println(str.endsWith("m")); // false
		
		// 12 substring() extracts a specific part of a String
		// it returns String
		System.out.println(str.substring(3)); // day night plans
		System.out.println(str.substring(7)); // night plans
		System.out.println(str.substring(18)); // you get nothinh error on the console
		//Run Time Error= after running your code, you will get on the console in a red line
		//System.out.println(str.substring(30)); // gives error (runtime error)
		
		str = "Learn Java";
		System.out.println(str.substring(1,5)); // earn
		System.out.println(str.substring(6,8)); // Ja
		System.out.println(str.substring(3,3)); // nothing
		//System.out.println(str.substring(3,0)); // runtime error
		
		

	} 
	

}
