package chapter15;

public class Child {
	//클래스 내 필드로 선언
	Parent field1 = new Parent() {
		int childField;
		void childMethod() {}
		@Override
		void method() {
			super.method();
		}
	};
	//메소드 내 로컬 변수로 선언
	void method() {
		Parent localVar = new Parent() {
			int childField;
			void childMethod() {}
			@Override
			void method() {
				super.method();
			}
		};
	}
	//메소드의 매개값이 부모 타입인 경우
	//메소드 호출시 익명 구현 객체를 생성해서 매개값으로 전다
	void method1(Parent parent) {}

	void method2() {
		method1(new Parent() {//메소드 호출
			int childField;
			void childMethod() {}
			@Override
			void method() {
				super.method();
			}
		});
	}

	//////
	
	Parent field2 = new Parent() {
		int childField;
		void childMethod() {}
		@Override
		void method() {
			super.method();
		}
	};

	void method3() {
		//field.childField=3;     사용 불가
		//field.childMethod();  사용 불가
		field2.method();          // 사용 가능  (오버라이드 => 부모도 안다)
	}

	
	
}
