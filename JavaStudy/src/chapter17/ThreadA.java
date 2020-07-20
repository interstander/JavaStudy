package chapter17;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {   //stop이 true가 되면 while문 종료
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else {
				Thread.yield();// work가 false가 되면 다른 쓰레드에게 양보
			}
		}
		System.out.println("ThreadA 종료");
	}
}
