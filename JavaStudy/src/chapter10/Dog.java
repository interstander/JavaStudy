package chapter10;

public class Dog extends Animal{

	public Dog() {
		super("개");
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
