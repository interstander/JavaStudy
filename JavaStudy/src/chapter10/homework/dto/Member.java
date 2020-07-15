package chapter10.homework.dto;

public abstract class Member implements Task{
	private String m_name;
	private String m_id;
	private String m_pwd;
	private String position;

	public Member(String m_name, String m_id, String m_pwd, String position) {
		this.m_name = m_name;
		this.m_id = m_id;
		this.m_pwd = m_pwd;
		this.position = position;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pwd() {
		return m_pwd;
	}

	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
