package chapter18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main08 {

	public static void main(String[] args) throws Exception {
		File file = new File("E:\\image\\woman-1149911_1920.jpg");
		FileInputStream fis = new FileInputStream(file);
		int data;
		while ( (data = fis.read() ) != -1 ) {  
			System.out.write(data);
		}
		fis.close();	


	}

}
