package chapter18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main09 {

	public static void main(String[] args) throws Exception {
		File file = new File("E:\\image\\woman-1149911_1920.jpg");
		FileInputStream fis = new FileInputStream(file);
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1){
			System.out.println(new String(readBytes));
		}
		fis.close();
	}

}
