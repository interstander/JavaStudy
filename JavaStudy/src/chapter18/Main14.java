package chapter18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main14 {

	public static void main(String[] args) throws Exception {
		File file = new File("E:/Temp/file.txt");	
		FileWriter fw = new FileWriter(file, true);
		
		PrintWriter ps = new PrintWriter(fw);
		ps.println("안녕하세요");
		ps.print("프린트 출력");

		ps.flush();
		ps.close();
		System.out.println("기록 완료");

	}

}
