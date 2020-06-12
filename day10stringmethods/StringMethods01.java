package day10stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// 1) length() ==> To get the number of characters in a String
		// Returns integer
		// 2) equals() ==> To check if two Strings are same or not
		// Returns boolean
		// 3) toUpperCase() ==> To convert all characters to upper case in a String
		// Returns String
		// 4) toLowerCase() ==> To convert all characters to lower case in a String
		// Returns String
		// 5) contains() ==> To check if a specific character exists in a String
		// Returns boolean
		// 6) equalsIgnoreCase() ==> To check if two Strings are same with ignoring
		// cases
		// Returns boolean
		// 7) charAt() ==> To get a character from String by using index
		// Returns char
		// 8) replace() ==> To change character(S) in a String
		// Returns updated String

		String str = "Easy, Java is Easy";
		System.out.println(str.replace('a', 'x')); //Exsy, Jxvx is Exsy
		// if you don't make assignment, original String does not change
		System.out.println(str); //Easy, Java is Easy
		// assign updated value
		str = str.replace('a', 'x');//Exsy, Jxvx is Exsy
		// in replace() we can use both char and String as parameters
		System.out.println(str.replace("x", "#")); //E#sy, J#v# is E#sy
		
		str = "Easy, Java is Easy";
		System.out.println(str.replace("Easy", "Hard")); //Hard, Java is Hard
		System.out.println(str.replace("Easy","?")); //?, Java is ?
		System.out.println(str.replace("", "/")); // /E/a/s/y/,/ /J/a/v/a/ /i/s/ /E/a/s/y/
		System.out.println(str.replace(" ","/")); // Easy,/Java/is/Easy
		System.out.println(str.replace("a", "")); // Esy, Jv is Esy
		str = "Learn java, earn money";
		System.out.println(str.replace("earn", "?")); // L? java, ? money

		// 9) replaceAll() ===> makes the same thing with the replace()
		// There are two differences between them:
		// a-) replaceAll() does not accept char as parameters
		// b-) replaceAll() accepts "regex" as parameter
		str = "Easy, Java is Easy";
		System.out.println(str.replaceAll("J", "L")); // Easy, Lava is Easy
		
		// regex stands for Regular Expressions
		String str2 = "Java 123 ?!@$_";
		
		//  \\w means all lower and uppercases, 0-9 and _
		System.out.println(str2.replaceAll("\\w", "*")); // **** *** ?!@$*
		// \\W means characters except a-z, A-Z and 0-9 and _
		System.out.println(str2.replaceAll("\\W", "*")); // Java*123*****_
		// \\d means 0-9
		System.out.println(str2.replaceAll("\\d", "#")); // Java ### ?!@$_
		System.out.println(str2.replaceAll("\\D", "#")); // #####123######
		// \\s is for whitespace
		System.out.println(str2.replaceAll("\\s", ">>")); // Java>>123>>?!@$_
		System.out.println(str2.replaceAll("\\S", "<<")); // <<<<<<<< <<<<<< <<<<<<<<<<

		
	}

}
