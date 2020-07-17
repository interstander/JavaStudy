package chapter14;

public class Coffee implements Comparable<Coffee>{
	private String name;
	private int price;

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void prt() {
		System.out.println(name+" : "+price);
	}
	@Override
	public int compareTo(Coffee o) {
		if(this.price < o.getPrice()) {
			return -1;
		}else if(this.price > o.getPrice()){
			return 1;
		}else {
			return 0;
		}
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}






}
