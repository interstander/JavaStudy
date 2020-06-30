package chapter08.study.part01;

public class Main04 {

	public static void main(String[] args) {
		chapter08.study.part01.TestAM am1 = new chapter08.study.part01.TestAM();
		chapter08.study.part01.dto.TestAM am2 = new chapter08.study.part01.dto.TestAM();
		
		System.out.println("public : "+ am1.field1);
		System.out.println("default : "+ am1.field2);
//		System.out.println("private : "+ am1.field3);
		
		am1.method1();
		am1.method2();
//		am1.method3();
		
		System.out.println("public : "+ am2.field1);
//		System.out.println("default : "+ am2.field2);
//		System.out.println("private : "+ am2.field3);
		
		am2.method1();
//		am2.method2();
//		am2.method3();

	}

}

