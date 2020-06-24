package chapter05;

public class Array03 {

	public static void main(String[] args) {
		//예제: 4명의 학생에게 3개의 점수을 받아서 모든 점수의 총점과 평균을 구합니다.
		int[][] num = {
				{67,78,96},
				{77,88,86},
				{69,89,78},
				{98,79,65}
				};
		int sum = 0;
		double avg = 0.0;
		
		
		//1단계 : int[] 데이터를 담는 배열의 각 요소를 추출하기 위한 반복문
		for(int i=0;i<num.length;i++) {
			System.out.printf("num 배열의 %d 번째 요소 \n",(i+1));
		}
		System.out.println();
		
		//2단계: 내부 배열의 각 요소를 추출하기 위한 반복문
		System.out.println("num[0] 배열 요소 추출");
		for(int j=0;j<num[0].length;j++) {
			System.out.printf("num[0] 배열의 %d 번째 요소 \n",(j+1));
		}
		System.out.println();
		System.out.println("num[1] 배열 요소 추출");
		for(int j=0;j<num[0].length;j++) {
			System.out.printf("num[1] 배열의 %d 번째 요소 \n",(j+1));
		}
		System.out.println();
		System.out.println("num[2] 배열 요소 추출");
		for(int j=0;j<num[0].length;j++) {
			System.out.printf("num[2] 배열의 %d 번째 요소 \n",(j+1));
		}
		System.out.println();
		System.out.println("num[3] 배열 요소 추출");
		for(int j=0;j<num[0].length;j++) {
			System.out.printf("num[3] 배열의 %d 번째 요소 \n",(j+1));
		}
		System.out.println();
		//3단계 1~2단계 결합  => 이중 반복문
		for(int i=0;i<num.length;i++) {
			System.out.printf("num[%d] 배열 요소 추출\n",(i+1));
			for(int j=0;j<num[i].length;j++) {
				System.out.printf("num[%d] 배열의 %d 번째 요소 \n",(i+1),(j+1));
			}
		}
		System.out.println();
		//4단계 3단계 배열 추출을 통해서 총점 구하기
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				sum +=num[i][j];
			}
		}
		System.out.println("전체 합계 : "+sum);
		//5단계 4단계에서 전체 개수를 구하기
		int cnt = 0;
		sum=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				sum +=num[i][j];
				cnt++;
			}
		}
		//6단계 평균 구하기
		avg = sum/(double)cnt;
		System.out.println("전체 평균 : "+avg);
		

	}

}
