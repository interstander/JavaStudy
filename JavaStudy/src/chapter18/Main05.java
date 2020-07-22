package chapter18;

import java.io.IOException;
import java.io.OutputStream;

public class Main05 {

	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		String name = "고길동";
		byte[] nameBytes = name.getBytes();  //문자열을 바이트 배열로 전환하는 메소드
		os.write(nameBytes);
		os.close();
	}

}
