package chapter17;

public class Main10 {

	public static void main(String[] args) {
		Calc cal = new Calc();

		User1 user1 = new User1();
		user1.setCal(cal);
		user1.start();

		User2 user2 = new User2();
		user2.setCal(cal);
		user2.start();
	}

}

