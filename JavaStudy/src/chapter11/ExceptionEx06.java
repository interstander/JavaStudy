package chapter11;

public class ExceptionEx06 {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		try {
			System.out.println(num[5]/0);
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		}

	}

}
