package chapter07;

public class FinalMain {
	final static String CONSTANT = "상수";
	final String NAME = "안녕하세요";
	
	public static void main(String[] args) {
		 FinalMain fm = new FinalMain();
		 
		 System.out.println(fm.NAME);
		 
//		 fm.NAME = "반갑습니다.";
//		 
//		 FinalMain.CONSTANT = "바꿀수 없다.";

	}

}
