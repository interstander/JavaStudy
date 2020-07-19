package chapter16;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main07 {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		IntBinaryOperator operator;
		
		//정적 메소드 참조
		operator = (x,y)->{return Calculator.staticMethod(x, y);};
		System.out.println("정적메소드 참조 결과1 : "+operator.applyAsInt(a, b));
		
		operator = Calculator::staticMethod;
		System.out.println("정적메소드 참조 결과2 : "+operator.applyAsInt(a, b));
		
		//인스턴스 메소드 참조
		Calculator cal = new Calculator(a, b);
		operator = (x,y)->{return cal.instanceMethod(x, y);};
		System.out.println("인스턴스 메소드 참조 결과1 : "+operator.applyAsInt(a, b));
		
		operator = cal::instanceMethod;
		System.out.println("인스턴스 메소드 참조 결과2 : "+operator.applyAsInt(a, b));
		
		//생성자 참조
		BiFunction<Integer, Integer, Calculator> func;
		
		func = (x,y)->{return new Calculator(x,y);};
		Calculator cal1 = func.apply(a, b);
		
		func = Calculator::new;
		Calculator cal2 = func.apply(a, b);

	}

}
