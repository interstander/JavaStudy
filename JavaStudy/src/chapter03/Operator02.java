package chapter03;

public class Operator02 {

	public static void main(String[] args) {
		// 1. 산술연산 - 단항 연산 - 증감 연산자
		int num1 = 5;
		System.out.println(++num1);
		System.out.println(++num1);
		System.out.println(num1);
		
		int num2 = 5;
		System.out.println(num2++);
		System.out.println(num2++);
		System.out.println(num2);
		
		int num3 = 5;
		System.out.println(--num3);
		System.out.println(--num3);
		System.out.println(num3);
		
		int num4 = 5;
		System.out.println(num4--);
		System.out.println(num4--);
		System.out.println(num4);
	}

}
