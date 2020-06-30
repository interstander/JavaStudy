package chapter07;

public class Member {
	String m_Id;
	String m_pw;
	String m_name;
	String m_phone;

	public Member(String m_Id, String m_pw, String m_name, String m_phone) {
		this.m_Id = m_Id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	public void prt() {
		System.out.println("이      름: "+m_name);
		System.out.println("전화 번호: "+m_phone);
	}


}
