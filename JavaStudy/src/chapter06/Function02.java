package chapter06;

public class Function02 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		int result = add(a,b);
		System.out.println("합계 : "+result);
	}

	private static int add(int a, int b) {
		int c = a+b;
		return c;
	}

}
