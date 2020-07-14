package chapter11;

public class ExceptionEx11 {

	public static void main(String[] args) {
		try {
			method1();
		}catch(MyException e) {
			String msg = e.getMessage();
			e.printStackTrace();
			System.out.println(msg + " : 사용자 정의 예외 발생");
		}
	}

	private static void method1()throws MyException {
		boolean run = true;
		if(run) {
			throw new MyException("강제로 예외 발생"); 
		}
		
	}

}
