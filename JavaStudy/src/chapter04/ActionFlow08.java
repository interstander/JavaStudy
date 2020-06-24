package chapter04;

public class ActionFlow08 {

	public static void main(String[] args) {
		//2. 반복 for
		// 1부터 10까지 출력해보자
		for(int i=1;i<=10;i++) {
			System.out.println("i : "+i);
		}
		
		System.out.println();
		//2. 반복 for
		// 1부터 10까지 합계를 출력해보자
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("for 합계 : "+sum);

	}

}
