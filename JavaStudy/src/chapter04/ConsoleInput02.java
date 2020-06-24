package chapter04;

import java.util.Scanner;

public class ConsoleInput02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		System.out.println(str1);
		
		String str2 = in.nextLine();
		System.out.println(str2);

		int num1 = in.nextInt();
		System.out.println(num1);

		double num2 = in.nextDouble();
		System.out.println(num2);
		
	}

}
