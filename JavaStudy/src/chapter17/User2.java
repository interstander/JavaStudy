package chapter17;

public class User2 extends Thread{
	private Calc cal;
	
	public void setCal(Calc cal) {
		this.setName("User2");
		this.cal = cal;
	}

	@Override
	public void run() {
		cal.setMemory(50);
	}
}

