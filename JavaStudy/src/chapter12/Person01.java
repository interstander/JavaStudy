package chapter12;

public class Person01 {
	long id;
	
	Person01(long id){
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person01) {
			return id == ((Person01)obj).id;
		}else {
			return false;
		}
		
	}
	
}
