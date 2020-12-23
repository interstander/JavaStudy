package chapter06.homework;

import java.util.Scanner;

public class Homework01 {
	static Scanner in  = new Scanner(System.in);
	
	public static void main(String[] args) {
//		1. 구구단을 출력하는 메소드를 만들어 보세요.
		System.out.println("문제 1번");
		q1Gugudan();
//		2. 숫자를 입력받으면 해당 숫자의 구구단을 출력하세요.
		System.out.println("문제 2번");
		System.out.println("구구단을 구할 숫자를 입력하세요");
		System.out.print(">");
		
		int num2 = Integer.parseInt(in.nextLine());
		q2GugudanNum(num2);
		
//		3. 두개의 숫자를 입력받아서 작은 수부터 큰 수 까지의 구구단을 출력하세요.​
		System.out.println("문제 3번");
		System.out.println("구구단 시작할 숫자를 입력하세요.");
		System.out.print(">");
		int minNum3 = Integer.parseInt(in.nextLine());
		System.out.println("구구단 마지막 숫자를 입력하세요.");
		System.out.print(">");
		int maxNum3 = Integer.parseInt(in.nextLine());
		
		q3GugudanNum(minNum3,maxNum3);
		
//		4. 숫자가 하나만 입력되면 해당 숫자의 구구단을 출력하고 두개의 숫자가 입력되면 작은 수부터 큰수까지의 구구단을 출력하세요.
		System.out.println("문제 4번");
		System.out.println("구구단을 구할 숫자를 입력하세요");
		System.out.print(">");
		
		int num4 = Integer.parseInt(in.nextLine());
		q4GugudanNum(num4);
		
		System.out.println("구구단 시작할 숫자를 입력하세요.");
		System.out.print(">");
		int minNum4 = Integer.parseInt(in.nextLine());
		System.out.println("구구단 마지막 숫자를 입력하세요.");
		System.out.print(">");
		int maxNum4 = Integer.parseInt(in.nextLine());
		
		q4GugudanNum(minNum4,maxNum4);
		
		
	}
	
	public static void q1Gugudan() {
		for(int i=2;i<10;i++) {
			System.out.printf("***%d단***\n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d X %d = %d \n",i,j,(i*j));
			}
			System.out.println();
		}
	}
	
	public static void q2GugudanNum(int num) {
		System.out.printf("***%d단***\n",num);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",num,j,(num*j));
		}
		System.out.println();
	}
	
	public static void q3GugudanNum(int min, int max) {
		for(int i=min;i<=max;i++) {
			System.out.printf("***%d단***\n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d X %d = %d \n",i,j,(i*j));
			}
			System.out.println();
		}
	}
	
	public static void q4GugudanNum(int num) {
		System.out.printf("***%d단***\n",num);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",num,j,(num*j));
		}
		System.out.println();
	}
	
	public static void q4GugudanNum(int min, int max) {
		for(int i=min;i<=max;i++) {
			System.out.printf("***%d단***\n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d X %d = %d \n",i,j,(i*j));
			}
			System.out.println();
		}
	}

}
