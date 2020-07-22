package chapter18;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main12 {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		String fileName = "E:\\image\\spring-276014_1920.jpg";
		File file = new File(fileName);
		
		FileInputStream fis1 = new FileInputStream(file);
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();

		FileInputStream fis2 = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end-start) + "ms");
		bis.close();
		fis2.close();

	}

}
