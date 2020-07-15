package chapter09.ex02;

import chapter09.ex01.Score;

public class Member02 extends Score {
	
	protected Member02() {
		super(new int[] {1,2,3});	
	}
	public void method() {
		this.score = new int[] {4,5,6};
		this.getScore(1);
	}

}
