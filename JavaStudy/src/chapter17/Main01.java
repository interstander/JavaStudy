package chapter17;

public class Main01 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("딩");
			try {
				Thread.sleep(500);
			}catch(Exception e) {

			}
		}

		for(int i=0;i<5;i++) {
			System.out.println("동");
			try {
				Thread.sleep(500);
			}catch(Exception e) {

			}
		}

	}

}
