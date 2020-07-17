package chapter14;

import java.util.Comparator;

public class Ranking implements Comparator<PokeMon>{

	@Override
	public int compare(PokeMon o1, PokeMon o2) {
		if(o1.getLevel() > o2.getLevel()) {
			return 1;
		}else if(o1.getLevel() < o2.getLevel()) {
			return -1;
		}else {
			return 0;
		}
	}


}
