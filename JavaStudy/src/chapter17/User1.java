package chapter17;

public class User1 extends Thread{
	private Calc cal;
	
	public void setCal(Calc cal) {
		this.setName("User1");
		this.cal = cal;
	}

	@Override
	public void run() {
		cal.setMemory(100);
	}
}

