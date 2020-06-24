package chapter04;

import java.util.Random;

public class Draw02 {

	public static void main(String[] args) {
		Random r =new Random();
		
		int num = r.nextInt(45)+1;
		
		System.out.println("임의의 수 : "+ num);

		
	}

}
