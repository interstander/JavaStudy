package chapter18;

import java.io.IOException;
import java.io.OutputStream;

public class Main04 {

	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		int b = 97;
		os.write(b);
		os.close();

	}

}
