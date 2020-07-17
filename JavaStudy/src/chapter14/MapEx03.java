package chapter14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx03 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();

		map.put("박길동",78);
		map.put("고길동",57);
		map.put("홍길동",81);
		map.put("송길동",66);
		map.put("이길동",91);
		map.put("최길동",57);

		//EntrySet
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		Iterator<Map.Entry<String, Integer>> entryItr = entrySet.iterator();
		while(entryItr.hasNext()) {
			Map.Entry<String, Integer> entry = entryItr.next();

			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("이름 : "+key+", 점수 :"+value);
		}
	}

}
