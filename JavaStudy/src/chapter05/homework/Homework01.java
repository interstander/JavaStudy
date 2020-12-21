package chapter05.homework;

import java.util.Random;

public class Homework01 {

	public static void main(String[] args) {
		//1. 다음과 같은 배열이 있을 때 arr[3].length의 값은 얼마인가?
		System.out.println("*** 문제 1 ***");
		int[][] arr1 = { 
		          { 5, 5, 5, 5, 5},
		          { 10, 10, 10}, 
		          { 20, 20, 20, 20}, 
		          { 30, 30} 
				};

		System.out.println("arr[3].length : "+arr1[3].length);
		
		////////////////////////////////////////////////////////////////////
		//2. 배열에 담긴 값들의 합계를 구하는 프로그램을 작성하세요.
		System.out.println("*** 문제 2 ***");
		int[] arr2 = new int[]{10,15,47,23,51};

		int sum2 = 0;
		for(int i=0;i<arr2.length;i++) {
			sum2+=arr2[i];
		}
		
		System.out.println("합계 : "+sum2);
		
		/////////////////////////////////////////////////////////////////////
		//3. 다음 2차원 배열에 담긴 모든 값들의 총합과 평균을 구하는 프로그램을 완성하세요.
		System.out.println("*** 문제 3 ***");
		int[][] arr3 = { 
		          {  5,  5,  5,  5,  5},
		          { 10, 10, 10, 10, 10}, 
		          { 20, 20, 20, 20, 20}, 
		          { 30, 30, 30, 30, 30} 
				};

		int sum3 = 0;
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				sum3+=arr3[i][j];
			}
		}
		
		System.out.println("합계 : "+sum3);
		
		//////////////////////////////////////////////////////////////////////////
		//4. 1과9사이의 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 완성하세요. 
		//단 숫자의 중복이 있어서는 안됩니다.
		System.out.println("*** 문제 4 ***");
		Random r4 = new Random();
		
		int[] arr4 = new int[3];
		
		for(int i=0;i<arr4.length;i++) {
			arr4[i] = r4.nextInt(9)+1;
			for(int j=0;j<i;j++) {
				if(arr4[i]==arr4[j]) {	
					i--;
					continue;
				}
			}
		}
		
		for(int i=0;i<arr4.length;i++) {
			if(i==arr4.length-1) {
				System.out.println(arr4[i]);
			}else {
				System.out.print(arr4[i]+",");
			}
		}

	}

}
