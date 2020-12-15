package chapter04.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
//		12. 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하세요.
		System.out.println("12번 문제");
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0 || i%3!=0) {
				sum+=i;
			}
		}
		System.out.println("총합 : "+sum);
//		13. 1+(1+2)+(1+2+3)+…(1+2+3+..+9+10)의 결과를 계산하세요.
		System.out.println("13번 문제");
		sum=0;
		for(int i=1;i<=10;i++) {
			int tmp=0;
			for(int j=1;j<=i;j++) {
				tmp+=j;
			}
			sum+=tmp;
		}
		
		System.out.println("총합 : "+sum);
		
		
//		14. 1+(-2)+3+(-4)+…같은 식으로 더해 나갔을 때 총합이 몇까지 더해야 100이상이 되는 지 구하세요.
		System.out.println("14번 문제");
		sum=0;
		int cnt=0;
		for(int i=1;;i++) {
			if(i%2==0) {
				sum-=i;
			}else {
				sum+=i;
			}
			if(sum>=100) {
				cnt=i;
				break;
			}
		}
		System.out.println("100이 넘어간 시점의 합계 : "+sum);
		System.out.println("그 시점의 번호 : "+cnt);
		
//		15. 어떤 정수가 있을 때 각 자리 숫자의 합을 구하는 코드를 작성하세요 . 
//		예를 들어 12345라는 숫자가 있다면 1+2+3+4+5의 결과인 15를 출력하세요.
		System.out.println("15번 문제");
		System.out.println("숫자를 입력하세요");
		int num15 = Integer.parseInt(scan.nextLine());
		int originNum = num15;
		sum=0;
		while(num15!=0) {
			int remain = num15%10;
			sum+=remain;
			num15/=10;
		}
		
		System.out.println(originNum+"의 각 자리수의 합 : "+sum);
		
		
		
//		16. 피보나치 수열을 앞의 두수의 합을 구해서 다음의 수를 만들어 나가는 수열이다. 
//		예를 들어 앞의 두수가 1,1이라면 다음 수는 2 그 다음 수는 1과 2를 더해서 3  
//		이런 식으로 1,1,2,3,5,8….형태로 나열해 나가는 수를 의미한다. 
//		1과1로 시작하는 피보나치 수열의 10번째 해당하는 수가 무엇인가 계산하고 
//		10번째 까지 숫자의 합을 구하는 프로그램을 완성하세요.
		System.out.println("16번 문제");
		int a = 0;
		int b = 1;
		int c = 0;
		sum=1;
		for(int i=2;i<=10;i++) {
			c = a+b;
//			System.out.println(c);
			sum+=c;
			a=b;
			b=c;
		}
		System.out.println("10번째 해당하는 숫자 : "+c);
		System.out.println("해당 숫자까지의 합 : "+sum);
		
//		17.  회문수를 구하는 프로그램을 완성하세요. 
//		회문수란 앞으로 읽으나 거꾸로 읽으나 동일한 수를 의미한다. 
//		예를 들면 ‘123454321’ 또는 ‘147898741’ 같은 형태의 수를 의미한다.
		System.out.println("17번 문제");
		System.out.println("회문수를 판단하기 위한 숫자를 입력하세요.");
		int num17 = Integer.parseInt(scan.nextLine());
		originNum = num17;
		int reverseNum = 0;
		while(num17!=0) {
			int tmp = num17%10;
			reverseNum = reverseNum*10+tmp;
//			System.out.println("역순 숫자 : "+reverseNum);
			num17/=10;
		}
		if(originNum == reverseNum) {
			System.out.println(originNum+"는 회문수 입니다.");
		}else {
			System.out.println(originNum+"는 회문수가 아닙니다.");
		}
		
		
//		18. 숫자 맞추기 게임을 만들어 보자 
//		컴퓨터가 1부터 100사이의 임의의 수를 생각하고 사용자가 값을 입력하면 
//		컴퓨터가 생각한 수와 비교해서 큰지 작은지를 알려주어서 점차 컴퓨터가 생각한 수를 찾아가는 게임이다. 
//		게임이 끝나면 몇 번 만에 완료했는지 출력하는 프로그램을 완성하세요.
		System.out.println("18번 문제");
		int com = r.nextInt(100)+1;
		cnt = 0;
		System.out.println("숫자 맞추기 게임(업 다운 게임)을 해봅시다.");
		do {
			System.out.print("1부터 100사이의 숫자를 입력해 보세요.");
			int num = Integer.parseInt(scan.nextLine());
			cnt++;
			if(1>num || num>100) {
				System.out.println("숫자의 범위가 벗어났습니다. \n 다시 확인해 주세요.");
			}else if(num > com){
				System.out.println(num+"보다 작습니다. ");
			}else if(num < com){
				System.out.println(num+"보다 큽니다. ");
			}else if(num == com){
				System.out.println("맞췄습니다.");
				break;
			}
			
		}while(true);

		System.out.println("게임 시도 횟수 : "+cnt);
		
	}

}
