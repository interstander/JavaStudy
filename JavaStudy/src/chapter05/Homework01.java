package chapter05;

import java.util.Random;

public class Homework01 {

	public static void main(String[] args) {
		//과제

		//1 .로또 게임을 5번 해서 출력하세요(1부터 45사이 의 숫자 6개)
		System.out.println("1. 로또 게임을 5번 해서 출력하세요..");
		int[] arr1 = new int[6];  //배열을 담기 위한 변수 

		Random in =new Random(); //랜덤값을 읽어오기 위한 변수

		//실행부
		for(int i=0;i<5;i++) {
			for(int j=0; j < arr1.length;j++) {
				arr1[j] = in.nextInt(45)+1;
			}
			for(int j=0; j < arr1.length;j++) {
				System.out.print(arr1[j]+"/");
			}
			System.out.println();
		}

		//2. 로또 한게임을 실행할 때 중복되지 않도록 출력하세요
		System.out.println("2. 로또 한게임을 실행할 때 중복되지 않도록 출력하세요.");
		arr1 = new int[6];  //배열을 담기 위한 변수 

		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"/");
		}
		System.out.println();
		//실행부
		//랜덤 값 배열에 집어 넣는 부분
		int a=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j < arr1.length;j++) {
				a = in.nextInt(45)+1;
				arr1[j]=a;
				for(int k=0;k<j;k++) {
					if(arr1[k]==a) {
						a = in.nextInt(45)+1;
						k--;
					}else {
						arr1[j]=a;
					}
				}
			}
			//출력
			for(int j=0; j < arr1.length;j++) {
				System.out.print(arr1[j]+"/");
			}
			System.out.println();
		}



		//3. 1부터 45사이 숫자중 1000번의 번호를 뽑은 후   
		//가장 많이 나오는 것 부터 6개를 최종 번호로 출력
		System.out.println("12.  1부터 45 중에서 ");
		System.out.println("1000개의 번호를 뽑은 후 가장 많이 나오는 것 부터 6개를 최종 번호로 출력.");
		//Random r = new Random();

		int[] nums = new int[45];

		for(int i=0;i<1000;i++) {
			int num = in.nextInt(45)+1;
			nums[num-1]++;
		}
		for(int j=0;j<45;j++) {
			System.out.println((j+1)+"번째 개수:"+nums[j]);
		}

		int max=0;
		int[] maxs = new int[6];
		for(int i=0;i<6;i++) {
			max=0;
			for(int j=0;j<45;j++) {
				if(max <nums[j]) {
					max = nums[j];
					maxs[i]=j+1;
					nums[j]=0;
				}
			}
		}
		System.out.println();
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 인덱스: "+maxs[i]+"번");
		}



	}

}
