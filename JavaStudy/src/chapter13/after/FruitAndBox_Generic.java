package chapter13.after;

public class FruitAndBox_Generic {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		// 과일을 박스에 담는다. 
		aBox.set(new Apple());
		oBox.set(new Orange());

		// 박스에서 과일을 꺼내는데 형 변환 하지 않는다.
		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}

}
