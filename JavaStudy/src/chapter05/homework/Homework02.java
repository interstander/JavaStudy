package chapter05.homework;

import java.util.Random;

public class Homework02 {

	public static void main(String[] args) {
		//2. 로또 한게임을 실행할 때 중복되지 않도록 출력하세요
				System.out.println("2. 로또 한게임을 실행할 때 중복되지 않도록 출력하세요.");
				int[] arr1 = new int[6];  //배열을 담기 위한 변수 
				Random in =new Random();

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

	}

}
