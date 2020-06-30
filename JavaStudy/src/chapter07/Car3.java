package chapter07;

public class Car3 {
	String model = "아반떼";
	String color = "white";
	int length = 100;
	int speed = 0;
	
	public Car3(String model){
		this.model = model;
	}
	
	public Car3(String model,String color){
//		this.model = model;
		this(model);
		this.color = color;
	}
	
	public Car3(String model,String color,int length){
//		this.model = model;
//		this.color = color;
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
