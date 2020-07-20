package chapter17;

public class Main09 {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join();//main메소드 일시정지
		} catch (InterruptedException e) {
		}
		
		
		System.out.println("1~100까지의 합 : "+sumThread.getSum());
	}

}
