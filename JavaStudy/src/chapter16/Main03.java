package chapter16;

public class Main03 {

	public static void main(String[] args) {
		Ex03 fi;
		fi = () ->{
			int result = 5;
			return result;

		};
		int x = fi.method();
		System.out.println(x);

		fi = ()-> {
			return 7;
		};
		x = fi.method();
		System.out.println(x);

		fi = () -> 9;
		x = fi.method();
		System.out.println(x);
	}

}
