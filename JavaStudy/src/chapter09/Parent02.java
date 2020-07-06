package chapter09;

public class Parent02 {
	public String lastName = "장";
	private String firstName = "태윤";
	
	private void method() {
		System.out.println("나는 부모입니다.");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}

