package day25stringbuilders;

public class StringBuilder01 {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println(join(str));
		System.out.println(str);

		// When we update str, in heap memory Java creates updated String variable next to current value.
		// String use memory to much.
		// Solution is String Builder
		
		
		
		//1st way to create StringBuilder
		StringBuilder stb1 = new StringBuilder(); // ""
		stb1.append("A");
		System.out.println(stb1);// A
		stb1.append("a");
		System.out.println(stb1);// Ab
		
		//2nd Way to create StringBuilder
		StringBuilder stb2 = new StringBuilder("Java"); // Java
		stb2.append("X");
		System.out.println(stb2);// JavaX
		
		//3rd Way to create StringBuilder
		//If you use integer like 5 inside the constructor parentheses, it means
		//you created a String whose length is 5.
				
		//After declaring the length, it is allowed to create Strings in different lengths
		StringBuilder stb3 = new StringBuilder(5);
		stb3.append("JAVA");
		stb3.append("Xy");
		System.out.println(stb3);
	}

	public static String join(String str) {
		return str + "X";
	}

}
