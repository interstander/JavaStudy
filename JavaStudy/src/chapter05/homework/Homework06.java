package chapter05.homework;

import java.util.Random;

public class Homework06 {

	public static void main(String[] args) {
		//		16. 과제.
		//		주차관리 프로그램
		//			1. 자동차가 들어오면 1부터 100까지의 랜덤 숫자중에 하나를 부여 받는다.
		//			2. 주차장은 0번 부터 9번까지의 주차 구역이 있다.
		//			3. 자동차가 부여 받는 숫자를 10으로 나눈 나머지가 그 자동차가 부여받은 주차 구역이다.
		//			4. 만약 부여받은 주차구역에 이미 자동차가 주차되어 있으면 다음방으로 배정하되, 모든 주차장에 자동차가 주차 되어있으면 종료한다.
		//
		//		*** 출력은 1번 Car 번호는 000입니다.
		//			주차 구역 0 번 지정 받으셨습니다.
		//		****모든 주차가 완료되면… 
		//		0번 car000 (000은 랜덤  숫자번호)
		//		1번 car000
		
		System.out.println("16번 문제");

		Random in = new Random();
		String[] parkingArea = new String[10];
		int parkingIndex = 0;

		for (int i = 0; i < parkingArea.length; i++) {
			parkingArea[i] = "empty";
		}

		for (int i = 0; i < 10; i++) {
			String carName = "Car";
			int carNum = in.nextInt(99) + 1;
			carName += carNum;
			parkingIndex = carNum % 10;

			for (int j = 0; j < parkingArea.length; j++) {
				if (parkingArea[parkingIndex] == "empty") {
					parkingArea[parkingIndex] = carName;
					System.out.println(carName + "님 주차장은" + parkingIndex + "구역입니다.");
					break;
				}
				parkingIndex = ++parkingIndex % 10;
			}
		}
	}
}

