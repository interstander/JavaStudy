package chapter08.study.part01.vo;

public class Student {
	String name;
	int[] scores;
	int sum;
	double avg;
	int ranking;
	
	public Student() {}
	
	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
		this.sum = sum();
		this.avg = avg();
		this.ranking = 1;
	}
	
	
	private double avg() {
		return sum()/3.0;
	}
	
	private int sum() {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		return sum;
		
	}
	
	public void prt() {
		System.out.println("학생 이름 : "+name);
		System.out.println("국어 점수 : "+scores[0]);
		System.out.println("영어 점수 : "+scores[1]);
		System.out.println("수학 점수 : "+scores[2]);
		System.out.println(" 총   점  : "+sum);
		System.out.println(" 평   균  : "+avg);
	}
}
