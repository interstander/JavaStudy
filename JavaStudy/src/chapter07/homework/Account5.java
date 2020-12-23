package chapter07.homework;

public class Account5 {
	public String accountNum;// 계좌번호
	public String accountHolder;// 예금 주
	public int balance; //잔액
	
	public Account5(String accountNum, String accountHolder, int balance) {
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void checkBalance() {
		System.out.println("잔액을 조회합니다.");
		System.out.println("잔액 : "+this.balance);
	}
	
	public void deposit(int money) {
		System.out.println(money+"원을 입금합니다.");
		this.balance+=money;
		System.out.println("입금 완료");
	}
	
	public void withdraw(int money) {
		System.out.println(money+"원을 출금합니다.");
		if(this.balance<money) {
			System.out.println("잔액 부족");
		}else {
			this.balance-=money;
			System.out.println("출금 완료");
		}
		
	}
}
