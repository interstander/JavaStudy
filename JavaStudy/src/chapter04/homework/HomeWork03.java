package chapter04.homework;

import java.util.Scanner;

public class HomeWork03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//별찍기
		System.out.println("19번 문제");
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

		

		System.out.print("라인수를 입력하세요>");
		int line = Integer.parseInt(scan.nextLine());

		for(int i=0;i<line;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		
////////////////////////////////////////////////////////////////////////////
		System.out.println("20번 문제");
		//		20.  다음과 같은 ☆모양을 출력하세요
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
		line = Integer.parseInt(scan.nextLine());

		for(int i=0;i<line;i++) {
			for(int j=0;j<(line-i);j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	
////////////////////////////////////////////////////////////////////////////
		System.out.println("21번 문제");
//		21. 다음과 같은 ☆모양을 출력하세요
//		☆ 
//		☆ ☆ 
//		☆ ☆ ☆
//		☆ ☆
//		☆
		System.out.print("라인수를 입력하세요>");
		line = Integer.parseInt(scan.nextLine());
//		line = 5;
		int half = line/2+1;
		System.out.println("중간값 : "+half);
		for(int i=0;i<line;i++) {
			if(i<half) {
				for(int j=0;j<=i;j++) {
					System.out.print("★");
				}
				System.out.println();
			}else {
				for(int j=0;j<(line-i);j++) {
					System.out.print("★");
				}
				System.out.println();
			}
		}
		
		////////////////////////////////////////////////////////////////////////////
		System.out.println("22번 문제");
//		22. 다음과 같은 ☆모양을 출력하세요
//            ☆ 
//          ☆ ☆ 
//        ☆ ☆ ☆
//          ☆ ☆
//            ☆

		
		
		
		////////////////////////////////////////////////////////////////////////////
		System.out.println("23번 문제");
//		23. 다음과 같은 ☆모양을 출력하세요
//        		☆
//        	  ☆ ☆ ☆
//    		☆ ☆ ☆ ☆ ☆
		
		System.out.println("23 별을 다음과 같은 모양으로 출력하세요");
		System.out.println("  ☆  ");
		System.out.println(" ☆☆☆ ");
		System.out.println("☆☆☆☆☆");

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

		////////////////////////////////////////////////////////////////////////////
		System.out.println("24번 문제");
//		24. 다음과 같은 ☆모양을 출력하세요
//        	    ☆
//        	  ☆ ☆ ☆
//        	☆ ☆ ☆ ☆ ☆
//        	  ☆ ☆ ☆
//        	    ☆

		System.out.println("24. 별을 다음과 같은 모양으로 출력하세요");
		System.out.println("  ☆  ");
		System.out.println(" ☆☆☆ ");
		System.out.println("☆☆☆☆☆");
		System.out.println(" ☆☆☆ ");
		System.out.println("  ☆  ");


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
	}
}
