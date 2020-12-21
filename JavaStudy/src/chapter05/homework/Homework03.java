package chapter05.homework;

import java.util.Random;

public class Homework03 {

	public static void main(String[] args) {
		//9. 로또 게임을 5번 해서 출력하세요(1부터 45사이 의 숫자 6개)
		System.out.println("*** 문제 9 ***");
		Random in9 =new Random(); //랜덤값을 읽어오기 위한 변수
		int[] arr9 = new int[6];
		int cnt = 5;
		//실행부
		for(int i=0;i<cnt;i++) {
			for(int j=0; j < arr9.length;j++) {
				arr9[j] = in9.nextInt(45)+1;
			}
			for(int j=0; j < arr9.length;j++) {
				System.out.print(arr9[j]+"/");
			}
			System.out.println();
		}
		System.out.println();

		////////////////////////////////////////////////////////////////////////////////
		//10. 로또 한게임을 실행할 때 중복되지 않도록 출력하세요
		System.out.println("*** 문제 10 ***");
		int[] arr1 = new int[6];  //배열을 담기 위한 변수 
		Random in10 =new Random();

		//		for(int i=0;i<arr1.length;i++) {
		//			System.out.print(arr1[i]+"/");
		//		}
		//		System.out.println();
		//실행부
		//랜덤 값 배열에 집어 넣는 부분
		int a=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j < arr1.length;j++) {
				a = in10.nextInt(45)+1;


				arr1[j]=a;
				for(int k=0;k<j;k++) {
					if(arr1[k]==a) {
						a = in10.nextInt(45)+1;
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
		System.out.println();

		////////////////////////////////////////////////////////////////////////////////////
		//11. 최대값과 해당 인덱스를 구해서 출력해봅시다.
		System.out.println("*** 문제 11 ***");
		int[] num11 = {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max = 0;
		int idx = -1;

		for(int i=0;i<num11.length;i++) {
			if(max<num11[i]) {
				max=num11[i];
				idx=i;
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("해당 인덱스 : "+idx);

		System.out.println();

		//////////////////////////////////////////////////////////////////////////////////
		//12. 1부터 45사이 숫자중 1000번의 번호를 뽑은 후   
		//가장 많이 나오는 것 부터 6개를 최종 번호로 출력
		System.out.println("*** 문제 12 ***");
		Random in12 = new Random();

		int[] nums12 = new int[45];

		for(int i=0;i<1000;i++) {
			int num = in12.nextInt(45)+1;
			nums12[num-1]++;
		}
		for(int j=0;j<45;j++) {
			System.out.println((j+1)+"번째 개수:"+nums12[j]);
		}

		int max12=0;
		int[] maxs = new int[6];
		for(int i=0;i<6;i++) {
			max12=0;
			for(int j=0;j<45;j++) {
				if(max12 <nums12[j]) {
					max12 = nums12[j];
					maxs[i]=j+1;
					nums12[j]=0;
				}
			}
		}
		System.out.println();
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 인덱스: "+maxs[i]+"번");
		}

		System.out.println();


	}

}
