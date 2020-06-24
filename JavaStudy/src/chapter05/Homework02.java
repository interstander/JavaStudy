package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		//심화 문제
		
//		1. 로또 번호를 중복되지 않게 뽑은 후 버블정렬 기법을 사용해서 오름차순으로 정렬하세요.
		System.out.println("3. 로또 한 게임을 실행한후 버블 정렬 기법을 사용하여 오름차순 정렬하시오.");
		int[] arr1 = new int[6];  //배열을 담기 위한 변수 
		Random r =new Random(); //랜덤값을 읽어오기 위한 변수

		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"/");
		}
		System.out.println();
		//실행부
		//랜덤 값 배열에 집어 넣는 부분
		int a=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j < arr1.length;j++) {
				a = r.nextInt(45)+1;
				arr1[j]=a;
				for(int k=0;k<j;k++) {
					if(arr1[k]==a) {
						a = r.nextInt(45)+1;
						k--;
					}else {
						arr1[j]=a;
					}
				}
			}
			//버블 정렬
			int temp=0;
			int t= arr1.length;
			for(int j=arr1.length ; j>=0 ;j--) {
				for(int a0=0;a0<t-1;a0++) {
					int a1= a0 +1;
					if(arr1[a0]>arr1[a1]) {
						temp = arr1[a0];
						arr1[a0] = arr1[a1];
						arr1[a1] = temp;
					}
				}
				t-=1;
			}
			//출력
			for(int j=0; j < arr1.length;j++) {
				System.out.print(arr1[j]+"/");
			}
			System.out.println();
		}

		
//		2. 야구 게임 : 컴퓨터가 뽑은 임의의 숫자 3개를 맞추세요  0~9까지 
		System.out.println("13.  야구 게임 : 컴퓨터가 뽑은 임의의 숫자 3개를 맞추세요  0~9까지");
		//		Random r = new Random();
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
