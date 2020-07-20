package chapter17;

public class Calc { //공유될 객체
	private int memory;

	public int getMemory() {
		return memory;
	}

//	public void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		}catch(Exception e){
//
//		}
//		System.out.println(Thread.currentThread().getName() + ":"+ this.memory);
//	}
	
//	public synchronized void setMemory(int memory) {   
//		   //<= 이 메소드를 동기화 키워드를 붙여서 동기화 메소드로 사용한다,.
//			this.memory = memory;
//			try {
//				Thread.sleep(2000);
//			}catch(Exception e){
//				
//			}
//			System.out.println(Thread.currentThread().getName() + ":"+ this.memory);
//		}

	public void setMemory(int memory) {   
		synchronized (this){
			// 공유 객체 Calc의 참조(잠금 대상)  
			//실행코드가 동기화 블록에 들어가면 객체를 통으로 잠근다.
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(Exception e){
			
		}
		System.out.println(Thread.currentThread().getName() + ":"+ this.memory);
		}
	}
}

