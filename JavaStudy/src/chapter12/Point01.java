package chapter12;

public class Point01 implements Cloneable{
	int x,y;
	
	Point01(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x="+x+", y="+y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return obj;
	}
}
