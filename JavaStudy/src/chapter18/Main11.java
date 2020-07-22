package chapter18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main11 {

	public static void main(String[] args) throws Exception {
		String originalFileName = "E:\\image\\spring-276014_1920.jpg";
		String targetFileName = "E:\\Temp\\spring.jpg";
		
		File originalFile = new File(originalFileName);
		File targetFile = new File(targetFileName);
		
		FileInputStream fis = new FileInputStream(originalFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while( (readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}

}
