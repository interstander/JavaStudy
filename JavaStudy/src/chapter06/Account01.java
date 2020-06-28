package chapter06;

import java.util.Scanner;

public class Account01 {

	public static void main(String[] args) {
		// 쪼개지지 않은 은행 예제
		
		boolean run = true;
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");
			int selNum = Integer.parseInt(scan.nextLine());//scan.nextInt();
						
			switch(selNum) {
			case 1://예금
				System.out.print("예금액>");
				int deposit = Integer.parseInt(scan.nextLine());
				balance +=deposit;
				System.out.printf("%d원 입금 완료 \n",deposit);
				break;
			case 2://출금
				System.out.print("출금액>");
				int withdraw = Integer.parseInt(scan.nextLine());
				//balance -=withdraw;
				if(withdraw>balance) {
					System.out.printf("잔액이 %d원 부족합니다.\n",(withdraw-balance));
				}else {
					balance -=withdraw;
					System.out.printf("%d원 출금 완료\n",withdraw);
				}
				
				break;
			case 3://잔고
				System.out.printf("잔고> %d \n",balance);
				break;
			case 4://종료
				run =false;
				break;
			default:
				
			}
		
		
		
		}
		System.out.println("프로그램 종료");

	}

}
