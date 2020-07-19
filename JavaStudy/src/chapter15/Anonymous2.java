package chapter15;

public class Anonymous2 {
	RemoteCon field = new RemoteCon() {
		@Override
		public void turnOn() {
			System.out.println("테레비를 켭니다.");	
		}
		@Override
		public void turnOff() {
			System.out.println("테레비를 끕니다.");
		}
	};
	void method1() {
		RemoteCon localVar = new RemoteCon() {
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");	
			}
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		localVar.turnOn();
	}
	
	void method2(RemoteCon con) {
		con.turnOn();
	}

}
