package chapter04.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 25.가위 바위 보 게임을 만들어 보세요.
		//(컴퓨터와 임의로 대결하는 게임)
		System.out.println("25번 문제");
		Random r = new Random();

		int comNum = r.nextInt(3);
		String com = "";
		if(comNum==0) {
			com = "보";
		}else if(comNum==1) {
			com="바위";
		}else if(comNum==2) {
			com="가위";
		}
		System.out.print("가위, 바위, 보 중에 하나를 내세요>");
		String user = scan.nextLine();

		System.out.println("플레이어 :" +user);
		System.out.println("컴퓨터 : "+com);
		switch(user) {
		case "가위": //System.out.println("가위를 냈습니다.");
			if(com.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if(com.equals("바위")) {
				System.out.println("플레이어가 졌습니다.");
			}else if(com.equals("보")) {
				System.out.println("플레이어가 이겼습니다.");
			}
			break;
		case "바위": //System.out.println("바위를 냈습니다.");
			if(com.equals("가위")) {
				System.out.println("플레이어가 이겼습니다.");
			}else if(com.equals("바위")) {
				System.out.println("비겼습니다.");
			}else if(com.equals("보")) {
				System.out.println("플레이어가 졌습니다.");
			}
			break;
		case "보": //System.out.println("보를 냈습니다.");
			if(com.equals("가위")) {
				System.out.println("플레이어가 졌습니다.");
			}else if(com.equals("바위")) {
				System.out.println("플레이어가 이겼습니다.");
			}else if(com.equals("보")) {
				System.out.println("비겼습니다.");
			}
			break;
		default:
			System.out.println("잘못 입력했습니다.");
		}
		System.out.println();


		//26. 게임 회수를 입력받아서 가위바위보 게임을 진행한 후 최종적으로 승,무, 패를 출력하는 프로그램을 만들어 보세요.
		System.out.println("26번 문제");
		System.out.println("26.  게임 횟수를 입력받아서 가위바위보게임");
		System.out.println("최종적으로 승,무,패 출력되게 하세요.");
		// 가위 바위 보 게임 2
		//		Random r = new Random();
		//		Scanner in = new Scanner(System.in);

		System.out.print("게임 회수를 입력하세요.>");
		int cnt = 0;
		int game = Integer.parseInt(scan.nextLine());

		int w=0,l=0,d=0;

		while (cnt<game) {
			System.out.println((cnt+1)+"번째 게임");
			comNum = r.nextInt(3);

			com = "";
			if(comNum==0) {
				com = "보";
			}else if(comNum==1) {
				com="바위";
			}else if(comNum==2) {
				com="가위";
			}
			System.out.println("가위, 바위, 보 중에 하나를 내세요");
			user = scan.nextLine();

			System.out.println("플레이어 :" +user);
			System.out.println("컴퓨터 : "+com);
			switch(user) {
			case "가위": //System.out.println("가위를 냈습니다.");
				if(com.equals("가위")) {
					System.out.println("비겼습니다.");
					d++;
				}else if(com.equals("바위")) {
					System.out.println("플레이어가 졌습니다.");
					l++;
				}else if(com.equals("보")) {
					System.out.println("플레이어가 이겼습니다.");
					w++;
				}
				break;
			case "바위": //System.out.println("바위를 냈습니다.");
				if(com.equals("가위")) {
					System.out.println("플레이어가 이겼습니다.");
					w++;
				}else if(com.equals("바위")) {
					System.out.println("비겼습니다.");
					d++;
				}else if(com.equals("보")) {
					System.out.println("플레이어가 졌습니다.");
					l++;
				}
				break;
			case "보": //System.out.println("보를 냈습니다.");
				if(com.equals("가위")) {
					System.out.println("플레이어가 졌습니다.");
					l++;
				}else if(com.equals("바위")) {
					System.out.println("플레이어가 이겼습니다.");
					w++;
				}else if(com.equals("보")) {
					System.out.println("비겼습니다.");
					d++;
				}
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
			cnt++;
			System.out.println();
		}
		System.out.println("승 : "+w);
		System.out.println("무 : "+d);
		System.out.println("패 : "+l);
	}

}
