package chapter16;

public class UsingLocalVar {
	void method(int a) {
		int localVar = 40;

		//a=30;               람다를 사용하면 에러가 난다,
		//localVar =50;

		Ex01 fi = ()->{
			System.out.println("a: "+a);
			System.out.println("localVar: "+localVar+"\n");
		};
		fi.method();
	}
}
