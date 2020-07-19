package chapter15;

/*외부 클래스*/
public class A {
	A(){
		System.out.println("A 인스턴스 생성됨");
	}
	
	/*인스턴스 멤버 클래스*/
	class B{
		B(){
			System.out.println("B 인스턴스 생성됨");
		}
		int field1;
		//static int field2;
		void method1() {}
		//static void method2() {}
	}
	
	/*정적 멤버 클래스*/
	static class C{
		C(){
			System.out.println("C 인스턴스 생성됨");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/*로컬 클래스*/
		class D{
			D(){
				System.out.println("D 인스턴스 생성됨");
			}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
		}
		D d = new D();
		d.field1=3;
		d.method1();
	}
	///////////////////////////////////////////////////////////////
	
	// 외부 클래스의 멤버 필드
	B field1 = new B();
	C field2 = new C();
	//외부 클래스의 멤버 메소드 내부
	void mothod1() {
		B var1 = new B();
		C var2 = new C();
	}

	//외부 클래스의 정적멤버 필드
	//static B field3 = new B();  사용 불가능
	static C field4 = new C();

	//외부 클래스의 정적 메소드 내부
	static void method2() {
		//B var1 = new B();   사용 불가능
		C var2 = new C();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
