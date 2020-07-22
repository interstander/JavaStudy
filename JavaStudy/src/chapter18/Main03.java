package chapter18;

import java.io.IOException;
import java.io.InputStream;

public class Main03 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		byte[] byteDate = new byte[15];
		
		int readByteNo = System.in.read(byteDate);

		String str = new String(byteDate);

		System.out.println(str);
		is.close();

	}

}
