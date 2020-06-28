package chapter06;

public class Scope01 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		int result = adder(num1,num2);
		System.out.println("합계 : "+result);
	}
	private static int adder(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}

}
