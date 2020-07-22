package chapter18;

import java.io.Serializable;

public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();	
	static int field3;    //static은 직렬화 불가
	transient int field4;    //직렬화 제외 키워드
}
