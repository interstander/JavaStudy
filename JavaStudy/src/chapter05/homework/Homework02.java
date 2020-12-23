package chapter05.homework;

import java.util.Random;

public class Homework02 {

	public static void main(String[] args) {
		//5. 거스름돈을 몇 개의 동전을 지불이 가능한지 계산하는 문제이다. 
		//money에 담긴 돈을 동전으로 바꾸었을 때 가능한 적은 개수의 동전으로 거슬러 주어야 한다. 
		//단 동전은 500원 100원 50원 10원까지  존재한다. 
		System.out.println("*** 문제 5 ***");

		int[] money5 = {500,100,50,10};
		int[] changeCnt5 = new int[4];

		int change5 = 1780;

		for(int i=0;i<money5.length;i++) {
			changeCnt5[i] = change5/money5[i];
			change5%=money5[i];
		}

		for(int i=0;i<money5.length;i++) {
			System.out.printf("%3d원 : %d개\n",money5[i],changeCnt5[i]);
		}
		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////////////
		//6. 위 문제에서 동전의 개수가 각각 5개 정해져 있다하자 
		//보유한 동전으로 지불이 불가능하면 ‘거스름돈이 부족합니다＇라는 메시지를 띄우고 
		//거스름돈이 충분하면 각 동전이 몇 개 사용되었는지 출력하고 
		//남은 동전의 개수를 출력하는 프로그램을 완성하세요.
		System.out.println("*** 문제 6 ***");

		int[] money6 = {500,100,50,10};
		int[] moneyCnt = {5,5,5,5};
		int[] changeCnt6 = new int[4];

		//		boolean overflow= true;
		boolean overflow= false;
		//true면 잔액이 부족한 경우, false면 잔액을 거슬러 줄수 있는 경우
		int change6;

		if(overflow) {
			change6 = 4780;	
		}else {
			change6 = 1780;
		}

		int total6 = 0;
		for(int i=0;i<money6.length;i++) {
			int mul = money6[i]*moneyCnt[i];
			total6+=mul;
		}
		System.out.println("지불 해야 할 거스름돈 : "+change6);
		//		System.out.println("잔액 환불 가능액 : "+total6);
		if(change6>total6) {
			System.out.println("잔액이 부족합니다.");
		}else {
			while(change6!=0) {
				for(int i=0;i<money6.length;i++) {
					int cnt = 0;
					while(cnt<=moneyCnt[i]) {
						//						System.out.println("moneyCnt["+i+"]"+moneyCnt[i]);
						change6-=money6[i];
						if(change6<0) {
							change6+=money6[i];
							break;
						}
						//						System.out.println("change6 : "+change6);
						moneyCnt[i]--;
						cnt++;
					}	
					changeCnt6[i]=cnt;
				}
			}
		}

		System.out.println("거스름된 동전 개수 : ");
		for(int i=0;i<money6.length;i++) {
			System.out.printf("-- %3d원 : %d개\n",money6[i],changeCnt6[i]);	
		}
		System.out.println("******************");
		System.out.println("남은 동전 개수 : ");
		for(int i=0;i<money6.length;i++) {
			System.out.printf("-- %3d원 : %d개\n",money6[i],moneyCnt[i]);
		}

		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////////////
		//7. 배열에 담긴 숫자를 읽어서 숫자만큼 *을 찍는 프로그램을 완성하세요.
		System.out.println("*** 문제 7 ***");
		int[] arr7 = new int[]{3,2,5};

		for(int i=0;i<arr7.length;i++) {
			System.out.print(arr7[i]+" : ");
			for(int j=0;j<arr7[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/////////////////////////////////////////////////////////////////////////////////////////////
		//8. 주어진 2차원 배열보다 행과 열을 하나씩 더 큰 배열을 생성하고 
		//해당 배열의 마지막 행과 열에는 각 행과 열의 합을 저장하고 출력하는 프로그램을 완성하세요.
		System.out.println("*** 문제 8 ***");
		int[][] arr8= { 
				{ 10, 10, 10, 10, 10},
				{ 20, 20, 20, 20, 20}, 
				{ 30, 30, 30, 30, 30}, 
				{ 40, 40, 40, 40, 40}, 
				{ 50, 50, 50, 50, 50}, 
		};

		int[][] scores = new int[6][6];

		for(int i=0;i<scores.length;i++) {
			if(i<5) {
				int sumRow = 0;
				int sumCol = 0;
				for(int j=0;j<scores[i].length;j++) {
					if(j<5) {
						scores[i][j] = arr8[i][j];
						sumRow+=arr8[i][j];
						sumCol+=arr8[j][i];
					}else {
						scores[i][j] = sumRow;
						scores[j][i] = sumCol;
					}
				}
			}else {
				int total8 = 0;
				for(int j=0;j<scores[i].length;j++) {
					if(j<5) {
						total8+=scores[i][j];
					}else {
						scores[i][j]=total8;
					}
				}

			}
		}

		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.printf(" %3d ",scores[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
