package chapter12;

public class WrapperEx02 {

	public static void main(String[] args) {
		Integer a = new Integer(100);
		Long b = new Long("100");
		
		int a1 = a.intValue();
		long b1 = b.longValue();
		System.out.println(a1);
		System.out.println(b1);

	}

}
