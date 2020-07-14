package chapter11;

public class ExceptionEx01_01 {

	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		}catch(NullPointerException e) {
			System.out.println("NullPointer 예외 발생");
		}
	}

}
