package chapter03;

public class Operator03 {

	public static void main(String[] args) {
		// 1. 산술연산 - 단항 연산 - 증감 연산자
		int a = 10;
		int b = 20;
		
		int result1 = a++ * ++b;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("result1 : "+ result1);
		
		System.out.println();// 줄바꿈
		
		a = 10;
		b = 20;

		int result2 = a-- * --b;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("result2 : "+ result2);
		
	}

}
