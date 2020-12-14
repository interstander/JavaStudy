package chapter03.homework;

public class HomeWork2 {

	public static void main(String[] args) {
//		문제1) 사과를 담는데 필요한 바구니의 수를 구하는 프로그램을 작성하세요 
//		예를 들어 사과가 123개이고 바구니에 사과를 10개 담을 수 있다면 총 바구니는 13개가 필요하게 될 것이다.
		System.out.println("*** 문제1 ***");
		int apple = 123;
		int basket = 10;
		int need=apple/basket+1;
		System.out.printf("사과 %d개, 필요한 바구니수 %d개%n",apple,need);
		
//		문제2) 어떤 정수의 값이 음수인지 양수인지 판단해서 음수면 ‘음수’ 양수면 ‘양수’ 0이면 ‘0’을 출력하는 코드를 작성하세요.
		System.out.println("*** 문제2 ***");
		int num2 = 0;
		String result2 = (num2>0)?"양수":((num2<0)?"음수":"0");
		System.out.printf("정수의 값 : %d %n판단 : %s %n",num2,result2);

//		문제3) 어떤 정수의 값에서 일의 자리 숫자를 5로 바꾸는 코드를 작성하세요 . 예를 들어 222이면 225로 888이면 885로 바꾸세요.
		System.out.println("*** 문제3 ***");
		int num3 = 888;
		int result3 = (num3/10)*10+5;
		System.out.printf("정수의 값 : %d %n변경값 : %d %n",num3,result3);

//		문제4) 어떤 정수보다 값이 크면서도 가장 가까운 10의 배수에서 변수 값을 뺀 나머지를 구하는 코드를 작성하세요. 
//		예를 들면 24라는 수면 크면서도 가까운 10의 배수는 30이다. 고로 30-24하면 나오는 6을 출력하도록 하세요.
		System.out.println("*** 문제4 ***");
		int num4 = 24;
		int result4 = 10-num4%10;
		System.out.printf("정수 : %d %n가까운10의 배수에서 정수를 뺀 값 : %d %n",num4,result4);

//		문제5) 화씨온도를 섭씨온도로 변환하는 코드를 작성해 본다. 변환공식은 5/9 * (F-32) 라고 할 때 적절한 코드를 작성해본다.
//		(추가) 소수점 셋째자리까지 반올림으로을 구해보자
		System.out.println("*** 문제5 ***");
		int fahrenheit = 100;
		double celsius = (fahrenheit-32)*((double)5/9);
		System.out.printf("변환할 화씨온도 : %d %n변환된 섭씨온도 : %f %n",fahrenheit,celsius);
		System.out.println("[추가]");
		celsius = (Math.round(celsius*1000)/1000.0);
		System.out.printf("변환할 화씨온도 : %d %n변환된 섭씨온도 : %.3f %n",fahrenheit,celsius);
		
		
//		문제6) 대문자를 소문자로 변경하는 코드를 작성해보자
//		문자코드는 소문자가 대문자보다 32만큼 더 크다. 에를 들면 A코드는 65, a코드는 97이다.
		System.out.println("*** 문제6 ***");
		char UpperCase = 'C';
		int UpperCaseNum = UpperCase;
		char lowerCase = (char)(UpperCaseNum+32);
		System.out.printf("대문자 : %c %n변경된 소문자 : %c %n",UpperCase,lowerCase);
	}

}
