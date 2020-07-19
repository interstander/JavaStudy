package chapter15;

public class A5 {
	
	public void method2(int arg) {
		//arg = 100; //매개로 받은 변수의 데이터를 변경
					 //final선언이 안된것으로 취급  => 오류
		int localVariable = 1;
		// -> 사용은 가능하나 final선언으로 취급
		//localVariable = 100;
		// 로컬 변수의 데이터를 변경하면 final이 아닌것으로 취급 => 오류
		class Inner{
			public void method() {
				int result = arg + localVariable;   
				//-> 이부분에 에러가 난다.
			}
		}
	}
}
