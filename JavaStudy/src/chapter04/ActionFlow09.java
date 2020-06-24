package chapter04;

public class ActionFlow09 {

	public static void main(String[] args) {
		// 1부터 5까지 출력하는 구문
		for(int cnt=1;cnt<=5;cnt++) {
			System.out.println("cnt : "+cnt);
		}
		
		System.out.println();
		System.out.println("break 사용예");
		for(int cnt=1;cnt<=5;cnt++) {
			if(cnt == 3) break; 
			//코드블록이 하나의 실행문으로 이루어 진 경우 {} 생략 가능
			System.out.println("cnt : "+cnt);
		}
		
		System.out.println();
		System.out.println("continue 사용예");
		for(int cnt=1;cnt<=5;cnt++) {
			if(cnt == 3) continue; 
			System.out.println("cnt : "+cnt);
		}
	}

}
