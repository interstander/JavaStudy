package chapter04;

import java.io.IOException;

public class ConsoleInput01 {

	public static void main(String[] args) throws Exception {
		int keyCode = System.in.read();
		
		System.out.println(keyCode);
		System.out.write(keyCode);
		System.out.flush();
		
	}

}
