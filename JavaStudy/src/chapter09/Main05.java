package chapter09;

public class Main05 {

	public static void main(String[] args) {
		Car myCar = new ConvertibleCar();
		myCar.forward();
		myCar.backward();
		//myCar.open();
		System.out.println("-------------------------");
		Car yourCar = new SUVCar();
		yourCar.forward();
		yourCar.backward();
		System.out.println("-------------------------");
		SUVCar hisCar = (SUVCar)yourCar;
		hisCar.forward();
		hisCar.backward();

	}

}
