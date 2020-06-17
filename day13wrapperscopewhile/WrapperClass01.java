package day13wrapperscopewhile;

public class WrapperClass01 {

	public static void main(String[] args) {

		int i = Integer.MAX_VALUE;
		System.out.println(i);

		i = Integer.compare(12, 12); // 0 numbers are equal
		System.out.println(i);

		i = Integer.compare(12, 15); // -1 first number is smaller than second
		System.out.println(i);

		i = Integer.compare(15, 12); // 1 first number is greater than second
		System.out.println(i);

		boolean bl = Boolean.valueOf(2 < 1);
		System.out.println(bl); // false

		char ch = Character.toTitleCase('0');
		System.out.println(ch);
	}

}
