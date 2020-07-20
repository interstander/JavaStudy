package chapter17;

public class ThreadA1 extends Thread{
	private WorkObject workObject;
	
	public ThreadA1(WorkObject workObject) {
		this.workObject=workObject;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			workObject.methodA1();
		}
		System.out.println("ThreadA1 작업 종료");
	}
}
