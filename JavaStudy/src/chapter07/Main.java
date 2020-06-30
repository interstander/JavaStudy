package chapter07;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println("차량1의 색상 : "+car1.color);
		System.out.println("차량2의 색상 : "+car2.color);
		
		System.out.println("---각 차량을 도색한 후 ---");
		car1.color = "black";
		car2.color = "pink";
		System.out.println("차량1의 색상 : "+car1.color);
		System.out.println("차량2의 색상 : "+car2.color);
		

	}
}



