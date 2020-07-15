package chapter13.before;

public class FruitAndBox {

	public static void main(String[] args) {
		// 과일 담는 박스 생성
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();

		// 과일을 박스에 담는다. 
		aBox.set(new Apple());
		oBox.set(new Orange());

		// 박스에서 과일을 꺼낸다.
		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}

}
