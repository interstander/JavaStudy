package chapter16;

public class Main05 {

	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();

		inner.method();
		usingThis.fi.method();
	}

}
