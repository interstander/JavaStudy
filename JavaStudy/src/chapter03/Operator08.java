package chapter03;

public class Operator08 {

	public static void main(String[] args) {
		//Short Circuit Evaluation(SCE) : 불필요한 연산  제거
		// 적용하고 싶지 않다면 & |하나만 사용
		
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println();
		
		num1 = 0;
		num2 = 0;
		
		result = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println();
		

	}

}
