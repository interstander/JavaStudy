package chapter07.homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		System.out.println("문제 5");
		//		1. 회원 가입, 로그인, 종료
		//		로그인 성공시 이름과 전화번호 출력하는 코드를 작성해보자
		//		---------
		//
		//		1. 아이디, 비밀번호, 이름,전화번호 4가지 정보를 담을수 있는 Member클래스를 만들어 봅시다.
		//		- 생성자로 4가지 정보를 모두 받아서 초기화 합니다.
		//		- prt이름으로 이름과 전화번호를 출력하는 메소드를 제작합니다.
		//		2.  MemberExample 클래스에 회원 가입과 로그인 기능을 가지는 코드를 작성합니다.

		// 회원 가입과 로그인, 종료하는 프로그램을 만들어 봅시다.

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Member6[] m_list = new Member6[100];


		while(run) {
			System.out.println("----------------------");
			System.out.println("1.회원가입|2.로그인|3.종료");
			System.out.println("----------------------");
			System.out.print("선택>");

			int selNum = sc.nextInt();
			sc.nextLine();

			switch(selNum) {
			case 1://회원 가입
				System.out.println("회원 가입을 진행 하겠습니다.");
				System.out.println("아이디를 입력하세요.");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력하세요.");
				String pw = sc.nextLine();
				System.out.println("이름를 입력하세요.");
				String name = sc.nextLine();
				System.out.println("전화 번호를 입력하세요.");
				String phone = sc.nextLine();

				Member6 m = new Member6(id,pw,name,phone);

				for(int i=0;i<m_list.length;i++) {
					if(m_list[i] == null) {
						m_list[i]=m;
						break;
					}
				}
				System.out.println("회원 가입이 완료 되었습니다.");

				break;
			case 2: //로그인
				System.out.println("로그인을 진행 하겠습니다.");
				int chk = 0;
				System.out.println("아이디를 입력하세요.");
				String l_id = sc.nextLine();
				for(int i=0;i<m_list.length;i++) {
					if(m_list[i] != null) {
						if(m_list[i].m_Id.equals(l_id)) {
							System.out.println("아이디가 있습니다.");
							chk = 1;
							System.out.println("비밀번호를 입력하세요.");
							String l_pw = sc.nextLine();
							if(m_list[i].m_pw.equals(l_pw)) {
								System.out.println("로그인 성공");
								m_list[i].prt();
							}else {
								System.out.println("비밀번호가 틀렸습니다.");
								break;
							}
						}
					}else {
						break;
					}
				}
				if(chk==0) {
					System.out.println("아이디를 찾을수 없습니다.");
					System.out.println("다시 확인 해주세요.");
				}

				break;
			case 3://종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				break;

			}
		}
	}
}