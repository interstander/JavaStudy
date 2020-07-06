package chapter09;

public class Main06 {

	public static void main(String[] args) {
		Car myCar = new SUVCar();
		
		Boolean result1 = myCar instanceof SUVCar;
		System.out.println("myCar인스턴스는 \n"
				+ "SUVCar참조타입의 참조변수에 \n"
				+ "담을수 있는가? : "+result1);
		
		SUVCar hisCar = (SUVCar)myCar;
		
		System.out.println("-------------------------");
		Car yourCar = new Car();
		
		Boolean result2 = yourCar instanceof SUVCar;
		System.out.println("yourCar인스턴스는 \n"
				+ "SUVCar참조타입의 참조변수에 \n"
				+ "담을수 있는가? : "+result2);
		
		SUVCar herCar = (SUVCar)yourCar;

	}

}
