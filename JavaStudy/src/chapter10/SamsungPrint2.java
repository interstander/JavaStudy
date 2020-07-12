package chapter10;

public class SamsungPrint2 implements Printable2{

	@Override
	public void print(String doc) {
		System.out.println("삼성프린터");
		System.out.println(doc+"를 인쇄합니다.");
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("삼성프린터");
		System.out.println("컬러로 "+doc+"를 인쇄합니다.");
	}

}
