package chapter08.homework;

public class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return s;
	}
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
