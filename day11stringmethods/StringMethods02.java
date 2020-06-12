package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// 13) trim() will delete the space characters from the
		// beginning and ending of the String
		
		String str = " Java  ";
		System.out.println(str.length()); // 7 " Java  "
		
		System.out.println(str.trim().length());//4  "Java"
		
		// 14) indexOf() method
		
		str = "Java is easy";
		System.out.println(str.indexOf('a')); // 1
		System.out.println(str.indexOf("a")); // 1
		System.out.println(str.indexOf("is")); // 5
		System.out.println(str.indexOf("sw")); // -1
		System.out.println(str.indexOf("x")); // -1
		System.out.println(str.indexOf('a',4)); // 9
		
		// 15) lastIndexOf() method will return indexoflast occurenceof a ch
		
		str = "Learn java";
		System.out.println(str.lastIndexOf("a")); // 9
		System.out.println(str.lastIndexOf("ar")); // 2
		System.out.println(str.lastIndexOf('e',5)); // 1
		
		
		

	}

}
