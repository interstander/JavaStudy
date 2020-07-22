package chapter18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main18 {

	public static void main(String[] args) throws Exception {
		String targetFileName = "E:/Temp/Object.xxx";
		File targetFile = new File(targetFileName);
		FileOutputStream fos = new FileOutputStream(targetFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		oos.writeObject(classA);
		oos.flush();	oos.close(); fos.close();	


		FileInputStream fis = new FileInputStream(targetFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);
	}

}
