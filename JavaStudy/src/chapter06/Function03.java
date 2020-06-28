package chapter06;

public class Function03 {

	public static void main(String[] args) {
		hello();
		hello("고길동", 45);
		
		int r = dice();
		System.out.println("주사위 값 : "+r);
		
		int num1 = 3;
		int num2 = 5;
		int result = adder(num1,num2);
		System.out.println("합계 : "+result);
	}

	private static void hello(){//1
	    System.out.println("안녕하세요");
	}

	private static void hello(String name, int age){//2
	    System.out.println("내 이름은 "+name+"입니다.");
	    System.out.println("내 나이은 "+age+"살 입니다.");
	}

	private static int dice(){//3
	    int dice = (int)(Math.random()*6)+1;
	    return dice;
	}

	private static  int adder(int a, int b){//4
		int c = a+b;
		return c;
	}

}
