package chapter12;

public class TimeInfo {

	public static void main(String[] args) {
		long millTime = System.currentTimeMillis();
		long nanoTime = System.nanoTime();
		
		System.out.println("천분의 일초 : "+millTime);
		System.out.println("나노초 : "+nanoTime);

	}

}
