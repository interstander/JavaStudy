package chapter07;

public class Main3 {

	public static void main(String[] args) {
		String model = "소나타";
		String color = "black";
		int length = 150;
		
		Car3 car1 = new Car3(model);
		Car3 car2 = new Car3(model,color);
		Car3 car3 = new Car3(model,color,length);
		
		car1.prt();
		car2.prt();
		car3.prt();
	
	}

}
