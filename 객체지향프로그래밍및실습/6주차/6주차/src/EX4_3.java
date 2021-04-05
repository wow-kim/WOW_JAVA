
class Account{
	String name;
	int balance;
	
	public Account(String name) {
		this.name = name;
		this.balance = 0;
		System.out.println("새로운 " + name + " 계좌가 생성되었습니다.");
	}
	
	public void withdraw(int amount) {
		this.balance += amount;
		System.out.println(amount + "원 저축");
	}
	
	public void deposit(int amount) {
		this.balance -= amount;
		System.out.println(amount + "원 인출");
	}
	
	public void transfer(int amount, Account account) {
		this.balance -= amount;
		account.balance += amount;
		System.out.println(this.name +"가 " + account.name + "에게 " + amount + "원 이체함");
	}
	
	public void print() {
		System.out.println("고객 " + this.name + " 계좌잔고 = " + this.balance + "원");
	}
	
}

public class EX4_3 {

	public static void main(String[] args) {
		Account ac1 = new Account("철수");
		ac1.withdraw(50000);
		Account ac2 = new Account("영희");
		ac2.withdraw(100000);
		
		ac1.print();
		ac2.print();
		
		ac2.transfer(50000, ac1);
		
		ac1.print();
		ac2.print();
		
	}

}
