package chapter06;

import java.util.Scanner;

public class Homework01 {
	static Scanner in  = new Scanner(System.in);
	
	public static void main(String[] args) {

//	1. 은행 예금 예제를 메소드로 만들어 봅시다.
//	예금 기능/ 출금 기능/ 조회 기능을 각각 메소드를 만들어 봅니다.
		int balance = 0;
		boolean run = true;
		
		while(run) {
			menu();
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1:
				System.out.println("예금");
				balance = deposit(balance);
				System.out.println("입금 완료");
				break;
			case 2:
				System.out.println("출금");
				balance = withdraw(balance);
				break;
			case 3:
				System.out.println("조회");
				checkBalance(balance);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인하시고 선택하세요.");
			}
		}


	}
	private static void menu() {
		System.out.println("코리아 은행");
		System.out.println("1.예금");
		System.out.println("2.출금");
		System.out.println("3.조회");
		System.out.println("4.종료");
		System.out.print(">");
	}

	private static void checkBalance(int balance) {
		System.out.println("잔액 : "+balance);
	}

	private static int withdraw(int balance) {
		System.out.println("출금할 금액을 입력하세요.");
		int money = Integer.parseInt(in.nextLine());
		if(money > balance) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance -= money;
			System.out.println("출금 완료");
		}
		return balance;
	}

	private static int deposit(int balance) {
		System.out.println("입금할 금액을 입력하세요.");
		int money = Integer.parseInt(in.nextLine());
		balance += money;
		return balance;
}
}
