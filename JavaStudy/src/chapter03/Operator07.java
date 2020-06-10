package chapter03;

public class Operator07 {

	public static void main(String[] args) {
		//논리연산
		boolean a = true, b = true, c = false, d = false;
		
		System.out.println(" true &&  true : "+ (a&&b));
		System.out.println(" true && false : "+ (a&&d));
		System.out.println("false &&  true : "+ (c&&b));
		System.out.println("false && false : "+ (c&&d));
		System.out.println();
		System.out.println(" true ||  true : "+ (a||b));
		System.out.println(" true || false : "+ (a||d));
		System.out.println("false ||  true : "+ (c||b));
		System.out.println("false || false : "+ (c||d));
		System.out.println();
		System.out.println(" true ^ true  : "+ (a^b));
		System.out.println(" true ^ false : "+ (a^d));
		System.out.println("false ^ true  : "+ (c^b));
		System.out.println("false ^ false : "+ (c^d));
		System.out.println();
		System.out.println("   true : "+ a);
		System.out.println("  !true : "+ !a);
		System.out.println("  false : "+ c);
		System.out.println(" !false : "+ !c);
		System.out.println();
		

	}

}
