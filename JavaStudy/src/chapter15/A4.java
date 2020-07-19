package chapter15;

public class A4 {
	//필드
	int fieldA;
	//메소드
	void methodA() {}
	//정적 필드
	static int fieldA2;
	//정적 메소드
	static void methodA2() {}
	
	void method() {
		/*로컬 클래스*/
		class D{
			D(){
				System.out.println("D 인스턴스 생성됨");
			}
			void method1() {
				fieldA=10;//외부 클래스의 멤버필드
				methodA();//외부 클래스의 멤버 메소드

				fieldA2=10;//외부 클래스의 정적멤버 필드
				methodA2();//외부 클래스의 정적멤버 메소드
			}
		}
		D d = new D();
		d.method1();
	}
}
