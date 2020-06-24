package chapter04;

import java.util.Random;
import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		// 심화문제 
		System.out.println("1번 문제");
		//		1. 다음과 같은 ☆모양을 출력하세요
		//		☆
		//		☆ ☆
		//		☆ ☆ ☆
		//		☆ ☆ ☆ ☆
		//		☆ ☆ ☆ ☆ ☆

		//1단계  별을 5개씩 5줄을 일단 찍어본다.
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		//2단계  1줄에 별1, 2줄에 별2/...
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		//3단계 줄수를 입력받는다.

		Scanner scan = new Scanner(System.in);

		System.out.print("라인수를 입력하세요>");
		int line = scan.nextInt();

		for(int i=0;i<line;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("1-1번 문제");
		//		1-2.  다음과 같은 ☆모양을 출력하세요
		//		☆ ☆ ☆ ☆ ☆
		//		☆ ☆ ☆ ☆ 
		//		☆ ☆ ☆
		//		☆ ☆
		//		☆

		//1-1 의 2단계부터 진행   1라인 별5, 2라인 별4 3라인 별3...
		for(int i=0;i<5;i++) {
			for(int j=0;j<(5-i);j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		//3단계 라인 수를 입력받아서 별 찍기
		System.out.print("라인수를 입력하세요>");
		line = scan.nextInt();

		for(int i=0;i<line;i++) {
			for(int j=0;j<(line-i);j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		// 2.가위 바위 보 게임을 만들어 보세요.
		//(컴퓨터와 임의로 대결하는 게임)

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
		
		///////////////////////////////////////////////////////////////////////////////////////////
		//심화 문제 2
		System.out.println("1 별을 다음과 같은 모양으로 출력하세요");
		System.out.println("  ☆  ");
		System.out.println(" ☆☆☆ ");
		System.out.println("☆☆☆☆☆");

		//		과제1 다음 그림을 출력하세요
		//	    *
		//	   ***
		//	  *****

		int max=5; //최대 행
		int L_ln = max*2-1;   //최 하단 들어가야 할 열 갯수(전체 열 갯수)
		int middle = L_ln/2+1;  //특정행 의 중간 열 탐색
		for(int q=1;q<=max;q++) {   // 첫번째 행부터 마지막 행까지
			for(int w=1;w<=L_ln;w++) { // 첫번째 열부터 마지막 열까지
				if(middle-(q-1)<=w&&w<=middle+(q-1)) { //열의 중간 지점 부터 +-로 열 생성
					System.out.print("*");// 해당 위치에 * 삽입
				}else {
					System.out.print(" "); // 맞지 않는 위치에 공백 삽입
				}
			}
			System.out.println(); //다음 행으로 전환
		}
		System.out.println();
		//

		System.out.println("2 별을 다음과 같은 모양으로 출력하세요");
		System.out.println("  ☆  ");
		System.out.println(" ☆☆☆ ");
		System.out.println("☆☆☆☆☆");
		System.out.println(" ☆☆☆ ");
		System.out.println("  ☆  ");
		//	과제2 다음 그림을 출력하시오
		//	    *
		//	   ***
		//	  *****
		//	   ***
		//	    *

		max=5;   // 최대 행 수
		int L_m = max/2+1; // 행의 중간 위치
		int R_m = max/2+1;  // 열의 중간 위치
		for(int q=1;q<=max;q++) {  //첫번째 행부터 마지막 행까지
			if(q<=R_m) {      //*이 커지는 중간행까지
				for(int w=1;w<=max;w++) {// 열은 첫번쨰 부터 마지막 까지 채운다.
					if(L_m-(q-1)<=w&&w<=L_m+(q-1)) { //열의 중간 지점부터 +-로 채우기 시작한다.
						System.out.print("*");  //해당 위치에 *을 채운다.
					}else{
						System.out.print(" ");  //해당 위치에 공백을 채운다.
					}
				}
				System.out.println();  //다음 행으로 전환
			}else {  // 중간 행 이후 *가 줄어드는 시점
				for(int w=1;w<=max;w++) { // 열은 첫번쨰 부터 마지막 까지 채운다.
					if(L_m-(max-q)<=w&&w<=L_m+(max-q)) { //최대에서 +-를 하나씩 줄여서 채우기 시작
						System.out.print("*"); //해당 위치에 *을 채운다.
					}else{
						System.out.print(" ");//해당 위치에 공백을 채운다.
					}
				}
				System.out.println();//다음 행으로 전환
			}

		}
		System.out.println();
		
		scan.nextLine();

		//3. 게임 회수를 입력받아서 가위바위보 게임을 진행한 후 최종적으로 승,무, 패를 출력하는 프로그램을 만들어 보세요.
		System.out.println("3.  게임 횟수를 입력받아서 가위바위보게임");
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
