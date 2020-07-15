package chapter12;

public class Card02 {
	String kind;
	int number;
	
	Card02(){
		this("spade",1);
	}
	Card02(String kind,int number){
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		return "kind : "+kind+", number : "+number;
	}

}
