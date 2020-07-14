package chapter11;

public class ExceptionEx02_01 {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		try {
			for(int i=0;i<=num.length;i++) {
				System.out.println(num[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds 예외 발생");
		}
	}

}
