package chapter08.study.part01.vo;

public class Lecturer {
	String name;
	String subject;
	String email;
	
	public Lecturer() {}
	
	public Lecturer(String name, String subject, String email) {
		this.name = name;
		this.subject = subject;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
