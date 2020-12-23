package chapter06.homework;

import java.util.Scanner;

public class Homework02 {

	static int[] arr = {78,54,89,57,84,95,74,91,84,67,52,94,82};

	public static void main(String[] args) {
		//	5. 주어진 배열을 입력받아서 가장 큰 수를 반환하는 메소드를 만들어 보세요.​
		//	단, 배열의 null이거나 크기가 0인 경우 -99999을 출력하도록 만드세요.
		System.out.println("문제 5");
		int max5 = q5(arr);
		System.out.println("최대값 : "+max5);

		//	6. 주어진 배열을 입력받아서 총점을 구하는 메소드를 만들어 보세요.​
		System.out.println("문제 6");
		int sum6 = q6(arr);
		System.out.println("총점 : "+sum6);

		//	7. 주어진 배열을 입력받아서 평균을 구하는 메소드를 만들어 보세요.  	
		System.out.println("문제 7");
		double avg = q7(arr);
		System.out.println("평균 : "+avg);

		//	8. 주어진 두 배열의 같은 위치의 숫자를 합쳐서 하나의 배열로 출력하는 메소드를 만드세요.​
		//	단, 같은 위치에 숫자가 없다 해당 해당 위치의 숫자를 그냥 출력하세요.
		System.out.println("문제 8");
		int[] arr1 = {78,54,89,57,84};
		int[] arr2 = {95,74,91,84};

		q8Prt(q8(arr1, arr2));


	}

	public static int q5(int[] arr) {

		int max = 0;
		if(arr.length==0 || arr==null) {
			max = -99999;
		}else {
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
		}

		return max;
	}

	public static int q6(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static double q7(int[] arr) {
		double avg=q6(arr)/(double)arr.length;
		return avg;
	}

	public static int[] q8(int[] arr1, int[] arr2) {
		int[] result=null;

		if(arr1.length<arr2.length) {
			result=new int[arr2.length];
			for(int i=0;i<arr2.length;i++) {
				if(i<arr1.length) {
					result[i]=arr1[i]+arr2[i];
				}else {
					result[i]=arr2[i];
				}

			}
		}else {
			result=new int[arr1.length];
			for(int i=0;i<arr1.length;i++) {
				if(i<arr2.length) {
					result[i]=arr2[i]+arr1[i];
				}else {
					result[i]=arr1[i];
				}
			}
		}
		return result;
	}
	
	
	public static void q8Prt(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.println(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
		}
	}


}
