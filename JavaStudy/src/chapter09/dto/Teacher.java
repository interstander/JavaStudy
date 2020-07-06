package chapter09.dto;

public class Teacher extends Member{
	private String subject;

	public Teacher(String m_name, String m_id, String m_pwd, String position,String subject) {
		super(m_name, m_id, m_pwd, position);
		this.subject  = subject;
	}

	@Override
	public void work() {
		System.out.println("강의를 합니다.");
	}

	@Override
	public void test() {
		System.out.println("채점을 합니다.");
	}

}
