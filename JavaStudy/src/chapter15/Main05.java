package chapter15;

public class Main05 {

	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();

		anony.field.turnOn();

		anony.method1();

		anony.method2(new RemoteCon() {
					@Override
					public void turnOn() {
						System.out.println("컴퓨터를 켭니다.");
					}
					@Override
					public void turnOff() {
						System.out.println("컴퓨터를 끕니다.");
					}
				});		
	}
}
