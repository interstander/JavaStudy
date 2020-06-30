package chapter07;

public class Car2 {
	String color = "white";
	int speed = 0;
	
	public Car2(String color){
		this.color = color;
	}

	public void forward(){ //전진
		speed++;
		System.out.println("전진");
	}
	public void backward(){ //후진
		speed--;
		System.out.println("후진");
	}
}
