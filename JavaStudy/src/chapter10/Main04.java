package chapter10;

public class Main04 {

	public static void main(String[] args) {
		String doc = "\'이것은 문서입니다.\'";
		
		//삼성프린터로 출력
		SamsungPrint  sp = new SamsungPrint();
		sp.print(doc);
		System.out.println();
		
		//Lg 프린터로 출력
		LgPrint lp = new LgPrint();
		lp.print(doc);
		System.out.println();
		
	}

}
