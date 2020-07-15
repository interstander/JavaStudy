package chapter09.ex01;

public class Score {
	protected int[] score;
	
	protected Score(int[] score) {
		this.score=score;
	}
	protected int getScore(int num) {
		if(0<=num && num<score.length) {
			return score[num];
		}
		return -1;
	}
}
