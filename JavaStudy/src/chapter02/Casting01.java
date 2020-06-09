package chapter02;

public class Casting01 {

	public static void main(String[] args) {
		byte a = 10;
		short b = a;
		int c = b;
		long d = c;
		float e = d;
		double f = e;
		
		System.out.println("byte : "+a);
		System.out.println("short : "+b);
		System.out.println("int : "+c);
		System.out.println("long : "+d);
		System.out.println("float : "+e);
		System.out.println("double : "+f);
		
		char moonja = 'A';
		//short number = moonja;
		int number = moonja;
		System.out.println(moonja);
		System.out.println(number);
	}

}
