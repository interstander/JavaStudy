package chapter07.homework;

import java.util.Scanner;

public class Board8Controller {
	Scanner scan = new Scanner(System.in); 

	public Board8Controller(){ 
		init(); 
	} 

	private void init() { 
		boolean run = true; 

		while(run) { 
			System.out.println(" --- 게시판 ---"); 
			System.out.println("1. 글 목록 보기"); 
			System.out.println("2. 글 작성"); 
			System.out.println("3. 글 삭제"); 
			System.out.println("4. 프로그램 종료"); 
			System.out.print("선택>"); 
			int selNum = Integer.parseInt(scan.nextLine()); 

			switch(selNum) { 
			case 1://글 목록 보기 
				SelectList(); 
				break; 
			case 2://글 작성 
				write(); 
				break; 
			case 3://글 삭제 
				deleteList(); 
				break; 
			case 4: 
				System.out.println("프로그램 종료"); 
				run = false; 
				break; 
			default: 
				System.out.println("잘못 입력했습니다.\n 다시 확인해 주세요."); 
			} 
		} 
	} 

	private void write() { 
		System.out.println("글 작성을 시작합니다."); 
		System.out.println("글 제목을 작성해 주세요."); 
		String title = scan.nextLine(); 
		System.out.println("작성자 을 작성해 주세요."); 
		String writer = scan.nextLine(); 
		System.out.println("글 내용을 작성해 주세요."); 
		String content = scan.nextLine(); 
		System.out.println("삭제시 확인할 비밀번호을 작성해 주세요."); 
		String pwd = scan.nextLine(); 

		Board8 board = new Board8(title, writer, content, pwd); 

		if(save(board)) { 
			System.out.println("저장 성공"); 
		}else { 
			System.out.println("저장 실패"); 
		} 

	} 

	private boolean save(Board8 board) { 
		boolean chk = false; 
		for(int i=0;i<Homework08.boards.length;i++) { 
			if(Homework08.boards[i]==null) { 
				Homework08.boards[i] = board; 
				chk=true; 
				break; 
			} 
		} 
		return chk; 
	} 

	private void deleteList() { 
		int lastNum = list(); 
		if(lastNum != 0) { 
			System.out.println("삭제하고자 하는 글의 번호을 입력하세요.(0번 입력시 돌아갑니다.)"); 
			System.out.print("선택>"); 
			int selectNum = Integer.parseInt(scan.nextLine()); 
			if(selectNum==0) { 
				return; 
			}else if(1<=selectNum || selectNum<lastNum){ 
				check(selectNum); 
			}else { 
				System.out.println("번호를 잘못 입력했습니다. \n 메인 메뉴로 돌아갑니다."); 
			} 
		}else { 
			System.out.println("작성된 글이 없습니다."); 
		} 
	} 

	private void check(int selectNum) { 
		System.out.println("삭제하고자 하는 글의 비밀번호을 입력하세요."); 
		String pwd = scan.nextLine(); 

		if(Homework08.boards[selectNum-1].getPassword().equals(pwd)) { 
			System.out.println("해당 글을 삭제 합니다."); 
			Homework08.boards[selectNum-1] =null; 
		}else { 
			System.out.println("비밀번호가 틀렸습니다. \n 다시 확인해 주세요."); 
		} 
	} 

	private void SelectList() { 
		int lastNum =list(); 
		if(lastNum != 0) { 
			System.out.println("보고자 하는 글의 번호을 입력하세요.(0번 입력시 돌아갑니다.)"); 
			System.out.print("선택>"); 
			int selectNum = Integer.parseInt(scan.nextLine()); 

			if(selectNum==0) { 
				return; 
			}else if(1<=selectNum || selectNum<lastNum){ 
				Homework08.boards[selectNum-1].prt(); 
			}else { 
				System.out.println("번호를 잘못 입력했습니다. \n 메인 메뉴로 돌아갑니다."); 
			} 
		}else { 
			System.out.println("작성된 글이 없습니다."); 
		} 

	} 

	private int list() { 
		int cnt = 0; 
		for(int i=0;i<Homework08.boards.length;i++) { 
			if(Homework08.boards[i] != null) { 
				System.out.println((i+1)+" 번째 글 : 제목 : "+Homework08.boards[i].getTitle()); 
				cnt++; 
			} 
		} 
		return cnt; 
	} 
} 