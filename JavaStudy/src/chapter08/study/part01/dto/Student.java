package chapter08.study.part01.dto;

public class Student {
	String name;
	int[] scores;
	int sum;
	double avg;
	
	public Student() {}
	
	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
		this.sum = sum();
		this.avg = avg();
	}
	
	
	private double avg() {
		return sum()/5.0;
	}
	
	private int sum() {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		return sum;
		
	}
	
	public void prt() {
		System.out.println("학 생 이 름 : "+name);
		System.out.println("자 바  점수 : "+scores[0]);
		System.out.println("파이썬 점수 : "+scores[1]);
		System.out.println(" C++   점수 : "+scores[2]);
		System.out.println(" Ruby  점수 : "+scores[3]);
		System.out.println(" Go    점수 : "+scores[4]);
		System.out.println("  총    점  : "+sum);
		System.out.println("  평    균  : "+avg);
	}
}
