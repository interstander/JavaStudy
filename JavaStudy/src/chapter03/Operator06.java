package chapter03;

public class Operator06 {

	public static void main(String[] args) {
		//비교연산 => 문자열 비교
		
		String a = new String("안녕");
		String b = new String("안녕");

		System.out.println("a == b : "+(a==b));
		System.out.println("a.equals(b) : "+ (a.equals(b))); //a.equals(b) a를 b와 비교한다.
		
	}

}
