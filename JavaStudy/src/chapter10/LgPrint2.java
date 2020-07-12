package chapter10;

public class LgPrint2 implements Printable2{

	@Override
	public void print(String doc) {
		System.out.println("LG프린터");
		System.out.println(doc+"를 인쇄합니다.");
	}

}
