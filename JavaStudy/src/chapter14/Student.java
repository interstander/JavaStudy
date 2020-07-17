package chapter14;

public class Student {
	String name;
	int StudentNumber;
	
	public Student(String name, int studentNumber) {
		this.name = name;
		StudentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		StudentNumber = studentNumber;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			return (stu.getName().equals(this.name)) &&
					(stu.getStudentNumber()==this.StudentNumber);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return StudentNumber;
	}
}
