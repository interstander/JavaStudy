package chapter15;

public class Main01 {

	public static void main(String[] args) {
		A a =  new A();
		
		//인스턴스 멤버 클래스의 인스턴스 생성
		A.B b = a.new B();
		b.field1=5;
		b.method1();
		
		//정적 멤버 클래스의 인스턴스 생성
		A.C c = new A.C();
		c.field1=3;
		A.C.field2=4;
		c.method1();
		A.C.method2();
		
		//로컬 클래스의 인스턴스를 위한 메소드 호출
		a.method();

	}

}
