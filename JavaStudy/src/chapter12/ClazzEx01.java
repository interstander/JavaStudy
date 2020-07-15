package chapter12;

public class ClazzEx01 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz1 = new Card02().getClass();
		Class clazz2 = Card02.class;
		Class clazz3 = Class.forName("chapter12.Card02");
		
		Card02 card1 = (Card02) clazz1.newInstance();
		Card02 card2 = (Card02) clazz2.newInstance();
		Card02 card3 = (Card02) clazz3.newInstance();
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);

	}

}
