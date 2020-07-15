package chapter12;

public class Card01 {
	String kind;
	int number;
	
	Card01(){
		this("spade",1);
	}
	Card01(String kind,int number){
		this.kind = kind;
		this.number = number;
	}
}
