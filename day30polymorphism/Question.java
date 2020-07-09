package day30polymorphism;

public class Question {
	
	public Integer add() {
		return 12;
	}
}

class Number extends Question{
	/*
	 * When you use wrapper classes as return type in overriding
	 * return types must be same otherwise you will get compile time error.
	 * We need IS-A relationship between the return type in overriding but
	 * for wrapper classes Java did not create parent-child relationship because of that
	 * you can not use different wrapper classes for return types in overriding.
	 * (There is no extends keyword in these classes.)*/
	
	public Integer add() {
		return 1;
	}
}
