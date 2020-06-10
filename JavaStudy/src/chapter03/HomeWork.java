package chapter03;

public class HomeWork {

	public static void main(String[] args) {
		//문제 1)가로가 3이고 세로가 6인 사각형의 넓이
		int height = 6;
		int length = 3;
		int lec_area = height * length;
		System.out.println("넓이 : "+lec_area);

		System.out.println();
		//문제 2)위 길이의 삼각형의 넓이
		int tri_area = (height * length)/2;
		System.out.println("넓이 : "+tri_area);

		System.out.println();
		// 문제 3) 성적이 40, 30, 10 나왔다 평균은 ?
		double avg = (40+30+10)/3.0;
		System.out.println("평균 : "+avg);

		System.out.println();
		//문제 4) 월급이 100원이다 연봉은? (세금 20프로제외)
		int salary = 100;
		double annual_salary = (salary*12)*0.8;
		System.out.println("연봉 : "+annual_salary);

		System.out.println();
		//문제 5) 286 초를 분초로 출력
		int time = 286;
		int min = time/60;
		int sec = time%60;
		System.out.println(min+"분 "+sec+"초");

		System.out.println();
		//문제 6)
		int x = 10;
		int y = 5;
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3==0) || (y%2 !=1));
		//결과를 추측해보자
		//   true
		//   false
		
		System.out.println();
		//문제7) 176840원 을 화폐매수대로 출력
		int money = 176840;
		int unit = 50000;

		int ohman = money / unit;
		money %=unit;
		unit /=5;

		int man = money / unit;
		money %=unit;
		unit /=2;

		int ohcheon = money / unit;
		money %=unit;
		unit /=5;

		int cheon = money / unit;
		money %=unit;
		unit /=2;

		int ohbeak = money / unit;
		money %=unit;
		unit /=5;

		int beak = money / unit;
		money %=unit;
		unit /=2;

		int ohsip = money / unit;
		money %=unit;
		unit /=5;

		int sip = money / unit;

		System.out.println("오 만원 : "+ohman+"장");
		System.out.println("만    원 : "+man+"장");
		System.out.println("오 천원 : "+ohcheon+"장");
		System.out.println("천    원 : "+cheon+"장");
		System.out.println("오 백원 : "+ohbeak+"개");
		System.out.println("백    원 : "+beak+"개");
		System.out.println("오 십원 : "+ohsip+"개");
		System.out.println("십    원 : "+sip+"개");


		System.out.println();
//		문제8)
//		점수에 따라 등급을 을 출력해보자
//		90이상 A
//		80이상 B
//		70이상 C
//		60이상 D
//		59이하 F
		int jum = 850;

		char grade = (jum >= 90)? 'A':
						(jum >= 80)? 'B':
							(jum >= 70)? 'C':
								(jum >= 60)? 'D':'F';
		System.out.println("등급 : "+grade);


	}

}
