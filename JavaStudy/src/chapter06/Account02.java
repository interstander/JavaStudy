package chapter06;

import java.util.Scanner;

public class Account02 {

	public static void main(String[] args) {
		// 메뉴의 기능 별로 쪼개 보자
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		반복:while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");
			int selNum = Integer.parseInt(scan.nextLine());//scan.nextInt();
						
			switch(selNum) {
			case 1://예금 기능 deposit()
				balance= deposit(balance);
				break;
			case 2://출금 기능 withdraw();
				System.out.print("출금액>");
				int withdraw = Integer.parseInt(scan.nextLine());
				balance = withdraw(balance,withdraw);
				break;
			case 3://잔고 check();
				check(balance);
				break;
			case 4://종료
				//System.exit(0);
				break 반복;
//				run =false;
//				break;
			default:
				System.out.println("잘못 입력했습니다. /n다시 확인해 주세요.");
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void check(int balance) {
		System.out.printf("잔고> %d \n",balance);
	}

	private static int withdraw(int balance, int withdraw) {
		if(withdraw>balance) {
			System.out.printf("잔액이 %d원 부족합니다.\n",(withdraw-balance));
		}else {
			balance -=withdraw;
			System.out.printf("%d원 출금 완료\n",withdraw);
		}
		return balance;
	}

	private static int deposit(int balance) {//예금 기능
		Scanner scan = new Scanner(System.in);
		System.out.print("예금액>");
		int deposit = Integer.parseInt(scan.nextLine());
		balance +=deposit;
		System.out.printf("%d원 입금 완료 \n",deposit);
		return deposit;
	}

}
