package chapter12;

public class Circle01 implements Cloneable{
	Point01 p;
	double r;

	Circle01(Point01 p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle01 shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return (Circle01)obj;
	}
	
	public Circle01 deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		Circle01 c = (Circle01)obj;
		c.p = new Point01(this.p.x, this.p.y);
		return c;
	}

	@Override
	public String toString() {
		return "[p="+p+", r="+r+"]";
	}
	
}
