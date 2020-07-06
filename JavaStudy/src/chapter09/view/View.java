package chapter09.view;

import chapter09.dto.Member;
import chapter09.dto.Student;
import chapter09.dto.Teacher;
import chapter09.main.Main;

public class View {
	
	public static Member sign_up() {
		Member member = null;
		System.out.println("이름을 입력하세요.");
		String m_name = Main.in.nextLine();
		System.out.println("아이디을 입력하세요.");
		String m_id = Main.in.nextLine();
		System.out.println("비밀번호을 입력하세요.");
		String m_pwd = Main.in.nextLine();
		System.out.println("1.교사 | 2.학생");
		String m_position = Main.in.nextLine();
		if(m_position.equals("1")) {
			System.out.println("담당 과목을 입력하세요.");
			String m_subject = Main.in.nextLine();
			member = new Teacher(m_name,m_id,m_pwd,m_position,m_subject);
		}else if(m_position.equals("2")) {
			System.out.println("전공을 입력하세요.");
			String m_major = Main.in.nextLine();
			member = new Student(m_name,m_id,m_pwd,m_position,m_major);
		}else {
			System.out.println("잘못 선택했습니다.");
		}
		return member;
	}

	public static Member sign_in() {
		int chk = 0;
		Member member = null;
		System.out.println("아이디을 입력하세요.");
		String m_id = Main.in.nextLine();
		System.out.println("비밀번호을 입력하세요.");
		String m_pwd = Main.in.nextLine();
		for(int i=0;i<Main.members.length;i++) {
			if(Main.members[i] != null) {
				if(Main.members[i].getM_id().equals(m_id)
						&& Main.members[i].getM_pwd().equals(m_pwd)) {
					System.out.println("로그인 성공");
					member = Main.members[i];
					chk = 1;
				}
			}else {
				break;
			}
		}
		return member;

	}

	public static int menu() {
		System.out.println("그린 학사 정보 시스템");
		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 로그아웃");
		System.out.println("4. 프로그램 종료");
		System.out.println("***********************");
		System.out.print("메뉴를 선택하세요.>");

		int selNum = Integer.parseInt(Main.in.nextLine());
		return selNum;
	}

}
