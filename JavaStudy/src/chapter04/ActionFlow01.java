package chapter04;

public class ActionFlow01 {

	public static void main(String[] args) {
		// 1. if 조건문
		int score = 60;
		System.out.println("점수 : " + score);
		if(score>= 60) {
			System.out.println("합격");
			System.out.println("자격증을 수여합니다.");
		}else {
			System.out.println("불합격");
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
