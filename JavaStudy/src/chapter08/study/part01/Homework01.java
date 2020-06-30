package chapter08.study.part01;

import java.util.Scanner;

import chapter08.study.part01.dto.StudentDto;

public class Homework01 {
	static StudentDto[] stuList = new StudentDto[5];
	static Scanner in  = new Scanner(System.in);

	public static void main(String[] args) {
		//		2. 클래스을 사용해서 학생 성적을 관리해봅시다
		//		- 학생 5명의 이름은 고길동,김길동,이길동,박길동,홍길동 입력받는다.
		//		- 각각 학생의 점수는 국어,영어,수학 3과목의 점수를 입력받는다.
		//		- 학생 이름으로 개개인의 성적을 조회한다.
		//		- 전체 학생 성적을 과목별로 조회한다.
		//		(추가)각 학생의 평균 성적으로 석차를 만들어서 조회한다.
		while(true) {
			System.out.println("성적 관리 프로그램");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택>");

			int selNum = Integer.parseInt(in.nextLine());

			switch(selNum) {
			case 0://더미 데이터 입력
				dummy();
				break;
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
		ranking();
		for(StudentDto student: stuList) {		
			if(student != null) {
				System.out.println(student.getName()+" 학생의 석차 : "+student.getRanking());	
			}
		}
	}

	private static void check() {
		while(true) {
			System.out.println("-----성적 조회-----");
			System.out.println("1. 개인별 성적 조회");
			System.out.println("2. 과목별 성적 조회");
			System.out.println("3. 이전 메뉴 돌아가기");
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
			case 3:
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("메뉴로 돌아 갑니다.");
			}
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
		for(StudentDto student: stuList) {		
			if(student != null) {
				total += student.getScores(subjectName-1);
			}
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

	private static void checkPersonalScore(int personalIdx) {
		stuList[personalIdx].prt();
	}

	private static int personalSelect() {
		System.out.println("조회하고자 하는 학생의 이름을 입력하세요.");
		String name = in.nextLine();
		int idx = -1;
		for(int i=0;i<stuList.length;i++) {
			if(stuList[i]!=null) {
				if(stuList[i].getName().equals(name)) {
					idx = i;
					return idx;
				}
			}
		}
		return idx;
	}

	private static void input() {
		System.out.println("성적 정보를 입력하세요.");
		System.out.print("학생 이름> ");
		String name = in.nextLine();
		int[] scores = new int[3];
		System.out.print("국어점수> ");
		scores[0] = in.nextInt();
		System.out.print("영어점수> ");
		scores[1] = in.nextInt();
		System.out.print("수학점수> ");
		scores[2] = in.nextInt();

		StudentDto student = new StudentDto(name,scores);

		for(int i=0;i<stuList.length;i++) {
			if(stuList[i]==null) {
				stuList[i]=student;
				break;
			}
		}

		in.nextLine();
	}
	private static void dummy() {
		stuList[0] = new StudentDto("고길동",new int[] {78,64,82});
		stuList[1] = new StudentDto("김길동",new int[] {85,71,64});
		stuList[2] = new StudentDto("이길동",new int[] {74,69,57});
		stuList[3] = new StudentDto("박길동",new int[] {74,77,95});
		stuList[4] = new StudentDto("홍길동",new int[] {68,95,84});
		System.out.println("더미 데이터 입력 완료");
	}

	private static void ranking() {
		int rank = 0;
		for(int i=0;i<stuList.length;i++) {
			if(stuList[i]!=null) {
				for(int j=0;j<i;j++) {
					if(stuList[i].getAvg() > stuList[j].getAvg()) {
						rank = stuList[j].getRanking();
						stuList[j].setRanking(++rank);
					}else {
						rank = stuList[i].getRanking();
						stuList[i].setRanking(++rank);
					}
				}
			}
		}

	}
}