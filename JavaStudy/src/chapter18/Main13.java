package chapter18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main13 {

	public static void main(String[] args) throws Exception {
		String originalFileName = "E:\\image\\spring-276014_1920.jpg";
		String targetFileName = "E:\\Temp\\spring.jpg";

		File originalFile = new File(originalFileName);
		File targetFile = new File(targetFileName);

		int data = -1;
		long start = 0;
		long end = 0;

		FileInputStream fis1 = new FileInputStream(originalFile);
		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		FileOutputStream fos1 = new FileOutputStream(targetFile);				
		start = System.currentTimeMillis();
		while((data = bis1.read()) != -1) {
			fos1.write(data);
		}
		fos1.flush();
		end = System.currentTimeMillis();
		fos1.close(); 	bis1.close();  fis1.close();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");

		FileInputStream fis2 = new FileInputStream(originalFile);
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		FileOutputStream fos2 = new FileOutputStream(targetFile);		
		BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
		start = System.currentTimeMillis();
		while((data = bis2.read()) != -1) {
			bos2.write(data);
		}
		bos2.flush();
		end = System.currentTimeMillis();
		bos2.close(); fos2.close(); 	bis2.close(); fis2.close();
		System.out.println("사용했을 때: " + (end-start) + "ms");

	}

}
