package chapter02;

public class Homework {

	public static void main(String[] args) {
//		과제 : 국어점수, 수학점수, 영어점수를 각각 변수에 담고
//		총점과 평균을 출력하는 프로그램을 작성해 보세요. 
//		-국어점수(kor)
//		-수학점수(math)
//		-영어점수(eng)
//		-총점(sum)
//		-평균(avg)
		
		int kor = 87;
		int math = 76;
		int eng = 62;
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		System.out.printf("국어 점수 : %d \n",kor);
		System.out.printf("수학 점수 : %d \n",math);
		System.out.printf("영어 점수 : %d \n",eng);
		System.out.println();
		System.out.printf("총점 : %d \n",sum);
		System.out.printf("평균 : %f \n",avg);

	}

}
