package chapter17;

public class WorkObject {
	public synchronized void methodA1() {
		System.out.println("ThreadA1의 methodA1() 작업 실행");
		notify();
		
			try {
				wait();
			} catch (InterruptedException e) {
			}
	}
	
	public synchronized void methodB1() {
		System.out.println("ThreadB1의 methodB1() 작업 실행");
		notify();
		
			try {
				wait();
			} catch (InterruptedException e) {
			}
	}
}
