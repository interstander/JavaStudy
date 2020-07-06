package chapter09;

public class Child04 extends Parent04{
	int age = 25;

	@Override
	public void info() {
//		System.out.println("이름 : "+this.name);
		super.info();
		System.out.println("나이 : "+this.age);
	}

}


