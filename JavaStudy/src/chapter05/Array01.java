package chapter05;

public class Array01 {

	public static void main(String[] args) {
		//배열을 사용하지 않을때 다섯 학생의 자바 점수
		int java1=50;
		int java2=85;
		int java3=60;
		int java4=75;
		int java5=90;
		
		//총점 계산
		int total = java1 + java2 + java3 + java4 + java5;
		
		//선언
		int[] java;
		//초기화(빈배열)
		java = new int[5];
		//초기화(내용물 배치)
		java = new int[] {50,85,60,75,90};
		
		System.out.println("java배열 : "+java);
	
		System.out.println();
		
		//첫번째 데이터
		System.out.println("java배열 첫번째 데이터 : "+java[0]);
		//두번째 데이터
		System.out.println("java배열 두번째 데이터 : "+java[1]);
		
		System.out.println();
		
		java[3] = 75;
		System.out.println("java[3] : "+java[3]);
		
		System.out.println();
		
		int num = 4;
		java[num] = 90;
		System.out.printf("java[%d] : %d \n",num,java[num]);
		
		System.out.println();
		
		for(int i=0;i<5;i++) {
			System.out.printf("java[%d] : %d \n",i,java[i]);
		}
		System.out.println();
		
		System.out.println("배열의 크기 : "+java.length);
		
		
		System.out.println();
		
		for(int i=0;i<java.length;i++) {
			System.out.printf("java[%d] : %d \n",i,java[i]);
		}
		
		System.out.println();
		

		
		

	}

}
