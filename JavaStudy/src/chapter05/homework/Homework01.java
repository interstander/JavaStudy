package chapter05.homework;

import java.util.Random;

public class Homework01 {

	public static void main(String[] args) {

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

		



		



	}

}
