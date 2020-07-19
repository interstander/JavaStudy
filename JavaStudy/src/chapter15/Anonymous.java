package chapter15;

public class Anonymous {
	//필드
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	//메소드
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();	
	}
	//메소드(매개변수)
	void method2(Person person) {
		person.wake();
	}

}
