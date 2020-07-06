package chapter09;

public class Child02 extends Parent02{
	private String id = "Child";
	
	public void m() {
		System.out.println(super.lastName);
//		System.out.println(super.firstName);
		System.out.println(super.getFirstName());
//		super.method();
		
	}
}


