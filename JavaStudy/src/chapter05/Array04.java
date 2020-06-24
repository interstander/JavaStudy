package chapter05;

public class Array04 {

	public static void main(String[] args) {
		int[] nums = {78,85,80,67,92,61};
		int sum = 0;
		//일반 반복문으로 합계 구하기
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		System.out.println("일반 for문 합계 : "+sum);
		System.out.println();
		
//		int[] nums = {78,85,80,67,92,61};
//		int sum = 0;
		sum=0;
		//향상된 for문으로 합계 구하기
		for(int n:nums) {
			sum+=n;
		}
		System.out.println("향상된 for문 합계 : "+sum);
	}

}
//chapter05