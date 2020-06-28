package chapter06;

public class Overloading02 {

	public static void main(String[] args) {
		info("고길동");
		info("홍길동",25);
		info("asdf","1234");
		info(123,"코드 컴플리트");

	}
	private static void info(String name) {
		System.out.println("이름 : "+name);
	}
	private static void info(String name, int age) {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	private static void info(String id, String pw) {
		System.out.println("아이디 : "+id);
		System.out.println("비밀번호 : "+pw);
	}
	private static void info(int number, String title) {
		System.out.println("번호 : "+number);
		System.out.println("제목 : "+title);
	}
//	private static String info(String title, int page) {
//		System.out.println("제목 : "+title);
//		System.out.println("페이지 : "+page);
//	}
	
}
