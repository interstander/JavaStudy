package chapter11;

public class ExceptionEx07 {

	public static void main(String[] args) {
//		int[] num = {1,2,3};
//		try {
//			System.out.println(num[5]/0);
//		}catch(Exception e) {     
//			System.out.println("예외 발생");
//		}catch(ArrayIndexOutOfBoundsException e) {    	//에러 발생
//			System.out.println("인덱스의 범위를 벗어났습니다.");
//		}catch(ArithmeticException e) {   				//에러 발생
//			System.out.println("0으로 나눌수 없습니다.");
//		}

		int[] num = {1,2,3};
		try {
			System.out.println(num[5]/0);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 범위를 벗어났습니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}catch(Exception e) {
			System.out.println("예외 발생");
		}

	}

}
