package chapter09.homework.contoller;

import chapter09.homework.dto.Member;
import chapter09.homework.main.Main;
import chapter09.homework.view.View;

public class Controller {
	public static boolean run = true;

	public Controller(){
		init();
	}

	private void init() {
		while(run) {
			int selNum = View.menu();
			Member member = null;

			switch(selNum) {
			case 1://회원 가입 
				signUp();
				break;
			case 2:// 로그인 
				signIn();
				break;
			case 3://로그 아웃
				logout();
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인 하고 선택해 주세요.");
			}
		}

	}

	private void logout() {
		if(Main.flag == null) {
			System.out.println("이미 로그 아웃되었습니다.");
		}else {
			Main.flag = null;
			System.out.println("로그 아웃 처리가 되었습니다.");
		}
		
	}

	private void signIn() {
		if(Main.flag != null) {
			System.out.println(Main.flag.getM_name()+"님이 이미 로그인 되어있습니다.");
			work(Main.flag);
		}else {
			System.out.println("로그인");
			Main.flag = View.sign_in();
			if(Main.flag!=null) {
				work(Main.flag);	
			}else {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
			}
		}
		
	}

	private void signUp() {
		Member member = null;
		System.out.println("회원 가입");
		member = View.sign_up();
		if(member == null) {
			System.out.println("회원 가입 실패");
			System.out.println("다시 확인해 주세요.");
			return;
		}
		for(int i=0;i<Main.members.length;i++) {
			if(Main.members[i]==null) {
				Main.members[i]=member;
				break;
			}
		}
		System.out.println("회원 가입 완료");
	}

	private void work(Member member) {
		member.work();
		member.test();		
	}

}
