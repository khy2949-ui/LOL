package Animals;

import common.Animal;

public class Dog extends Animal{
	
	private String bread; // 견종

	public Dog(String name, String bread) {
		super(name);
		this.bread = bread;
	}
	// DOG 클래스 전용
	public void getBread() {
		System.out.println(bread);
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
