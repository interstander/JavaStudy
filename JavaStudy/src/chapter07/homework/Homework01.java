package chapter07.homework;

public class Homework01 {

	public static void main(String[] args) {
		System.out.println("문제 1");
		Card1 card1 = new Card1(3,false);
		Card1 card2 = new Card1();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
