package chapter17;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for(int i=1;i<=2000000000;i++) {// 쓰레드가 실행할 내용
			
		}
		System.out.println(getName());
	}

}
