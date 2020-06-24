package chapter05;

public class Array02 {

	public static void main(String[] args) {
		//다차원 배열 선언
		int[] num01 = new int[5];
		
		int[][] num02 = new int[5][];
		num02[0] = new int[3];
		num02[1] = new int[3];
		num02[2] = new int[3];
		num02[3] = new int[3];
		num02[4] = new int[3];
		
		//=>
		int[][] num03 = new int[5][3];
		
		System.out.println("num03 배열의 길이 : "+num03.length);
		System.out.println("num03[0] 배열의 길이 : "+num03[0].length);
		
		//초기화
		int[][] num04 = new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		//가독성을 위해서
		int[][] num05 = new int[][]{
            						{1,2,3,4,5},
            						{6,7,8,9,10},
            						{11,12,13,14,15}
								};
								

	}

}
