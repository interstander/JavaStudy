package chapter12;

public class Equals2 {

	public static void main(String[] args) {
		Person01 p1 = new Person01(9507301597535L);
		Person01 p2 = new Person01(9507301597535L);
		
		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
	}

}
