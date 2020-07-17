package chapter14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("고길동");
		list.add("김길동");
		list.add("박길동");
		list.add("홍길동");
		list.add("김길동");
		System.out.println("리스트의 길이 : "+list.size());
		System.out.println("------------------------------------");
		String name = list.get(2);
		System.out.println("2번째 객체 이름 : "+name);
		System.out.println("------------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 이름 : "+list.get(i));
		}
		System.out.println("리스트의 길이 : "+list.size());
		System.out.println("------------------------------------");
		list.add(3,"이길동");
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 이름 : "+list.get(i));
		}
		System.out.println("리스트의 길이 : "+list.size());
		System.out.println("------------------------------------");
		list.remove(1);
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 이름 : "+list.get(i));
		}
		System.out.println("리스트의 길이 : "+list.size());
		System.out.println("------------------------------------");
	}


}
