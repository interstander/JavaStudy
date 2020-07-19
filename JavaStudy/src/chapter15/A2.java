package chapter15;

public class A2 {
	//필드
	int fieldA;
	//메소드
	void methodA() {}
	//정적 필드
	static int fieldA2;
	//정적 메소드
	static void methodA2() {}

	class B{
		void method() {
			fieldA=10;//외부 클래스의 멤버필드
			methodA();//외부 클래스의 멤버 메소드

			fieldA2=10;//외부 클래스의 정적멤버 필드
			methodA2();//외부 클래스의 정적멤버 메소드
		}
	}
}
