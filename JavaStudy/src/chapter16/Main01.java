package chapter16;

public class Main01 {

	public static void main(String[] args) {
		Ex01 fi;
		fi = () ->{
			String str = "method call 1";
			System.out.println(str);
		};
		fi.method();

		fi = ()-> {
			System.out.println("method call 2");
		};
		fi.method();

		fi = () -> System.out.println("method call 3");
		fi.method();
	}
}
