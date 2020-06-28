package chapter06;

import java.util.Scanner;

public class Homework02 {
	static Scanner in  = new Scanner(System.in);

	static String[] names = new String[] {"고길동","김길동","이길동","박길동","홍길동"};
	static int[][] scores = new int[5][4];
	static double[] avg = new double[5];
	static int[] ranking = new int[] {1,1,1,1,1};

	public static void main(String[] args) {
		//		2. 배열을 사용해서 학생 성적을 관리해봅시다
		//		- 학생 5명의 이름은 고길동,김길동,이길동,박길동,홍길동
		//		- 각각 학생의 점수는 국어,영어,수학 3과목의 점수를 입력받는다.
		//		- 학생 이름으로 개개인의 성적을 조회한다.
		//		- 전체 학생 성적을 과목별로 조회한다.
		//	(추가)각 학생의 평균 성적으로 석차를 만들어서 조회한다.

		while(true) {
			System.out.println("성적 관리 프로그램");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택>");

			int selNum = Integer.parseInt(in.nextLine());

			switch(selNum) {
			case 1://성적 입력
				input();
				break;
			case 2://성적 조회
				check();
				break;
			case 3://석차 조회
				checkRanking();
				break;
			case 4://프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default :
				System.out.println("잘못 입력했습니다.");
				System.out.println("1~4번중에 선택해 주세요.");
			}
		}

	}

	private static void checkRanking() {
		for(int i=0;i<ranking.length;i++) {
			System.out.println(names[i]+"학생 석차 : "+ranking[i]);
		}
	}

	private static void check() {
		System.out.println("-----성적 조회-----");
		System.out.println("1. 개인별 성적 조회");
		System.out.println("2. 과목별 성적 조회");
		System.out.print("선택> ");

		int selNum = Integer.parseInt(in.nextLine());

		switch(selNum) {
		case 1://개인 별 성적 조회
			int personalIdx = personalSelect();
			if(personalIdx == -1) {
				System.out.println("학생 이름을 조회 할수 없습니다.");
			}else {
				checkPersonalScore(personalIdx);
			}
			break;
		case 2://과목별 성적 조회
			subjectSelect();
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			System.out.println("메뉴로 돌아 갑니다.");
		}

	}

	private static void subjectSelect() {
		System.out.println("조회 하려는 과목을 선택하세요");
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");
		System.out.print("선택>");
		int subjectName = Integer.parseInt(in.nextLine());

		switch(subjectName) {
		case 1:
		case 2:
		case 3:
			checkSubject(subjectName);
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			System.out.println("메뉴로 돌아 갑니다.");
		}
	}

	private static void checkSubject(int subjectName) {
		int total =0;

		for(int i=0;i<scores.length;i++) {
			total +=scores[i][subjectName-1];
		}
		double avg = total/5.0;
		if(subjectName == 1) {
			System.out.println("전체 국어 총점 : "+total);
			System.out.println("전체 국어 평균 : "+avg);
		}else if(subjectName == 2) {
			System.out.println("전체 영어 총점 : "+total);
			System.out.println("전체 영어 평균 : "+avg);
		}else if(subjectName == 3) {
			System.out.println("전체 수학 총점 : "+total);
			System.out.println("전체 수학 평균 : "+avg);
		}
	}

	private static void checkPersonalScore(int idx) {
		System.out.println("학생 이름 : "+names[idx]);
		System.out.println("국어 점수 : "+scores[idx][0]);
		System.out.println("영어 점수 : "+scores[idx][1]);
		System.out.println("수학 점수 : "+scores[idx][2]);
		System.out.println(" 총   점  : "+scores[idx][3]);
		System.out.println(" 평   균  : "+avg[idx]);
		System.out.println(" 석   차  : "+ranking[idx]);
	}

	private static int personalSelect() {
		System.out.println("조회하고자 하는 학생의 이름을 입력하세요.");
		String name = in.nextLine();
		for(int i=0;i<names.length;i++) {
			if(name.equals(names[i])){
				return i;
			}
		}
		return -1;
	}

	private static void input() {
		System.out.println("성적 정보를 입력하세요.");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" 학생");
			System.out.print("국어점수> ");
			scores[i][0] = in.nextInt();
			System.out.print("영어점수> ");
			scores[i][1] = in.nextInt();
			System.out.print("수학점수> ");
			scores[i][2] = in.nextInt();
			scores[i][3] = scores[i][0]+scores[i][1]+scores[i][2];
			avg[i] = scores[i][3]/3.0;

			for(int j=0;j<i;j++) {
				if(avg[i] > avg[j]) {
					ranking[j]++;
				}else {
					ranking[i]++;
				}
			}
		}
		in.nextLine();

	}

}
