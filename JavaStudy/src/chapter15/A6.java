package chapter15;

public class A6 {
	String field = "바깥 클래스";
	void method() {
		System.out.println("바깥 메소드");
	}

	class B6{
		String field = "내부 클래스";
		void method() {
			System.out.println("내부 메소드");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(A6.this.field);
			A6.this.method();
		}
	}
}
