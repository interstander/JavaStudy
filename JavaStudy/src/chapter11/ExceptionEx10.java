package chapter11;

public class ExceptionEx10 {

	public static void main(String[] args) throws Exception{
		method1();
	}

	static void method1() throws NullPointerException{
		String data = null;
		System.out.println(data.toString());
	}

}
