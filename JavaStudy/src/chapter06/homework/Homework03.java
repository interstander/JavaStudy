package chapter06.homework;

import java.util.Scanner;

public class Homework03 {
//	8. 은행 예금 예제를 메소드로 만들어 봅시다.​
//	예금 기능/ 출금 기능/ 조회 기능을 각각 메소드를 만들어 봅니다.​
//	종료를 선택하지 않으면 메뉴가 반복적으로 출력되도록 하세요.​
//
//	각각의 메뉴 선택시 메소드를 통해서 해당 기능을 구현하세요.​
//
//	출금기능은 잔액보다 큰 액수는 출금할 수 없습니다.​
//
//	잔액이 1,000,000원이 넘어서도록 입금할 수 없습니다.​
//	예  잔액 900,000원 있는데 110,000원을 입금하면 잔액이 1,010,000원으로 1,000,000원을 초과하므로 입금을 거부해야 합니다.
		
	static int balance = 1000; // 잔액을 모든 메소드 공용 사용
	static Scanner scan = new Scanner(System.in);
	final static int LIMIT = 1000000;

	public static void main(String[] args) {
		//은행 예제
		// - 메뉴 기능
		// - 잔액 조회 기능
		// - 입금 기능
		// - 출금 기능
		System.out.println("문제 8번 은행 예제");

		boolean run = true;
		while(run) {
			menu();
			int menuNum = scan.nextInt();
			scan.nextLine();
			if(menuNum==1) {
				deposit();
			}else if(menuNum==2){
				withdraw();
			}else if(menuNum==3) {
				checkBalance();
			}else if(menuNum==0) {
				System.out.println("프로그램을 종료합니다.");
				run=false;
			}else {
				System.out.println("-잘못 입력했습니다.-");
			}
		}// while

	}

	private static void menu() {
		System.out.println("그린 은행에 오신것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 잔액 조회");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택>");
	}

	private static void withdraw() {
		System.out.println("출금할 금액을 입력하세요.");
		System.out.print(":");
		int money = Integer.parseInt(scan.nextLine());
		// 추가적인 기능=> 잔액보다 많은 금액은 출금 불가
		if(balance < money) {
			System.out.println("**** 잔액부족 ****");
		}else {
			balance-=money;
			System.out.println("****출금 완료****");
		}
	}

	private static void deposit() {
		System.out.println("입금할 금액을 입력하세요.");
		System.out.print(":");
		int money = Integer.parseInt(scan.nextLine());
		if((balance+money)>LIMIT) {
			System.out.println("잔액이 1,000,000이 초과되므로 입금할 수 없습니다.");
		}else {
			balance+=money;
			System.out.println("****입금 완료****");
		}
	}

	private static void checkBalance() {
		System.out.println("현재 잔액을 조회합니다.");
		System.out.println("현재 잔액 : "+balance);	
	}
}
