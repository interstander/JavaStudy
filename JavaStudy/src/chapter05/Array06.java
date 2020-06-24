package chapter05;

public class Array06 {

	public static void main(String[] args) {
		//배열 복제하는 기능  => System.arraycopy()
		
		int[] oldNum = {1,2,3};
		int[] newNum = new int[5];

		System.arraycopy(oldNum, 0, newNum, 1, oldNum.length);

		for(int i=0;i<newNum.length;i++){
		    System.out.println(newNum[i]);
		}
		

	}

}
