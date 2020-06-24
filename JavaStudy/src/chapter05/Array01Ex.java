package chapter05;

import java.util.Scanner;

public class Array01Ex {

	public static void main(String[] args) {
		System.out.println("예제 : 다음 데이터를 배열에 담아서 총점과 평균을 구해보자");
		System.out.println("78,85,72,95,86,90");
		System.out.println();
		
		int total = 0;
		double avg = 0.0;
		
		int[] jumsu= {78,85,72,95,86,90};

		for(int i=0;i<jumsu.length;i++) {
			total += jumsu[i];
		}
		avg = total / (double)jumsu.length;
		
		System.out.printf("\t총점 : %d \n",total);
		System.out.printf("\t평균 : %f \n",avg);
		

	}

}
