package chapter07;

public class StaticAndInstance {
	//인스턴스 멤버
	int field1;
	void method1(){
		System.out.println("인스턴스 메소드");
	}
	
	// 정적(클래스) 멤버
	static int field2;
	static void method2(){
		System.out.println("클래스 메소드");
	}
	
	//정적 초기화 블록
	static {
		//field1 =10;컴파일에러
		//method1();컴파일에러
		field2 =10;
		method2();
		
	}
	
	//정적 메소드
	static void method3(){
		System.out.println("클래스 메소드");
		//this.field1 =10;   컴파일에러
		//this.method1();컴파일에러
		field2 =10;     //내 인스턴스를 가르키는 this도 사용불가
		method2();
	}
	
	//인스턴스 메소드
	void method4(){
		System.out.println("인스턴스 메소드");
		this.field1 =10;
		this.method1();
		field2 =10;     
		method2();
	}

}
