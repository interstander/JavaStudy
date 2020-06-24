package chapter04;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 만들기를 통해서 반복문을 연습하자
		
		//1단계 반복문 없이 구구단 중에 2단 출력하기
		System.out.println("*****1단계*****");
		System.out.printf("%d X %d = %d \n",2,1,(2*1));
		System.out.printf("%d X %d = %d \n",2,2,(2*2));
		System.out.printf("%d X %d = %d \n",2,3,(2*3));
		System.out.printf("%d X %d = %d \n",2,4,(2*4));
		System.out.printf("%d X %d = %d \n",2,5,(2*5));
		System.out.printf("%d X %d = %d \n",2,6,(2*6));
		System.out.printf("%d X %d = %d \n",2,7,(2*7));
		System.out.printf("%d X %d = %d \n",2,8,(2*8));
		System.out.printf("%d X %d = %d \n",2,9,(2*9));
		
		System.out.println();
		//2단계 구구단중 2단을 반복문으로 출력하기 => 공통의 코드와 변하는 부분을 잘 관찰하자
		System.out.println("*****2단계*****");
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",2,j,(2*j));
		}
		
		System.out.println();
		//3단계 구구단2단부터 9단까지 출력하는 코드를 작성해 본다.
		System.out.println("*****3단계*****");
		System.out.printf("***%d단***\n",2);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",2,j,(2*j));
		}
		System.out.printf("***%d단***\n",3);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",3,j,(3*j));
		}
		System.out.printf("***%d단***\n",4);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",4,j,(4*j));
		}
		System.out.printf("***%d단***\n",5);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",5,j,(5*j));
		}
		System.out.printf("***%d단***\n",6);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",6,j,(6*j));
		}
		System.out.printf("***%d단***\n",7);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",7,j,(7*j));
		}
		System.out.printf("***%d단***\n",8);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",8,j,(8*j));
		}
		System.out.printf("***%d단***\n",9);
		for(int j=1;j<10;j++) {
			System.out.printf("%d X %d = %d \n",9,j,(9*j));
		}
		
		System.out.println();
		//최종단계 두개의 반복문으로 구구단을 출력해 본다 => 공통의 코드와 변하는 부분을 잘 관찰하자
		System.out.println("*****최종단계*****");
		for(int i=2;i<10;i++) {
			System.out.printf("***%d단***\n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d X %d = %d \n",i,j,(i*j));
			}
			System.out.println();
		}
		
	}

}
