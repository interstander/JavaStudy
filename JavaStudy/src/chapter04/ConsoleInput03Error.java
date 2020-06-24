package chapter04;

import java.util.Scanner;

public class ConsoleInput03Error {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1 = in.nextInt();
		System.out.println(num1);
		
		String str = in.nextLine();
		System.out.println(str);

		
	}

}
