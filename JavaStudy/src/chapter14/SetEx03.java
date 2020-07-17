package chapter14;

import java.util.Iterator;
import java.util.TreeSet;

public class SetEx03 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		set.add("박길동");
		set.add("고길동");
		set.add("홍길동");
		set.add("송길동");
		set.add("이길동");
		set.add("최길동");
		
		System.out.println("첫번째 이름 : "+ set.first());
		System.out.println("마지막 이름 : "+ set.last());
		System.out.println("신길동 아래 이름 : "+ set.lower("신길동"));
		System.out.println("신길동 위 이름 : "+ set.higher("신길동"));
		System.out.println("최길동 이거나 바로 아래 이름 : "+ set.floor("최길동"));
		System.out.println("배길동 이거나 바로 위 이름 : "+ set.ceiling("배길동"));
		
		System.out.println();
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
