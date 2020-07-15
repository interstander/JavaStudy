package chapter09.ex01;

public class Member {
	public void method() {
		Score score = new Score(new int[] {1,2,3});
		score.score = new int[] {4,5,6};
		score.getScore(1);
		
	}
}
