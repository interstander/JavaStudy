package chapter11;

public class AccountException {

	public static void main(String[] args) {
		Account acc = new Account();
		//예금
		
		acc.deposit(10000);
		System.out.println("예금액: "+acc.getBalance());
		//출금
		try {
			acc.withdraw(30000);
		}catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
