package chapter14;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapEx04 {

	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<>();

		map.put("박길동",78);
		map.put("고길동",57);
		map.put("홍길동",81);
		map.put("송길동",66);
		map.put("이길동",91);
		map.put("최길동",57);

		System.out.println("첫번째 이름 : "+ map.firstEntry().getKey()
				+", 점수 : "+map.firstEntry().getValue());
		System.out.println("마지막 이름 : "+ map.lastEntry().getKey()
				+", 점수 : "+map.lastEntry().getValue());
		System.out.println("신길동 아래 이름 : "+ map.lowerEntry("신길동").getKey()
				+", 점수 : "+map.lowerEntry("신길동").getValue());
		System.out.println("신길동 위 이름 : "+ map.higherEntry("신길동").getKey()
				+", 점수 : "+map.higherEntry("신길동").getValue());
		System.out.println("최길동 이거나 바로 아래 이름 : "+ map.floorEntry("최길동").getKey()
				+", 점수 : "+map.floorEntry("최길동").getValue());
		System.out.println("배길동 이거나 바로 위 이름 : "+ map.ceilingEntry("배길동").getKey()
				+", 점수 : "+map.ceilingEntry("배길동").getValue());
		System.out.println();
		Set<String> keySet = map.keySet();

		Iterator<String> keyItr = keySet.iterator();
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			Integer value = map.get(key);

			System.out.println("이름 : "+key+", 점수 :"+value);
		}

	}

}
