package chapter12;

public class CloneEx02 {

	public static void main(String[] args) {
		Circle01 c1 = new Circle01(new Point01(3,5), 3.0);
		Circle01 c2 = c1.shallowCopy();
		Circle01 c3 = c1.deepCopy();
		
		System.out.println("c1 ="+c1);
		System.out.println("c2 ="+c2);
		System.out.println("c3 ="+c3);
		
		c1.p.x = 10;
		c1.p.y = 10;
		
		System.out.println("-- c1 변경후 --");
		System.out.println("c1 ="+c1);
		System.out.println("c2 ="+c2);
		System.out.println("c3 ="+c3);

	}

}
