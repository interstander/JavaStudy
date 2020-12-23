package chapter07.homework;

public class Student2 {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student2(){}
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	public float getAverage() {
		float avg = Math.round((getTotal()/(float)3)*100)/(float)100;
		return avg;
	}
	
	public void info() {
		System.out.println("이름 : "+this.name);
		System.out.println("반 : "+this.ban);
		System.out.println("번호 : "+this.no);
		System.out.println("국어점수 : "+this.kor);
		System.out.println("영어점수 : "+this.eng);
		System.out.println("수학점수 : "+this.math);
		System.out.println("총점 : "+this.getTotal());
		System.out.println("평균 : "+this.getAverage());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	

}
