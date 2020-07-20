package chapter17;

public class Main04 {
	public static void main(String[] args) {
		Thread thread = new DingDong02();
		thread.start();

		for(int i=0;i<5;i++) {
			System.out.println("딩");
			try {
				Thread.sleep(500);
			}catch(Exception e) {

			}
		}
	}

}

