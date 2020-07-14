package chapter11;

public class ExceptionEx09 {

	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
	}

	static void method1() throws NullPointerException{
		String data = null;
		System.out.println(data.toString());
	}

}
