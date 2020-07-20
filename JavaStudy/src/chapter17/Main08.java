package chapter17;

public class Main08 {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		System.out.println("A,B 쓰레드 시작");
		threadA.start();   //threadA,threadB 모두 실행
		threadB.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
		threadA.work = false;  //threadB 만 실행
		System.out.println("쓰레드 A 작업 종료");

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
		threadA.work = true;  //threadA,threadB 모두 실행

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
		threadA.stop=true;   //threadA,threadB 모두 종료
		threadB.stop=true;
	}
}
