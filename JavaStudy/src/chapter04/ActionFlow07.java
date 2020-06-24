package chapter04;

public class ActionFlow07 {

	public static void main(String[] args) {
		//2. 반복 while
		// 1부터 10까지 합계를 출력해보자
		int i = 0;
		int sum = 0;
		while(i<10) {
			i++;
			sum += i;
		}
		System.out.println("while 합계 : "+sum);

		System.out.println();
		//2. 반복 do~while
		// 1부터 10까지 합계를 출력해보자
		int j = 0;
		int hap = 0;
		do {
			j++;
			hap += j;
		}while(j<10);
		System.out.println("do while 합계 : "+hap);

	}

}
