package chapter17;

public class Main02 {

	public static void main(String[] args) {
		Runnable ddong = new DingDong01();
		Thread thread = new Thread(ddong);
		thread.start();//쓰레드를 실행하는 코드

		for(int i=0;i<5;i++) {
			System.out.println("딩");
			try {
				Thread.sleep(500);
			}catch(Exception e) {

			}
		}

	}
}
