package chapter13.after;

public class FruitAndBox_Fault {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		// 과일을 박스에 담은 것일까? 
//		aBox.set("Apple");    //에러가 발생하며 애초에 매개변수로 전달할수 없다.
//		oBox.set("Orange");

		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}

}
