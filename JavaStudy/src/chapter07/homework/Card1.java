package chapter07.homework;

public class Card1 {
	int num;
	boolean chk;
	
	public Card1(){
		this.num = 1;
		this.chk = true;
	}
	
	public Card1(int num,boolean chk){
		this.num = num;
		this.chk = chk;
	}
	
	public String info() {
		String str=null;
		if(chk) {
			str = num+"k";
		}else {
			str = String.valueOf(num);
		}
		return str;
	}
}
