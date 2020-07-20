package chapter17;

public class Main07 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"번째 출력");
				try {
					Thread.sleep(2000);  //다음 실행까지 2초간의 대기 시간을 준다.
				} catch (InterruptedException e) {
				} 
		}
	}
}
