package chapter09;

public class Car {
	String color = "white";
	int speed = 0;

	public void forward(){ //전진
		speed++;
		System.out.println("전진");
	}
	public void backward(){ //후진
		speed--;
		System.out.println("후진");
	}
}
