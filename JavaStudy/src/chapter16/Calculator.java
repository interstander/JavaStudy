package chapter16;

public class Calculator {
	private int a;
	private int b;
	
	public Calculator(int a, int b) {
		System.out.println("a: "+a+", b: "+b+"가 입력되었습니다.");
		this.a = a;
		this.b = b;
	}
	
	public static int staticMethod(int a, int b) {
		return a+b;
	}
	
	public int instanceMethod(int a, int b) {
		return a*b;
	}
}
