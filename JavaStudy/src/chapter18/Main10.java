package chapter18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main10 {

	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Temp\\woman.jpg");
		FileOutputStream fos = new FileOutputStream(file);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		fos.write(readBytes);
		
		fos.flush();
		fos.close();
		System.out.println("이미지 출력 완료");

	}

}
