package chapter17;

public class Main06 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("Thread"+i);
			if(i!=10) {
				thread.setPriority(1);
			}else {
				thread.setPriority(10);
			}
			thread.start();
		}

	}

}

