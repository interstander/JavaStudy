package chapter18;

import java.io.IOException;
import java.io.InputStream;

public class Main02 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;

		char asciiLetter = (char)is.read();

		System.out.println(asciiLetter);
		is.close();
	}

}
