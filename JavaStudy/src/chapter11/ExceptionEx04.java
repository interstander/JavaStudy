package chapter11;

public class ExceptionEx04 {

	public static void main(String[] args) {
		Animal animal = new Dog();

		Dog dog = (Dog)animal;
		Cat cat = (Cat)animal;
	}

}
