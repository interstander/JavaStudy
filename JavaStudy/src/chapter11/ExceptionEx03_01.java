package chapter11;

public class ExceptionEx03_01 {

	public static void main(String[] args) {
		String data = "A101";
		try {
			int value = Integer.parseInt(data);
			System.out.println(value);
		}catch(NumberFormatException e) {
			System.out.println("NumberFormat 예외 발생");
		}
		
	}

}
