package chapter14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01_1 {

	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		
		set.add("고길동");
		set.add("김길동");
		set.add("박길동");
		set.add("홍길동");
		set.add("김길동");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		String str = itr.next();
		System.out.println(str);

	}

}
