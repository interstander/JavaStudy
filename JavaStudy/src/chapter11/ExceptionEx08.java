package chapter11;

public class ExceptionEx08 {

	public static void main(String[] args) {
		String data = "A101";    //=>   101
		try {
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 발생");
		}finally {
			System.out.println("어쨋든 실행");
		}
	}

}
