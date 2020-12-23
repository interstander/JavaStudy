package chapter07.homework;

import java.util.Scanner;

public class Homework05 {
	static Scanner in = new Scanner(System.in);
	static Account5[] accounts = new Account5[100];//100개의 계좌만 개설이 가능한 은행

	public static void main(String[] args) {
		System.out.println("5번 문제 : 은행 계좌 문제");

		boolean run = true;

		while(run) {
			System.out.println("그린 뱅크에 오신것을 환영합니다.");
			System.out.println("은행 업무를 위해 메뉴를 선택해 주세요.");
			System.out.println("1. 계좌 개설");
			System.out.println("2. 계좌 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print(">");
			int selectMenu = Integer.parseInt(in.nextLine());

			switch(selectMenu) {
			case 0://프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			case 1:// 계좌 개설
				System.out.println("계좌를 개설합니다.");
				System.out.println("계좌 번호를 입력하세요.");
				String accNum = in.nextLine();
				System.out.println("예금주를 입력하세요.");
				String accName = in.nextLine();
				System.out.println("초기 예금액을 입력하세요.");
				int money = Integer.parseInt(in.nextLine());

				Account5 acc = new Account5(accNum,accName,money);// 

				for(int i=0;i<accounts.length;i++) {
					if(accounts[i]==null) {
						accounts[i]=acc;
						break;
					}
				}
				break;
			case 2:// 계좌 조회
				System.out.println("계좌 조회를 합니다.");
				System.out.println("계좌 번호를 입력하세요.");
				String chkAccNum = in.nextLine();
				Account5 chkAcc=null;

				// 배열에서 계좌 번호로 계좌 인스턴스를 검색하는 기능
				for(int i=0;i<accounts.length;i++) {
					if(accounts[i]!=null) {
						if(chkAccNum.equals(accounts[i].accountNum)) {
							chkAcc=accounts[i];
							break;
						}
					}	
				}

				if(chkAcc==null) {
					System.out.println("해당 계좌 번호를 찾을 수 없습니다.");
				}else {
					bankFunction(chkAcc);
				}
				break;
			default:
				System.out.println("잘못 선택했습니다. \n 다시 확인해 주세요.");
			}

		}//while
	}

	private static void bankFunction(Account5 chkAcc) {
		while(true) {
			System.out.println(chkAcc.accountHolder+"님 환영합니다.");
			System.out.println("업무를 선택하세요.");
			System.out.println("1. 입금 기능");
			System.out.println("2. 출금 기능");
			System.out.println("3. 잔액 조회기능");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print(">");

			int selectNum = Integer.parseInt(in.nextLine());
			int money=0;

			switch(selectNum) {
			case 0:
				System.out.println("메인 메뉴 돌아가기");
				return;//
			case 1://
				System.out.println("입금을 합니다.");
				System.out.println("입금 액수를 입력하세요.");
				money = Integer.parseInt(in.nextLine());
				chkAcc.deposit(money);

				break;
			case 2:
				System.out.println("출금을 합니다.");
				System.out.println("출금 액수를 입력하세요.");
				money = Integer.parseInt(in.nextLine());
				chkAcc.withdraw(money);

				break;
			case 3:
				System.out.println("잔액 조회 기능");
				chkAcc.checkBalance();
				break;
			default:
				System.out.println("잘못 선택했습니다. \n 다시 확인해 주세요.");	
			}

		}
	}

}