package chapter08.homework.dto;

public class StudentDto {
	String name;
	int[] scores;
	int sum;
	double avg;
	int ranking;
	
	public StudentDto(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
		this.sum = sum();
		this.avg = avg();
		this.ranking = 1;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScores(int subjectNum) {
		return scores[subjectNum];
	}


	public void setScores(int[] scores) {
		this.scores = scores;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public int getRanking() {
		return ranking;
	}


	public void setRanking(int ranking) {
		this.ranking = ranking;
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
