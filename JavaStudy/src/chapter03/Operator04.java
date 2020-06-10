package chapter03;

public class Operator04 {

	public static void main(String[] args) {
		// 대입 연산자 - 복합 대입 연산자
		
		int a = 10;
		a = a + 10;
		System.out.println("a : " + a);
		System.out.println();
		
		int b = 10;
		b = b + 10;
		System.out.println("b : " + b);
		System.out.println();
		
		int c = 10;
		System.out.println("c : " + c);
		System.out.println("c+=5 : " + (c+=5));
		System.out.println("c-=5 : " + (c-=5));
		System.out.println("c*=5 : " + (c*=5));
		System.out.println("c/=5 : " + (c/=5));
		System.out.println("c%=3 : " + (c%=3));
	}

}
