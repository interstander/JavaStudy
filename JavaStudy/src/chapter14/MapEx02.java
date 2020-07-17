package chapter14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();

		map.put("박길동",78);
		map.put("고길동",57);
		map.put("홍길동",81);
		map.put("송길동",66);
		map.put("이길동",91);
		map.put("최길동",57);
		
		// keySet
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyItr = keySet.iterator();
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			Integer value = map.get(key);
			
			System.out.println("이름 : "+key+", 점수 :"+value);
		}
	}

}
