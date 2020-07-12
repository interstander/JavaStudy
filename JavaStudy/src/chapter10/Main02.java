package chapter10;

public class Main02 {

	public static void main(String[] args) {
		//Animal a = new Animal();

		Dog dog1 = new Dog();
		Cat cat1 = new Cat(); 

		dog1.sound();
		cat1.sound();

		System.out.println("-------------------------------------");
		Animal animal = null; 

		animal = new Dog();
		animal.sound(); 

		animal = new Cat();
		animal.sound(); 

		System.out.println("-------------------------------------");
		//Dog d = new Animal(); 

		animalsound(new Dog());  
		animalsound(new Cat());
	}

	private static void animalsound(Animal ani) {
		ani.sound();  
	}
}



