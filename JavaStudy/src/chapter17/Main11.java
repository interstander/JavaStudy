package chapter17;

public class Main11 {

	public static void main(String[] args) {
		WorkObject shareObject =new WorkObject();

		ThreadA1  threadA1 = new ThreadA1(shareObject);
		ThreadB1  threadB1 = new ThreadB1(shareObject);

		threadA1.start();
		threadB1.start();
	}

}
