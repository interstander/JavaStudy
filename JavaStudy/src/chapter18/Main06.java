package chapter18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main06 {

	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Study\\LECTURE\\WorkSpace\\JavaStudy\\src\\chapter18\\Main05.java");
		FileReader fr = new FileReader(file);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf);
			System.out.print(data);
		}
		fr.close();

	}

}
