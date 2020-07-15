package chapter12;

public class CloneEx01 {

	public static void main(String[] args) {
		Point01 original = new Point01(3,5);
		Point01 copy = (Point01)original.clone();
		
		System.out.println(original);
		System.out.println(copy);
	}

}
