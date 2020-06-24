package chapter04;

public class ActionFlow06 {

	public static void main(String[] args) {
		//2. 반복 while
		// 1부터 10까지 출력해보자
		int i = 0;
		while(i<10) {
			i++;
			System.out.println("i : "+i);
		}

		System.out.println();
		//2. 반복 do~while
		// 1부터 10까지 출력해보자
		int j = 0;
		do {
			j++;
			System.out.println("j : "+j);
		}while(j<10);
	}

}
