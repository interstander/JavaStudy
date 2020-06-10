package chapter03;

public class Operator10 {

	public static void main(String[] args) {
		//비트 연산
		
		int num1 = 3, num2 = 5;
		System.out.println("num1 & num2 : "+ (num1 & num2));
		System.out.println("num1 | num2 : "+ (num1 | num2));
		System.out.println("num1 ^ num2 : "+ (num1 ^ num2));
		System.out.println("~num1 : "+(~num1));
		System.out.println();
		
		int num3 = 3, num4 = 24;
		System.out.println("num3<<1 : " + (num3<<1));
		System.out.println("num3<<2 : " + (num3<<2));
		System.out.println("num3<<3 : " + (num3<<3));
		System.out.println();
		System.out.println("num4>>1 : " + (num4>>1));
		System.out.println("num4>>2 : " + (num4>>2));
		System.out.println("num4>>3 : " + (num4>>3));
	}

}
