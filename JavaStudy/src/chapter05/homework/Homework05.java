package chapter05.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
//		2. 야구 게임 : 컴퓨터가 뽑은 임의의 숫자 3개를 맞추세요  0~9까지 
		System.out.println("13.  야구 게임 : 컴퓨터가 뽑은 임의의 숫자 3개를 맞추세요  0~9까지");
		Random r = new Random();
		Scanner in = new Scanner(System.in);

		int[] coms = new int[3];
		int[] users = new int[3];
		int cnt = 0;
		int ball = 0,strike = 0;

		for (int j=0;j<coms.length;j++) {
			int b = in.nextInt(10);
			coms[j]=b;
			for(int k=0;k<j;k++) {
				if(coms[k]==b) {
					b=in.nextInt(10);
					k--;
				}else {
					coms[j]=b;
				}
			}
			System.out.print(coms[j]+" ");
		}
		System.out.println();
		while(strike<3) {
			ball = 0;
			strike = 0;
			System.out.println("숫자 3개를 입력하세요");
			for(int i=0;i<users.length;i++) {
				System.out.println((i+1)+"번째 숫자");
				users[i]=Integer.parseInt(in.nextLine());
			}
			for(int i=0;i<users.length;i++) {
				for(int j=0;j<coms.length;j++) {
					if((users[i]==coms[j]) && i==j) {
						strike++;
					}else if((users[i]==coms[j]) && i!=j) {
						ball++;
					}
				}
			}
			System.out.println(strike+"스트라이크 / "+ball+"볼");
			cnt++;
		}
		System.out.println("플레이 회수 : "+cnt);


	}

}
