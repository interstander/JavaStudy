package chapter17;

public class Main05 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("동");
					try {
						Thread.sleep(500);
					}catch(Exception e) {

					}
				}
			}

		};
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
