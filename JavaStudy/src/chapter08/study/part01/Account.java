package chapter08.study.part01;

public class Account {
	int balance=0;
	
	void deposit(int money){
		this.balance += money;
		System.out.println("입금완료");
	}
	void withdraw(int money){
		if(money<=this.balance) {
			this.balance -= money;
			System.out.println("출금 완료");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}
