package chapter01.homework;

public class Homework {

	public static void main(String[] args) {
		
//		문제 1)자기소개를 하는 프로그램을 만들어 보자
//		이름 : OOO
//		나이 : OO세
//		연락처 : OOO-OOOO-OOOO
		
		System.out.println("이름 : "+"홍길동");
		System.out.println("나이 : "+"25세");
		System.out.println("연락처 : "+"010-1234-5678");
		
		System.out.println();
		
//		문제 2) 위 프로그램에 날짜와 버전을 기록해보자
//		단, 프로그램 실행시 출력이 되어서는 안된다.

		// 출시일 : 2020.01.01
		// 버전 : 20.0101
		
//		문제 3) 다음과 같이 출력하는 프로그램을 작성해보자
//		단 printf 출력문 하나만 이용해서 출력해보자
//		국어점수 : 75점
//		영어점수 : 85점
//		수학점수 : 90점
//		총점 : 250점
//		평균 : 83.33점
//		합격여부 : 합격

		System.out.printf("국어점수 : %d점 %n영어점수 : %d점 %n수학점수 : %d점 %n총점 : %d점 %n평균 : %f점 %n합격여부 : %s %n",75,85,90,250,83.33,"합격");

	}

}
