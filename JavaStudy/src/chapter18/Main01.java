package chapter18;

import java.io.IOException;
import java.io.InputStream;

public class Main01 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		int asciiCode = is.read();
		
		System.out.println(asciiCode);
		is.close();

	}

}
