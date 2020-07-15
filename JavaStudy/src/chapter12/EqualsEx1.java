package chapter12;

public class EqualsEx1 {

	public static void main(String[] args) {
		Value01 v1 = new Value01(10);
		Value01 v2 = new Value01(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		v2 = v1;
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
	}

}
