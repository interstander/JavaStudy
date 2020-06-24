package chapter05;

public class Array05 {

	public static void main(String[] args) {
		
		int[] oldNum = {1,2,3};
		int[] newNum = new int[5];
		
		// 배열 복사
		for(int i=0;i<oldNum.length;i++){
		     newNum[i] = oldNum[i];
		}
		//새로운 배열의 데이터 출력
		for(int i=0;i<newNum.length;i++){
		    System.out.println(newNum[i]);
		}

	}

}
