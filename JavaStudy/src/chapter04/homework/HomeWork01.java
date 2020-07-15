package chapter04.homework;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		//1. 1부터 100까지 합을 구하세요.
		System.out.println("1. 1부터 100까지 합을 구하세요.");
		int sum =0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("합계 : "+sum);
		System.out.println();
		
		//2.  1부터 100까지 7의 배수의 합과 평균을 구하세요.
		System.out.println("2.  1부터 100까지 7의 배수의 합과 평균을 구하세요.");
		sum =0;
		int cnt = 0;
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("개수 : "+cnt);
		System.out.println("평균 : "+sum/cnt);
		System.out.println();
		
		//3.  1부터 100까지의 합을 구하되 합계이 1000이 넘어서면  연산을 중단하고 합계와 해당 항을 구하세요.
		System.out.println("3.  1부터 100까지의 합을 구하되 합계이 1000이 넘어서면  연산을 중단하고 합계와 해당 항을 구하세요.");
		sum =0;
		int j=0;
		for(;j<=100;j++) {
			if(sum>1000) {
				break;
			}
			sum+=j;
		}
		System.out.println("항 : "+j);
		System.out.println("합계 : "+sum);
		System.out.println();
		//4.  100이하의 자연수중에서 2의 배수와 7의 배수를 모두 출력하고 그것들의 합과 평균을 구하세요.
		System.out.println("4.  100이하의 자연수중에서 2의 배수와 7의 배수를 모두 출력하고 그것들의 합과 평균을 구하세요.");
		sum =0;
		cnt = 0;
		for(int i=1;i<=100;i++) {
			if(i%7==0 && i%2==0) {
				System.out.println(i);
				sum+=i;
				cnt++;
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("개수 : "+cnt);
		System.out.println("평균 : "+sum/cnt);
		System.out.println();
		
		//5.  10~100까지 중 10의 자리와 1의 자리가 짝수인 수를 모두 출력하시오.
		System.out.println("5.  10~100까지 중 10의 자리와 1의 자리가 짝수인 수를 모두 출력하시오.");
		cnt=0;
		for(int k=10; k<=100; k++) {
			if(cnt!=5) {
				if(k%2+((k-k%10)/10)%2==0) {
					System.out.print(k+"\t");
					cnt++;
				}
			}else {
				System.out.println();
				cnt=0;
			}
		}
		System.out.println();

		//6. 구구단 짝수단을 출력하세요.
		System.out.println("6. 구구단 짝수단을 출력하세요.");
		for(int i=2;i<=9;i++) {
			if(i%2==0) {
				System.out.println("***"+i+"단***");
				for(int k=1;k<=9;k++) {
					System.out.println(i+"X"+k+"="+i*k);
				}
			}
		}
		System.out.println();

		//7. 구구단을 가로로 출력하세요.
		System.out.println("7. 구구단을 가로로 출력하세요.");
		for(int i=1;i<=9;i++) {
			if(i==1) {
				for(int t=2;t<=9;t++) {
					System.out.print("*"+t+"단*\t");
				}
				System.out.println();
			}else {
				for(int k=2;k<=9;k++) {
					System.out.print(k+"X"+i+"="+i*k+"\t");
				}
				System.out.println();
			}
		}
		System.out.println();

		//8. 어떤 정수의 양수중 자신을 제외한 약수를 모두 합하면 자신과 같아지는 수가 있다.
		//   예를 들면 6의 약수는 1,2,3,6이다.
		//	 1+2+3 =6이 된다.
		//	 4~100까지 숫자중에 이런 숫자를 찾으세요.
		System.out.println("8. 어떤 정수의 양수중 자신을 제외한 약수를 모두 합하면 자신과 같아지는 수가 있다.");
		System.out.println("예를 들면 6의 약수는 1,2,3,6이다.");
		System.out.println("1+2+3 =6이 된다.");
		System.out.println("4~100까지 숫자중에 이런 숫자를 찾으세요.");

		for(int i=4;i<=100;i++) {
			sum=0;
			for(j=1; j<i; j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(i==sum){
				System.out.println(i);
			}
		}
		System.out.println();

		//9. 두개의 숫자를 입력받아서 두 수 사이의 합을 구하세요.
		//	예: 3과 5를 입력 받으면 3+4+5=12 12 출력
		System.out.println("9. 두개의 숫자를 입력받아서 두 수 사이의 합을 구하세요.");
		System.out.println("예: 3과 5를 입력 받으면 3+4+5=12 12 출력");
		int a = 5;
		int b= 3;
		sum = 0;
		if(a > b) {
			for(int i=b;i<=a;i++) {
				sum+=i;
			}
		}else {
			for(int i=a;i<=b;i++) {
				sum+=i;
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println();

		//10. 로그인 기능을 구현하세요 (문자열 비교 사용)
		//	저장된 아이디 : 'grean'
		//	저장된 비밀번호: 'gr1234'
		String id = "grean";
		String pwd = "gr1234";

		Scanner in = new Scanner(System.in);

		System.out.print("아이디를 입력하세요 : ");
		String in_id = in.nextLine();
		System.out.print("비밀번호를 입력하세요.");
		String in_pwd = in.nextLine();

		if(in_id.equals(id)) {
			if(in_pwd.equals(pwd)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}


	}

}
