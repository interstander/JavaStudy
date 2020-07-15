package chapter05.homework;

import java.util.Random;

public class Homework03 {

	public static void main(String[] args) {
		//3. 1부터 45사이 숫자중 1000번의 번호를 뽑은 후   
		//가장 많이 나오는 것 부터 6개를 최종 번호로 출력
		System.out.println("12.  1부터 45 중에서 ");
		System.out.println("1000개의 번호를 뽑은 후 가장 많이 나오는 것 부터 6개를 최종 번호로 출력.");
		Random in = new Random();

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
