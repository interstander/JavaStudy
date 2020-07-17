package chapter14;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("박길동",78);
		map.put("고길동",57);
		map.put("홍길동",81);
		map.put("송길동",66);
		map.put("이길동",91);
		map.put("최길동",57);
		
		System.out.println("전체 map 개수 : "+map.size());
		
		map.put("송길동",77);
		System.out.println("전체 map 개수 : "+map.size());
		System.out.println("송길동의 점수 : "+map.get("송길동"));
		
		map.remove("이길동");
		System.out.println("전체 map 개수 : "+map.size());
	}

}
