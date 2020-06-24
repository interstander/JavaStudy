package chapter04;

public class ActionFlow02 {

	public static void main(String[] args) {
		// 1. if 조건문
		int age = 27;
		if(age>=60) {
			System.out.println("노약자 무료");
		}else {
			if(age>=20) {
				System.out.println("성인 요금");
			}else {
				if(age>=13) {
					System.out.println("청소년 요금");
				}else {
					if(age>=8) {
						System.out.println("어린이 요금");
					}else {
						System.out.println("유아 무료");
					}
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
