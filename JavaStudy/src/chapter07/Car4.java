package chapter07;

public class Car4 {
	public static String corporation;
	
	static {
		corporation="현대";
	}

	public static void setCorporation(String corporation) {
		Car4.corporation = corporation;
	}
	
	
	String model = "아반떼";
	String color = "white";
	int length = 100;
	int speed = 0;
	
	public Car4() {}
	
	public Car4(String model){
		this.model = model;
	}
	
	public Car4(String model,String color){
		this(model);
		this.color = color;
	}
	
	public Car4(String model,String color,int length){
		this(model,color);
		this.length = length;
	}
	
	public void prt(){
		System.out.println("차량 모델 : "+this.model);
		System.out.println("차량 색상 : "+this.color);
		System.out.println("차량 길이 : "+this.length);
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
