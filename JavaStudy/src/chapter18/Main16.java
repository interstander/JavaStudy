package chapter18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main16 {

	public static void main(String[] args) throws Exception {
		String targetFileName = "E:/Temp/aa.xx";
		File targetFile = new File(targetFileName);
		//기록
		FileOutputStream fos = new FileOutputStream(targetFile);
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush(); dos.close(); fos.close();
		//읽어오기
		FileInputStream fis = new FileInputStream(targetFile);
		DataInputStream dis = new DataInputStream(fis);

		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}

		dis.close(); fis.close();
	}

}
