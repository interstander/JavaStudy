package chapter11;

public class ExceptionEx04_01 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		try {
		Dog dog = (Dog)animal;
		Cat cat = (Cat)animal;
		}catch(ClassCastException e) {
			System.out.println("ClassCast 예외 발생");
		}
	}

}
