package day03scannerincrement;

public class TypeCasting01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// byte < short < int < long < float < double

		// to convert small data type to large data type
		// converting smail to large is easy, because of that java can do it automatic

		byte num1 = 123;
		short num2 = num1;

		// Explicit Narrrowing: if you convert large data type to small
		// you have to type the name of the small data type before the
		// variable name
		long num5 = 657;
		short num6 = (short) num5;

		short num7 = 255;
		byte num8 = (byte) num7;
		// byte => -128,127,...-1,0,1,2,....127
		// which mean byte has 256 values.
		// 255-256=-1
		System.out.println(num8);

		short num9 = 520;
		byte num10 = (byte) num9;
		// 520-256=262 262-256=6
		System.out.println(num10);

	}

}
