package chapter17;

public class DingDong01 implements Runnable{

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

}
