package chapter12;

import java.io.UnsupportedEncodingException;

public class StringMethod03 {

	public static void main(String[] args) throws Exception {
		String str = "Java Programming";
		byte[] bytes = str.getBytes("UTF-8");
		
		for(byte b:bytes) {
			System.out.print(b);
			System.out.print(",");
		}
		System.out.println();
		String str1 = new String(bytes);
		System.out.println(str1);
	}

}
