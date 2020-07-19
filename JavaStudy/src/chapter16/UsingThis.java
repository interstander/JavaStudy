package chapter16;

public class UsingThis {
	public int outterField =10;

	Ex01 fi = ()->{
		System.out.println("outterField: "+outterField);
		System.out.println("outterField: "+this.outterField+"\n");
	};

	class Inner{
		int innerField =20;

		void method() {
			Ex01 fi = ()->{
				System.out.println("outterField: "+outterField);
				System.out.println("outterField: "+UsingThis.this.outterField+"\n");

				System.out.println("innerField: "+innerField);
				System.out.println("innerField: "+this.innerField+"\n");

			};
			fi.method();
		}
	}
}
