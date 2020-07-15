package chapter09.homework.dto;

public class Student extends Member{
	
	private String major;

	public Student(String m_name, String m_id, String m_pwd, String position,String major) {
		super(m_name, m_id, m_pwd, position);
		this.major  = major;
	}

	@Override
	public void work() {
		System.out.println("공부를 합니다.");
	}

	@Override
	public void test() {
		System.out.println("시험을 봅니다.");
	}

}
