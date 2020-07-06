package day26encapsulation;

import day27inheritance.Mammal;


public class Rabbit extends Mammal {

	public static void main(String[] args) {
		
		Rabbit r = new Rabbit();
		r.eat();
		r.drink();
		r.move();
		r.feed();
		
		System.out.println(r.breathe);
		
	}
}