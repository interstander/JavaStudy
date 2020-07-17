package chapter14;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("고길동",16));
		set.add(new Student("박길동",20));
		set.add(new Student("김길동",13));
		set.add(new Student("홍길동",16));
		set.add(new Student("김길동",13));
		
		System.out.println("Set의 길이 : "+set.size());		
		
		set.add(new Student("박길동",20));
		System.out.println("Set의 길이 : "+set.size());
	}

}
