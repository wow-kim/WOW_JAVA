
class Account{
	String name;
	int balance;
	
	public Account(String name) {
		this.name = name;
		this.balance = 0;
		System.out.println("���ο� " + name + " ���°� �����Ǿ����ϴ�.");
	}
	
	public void withdraw(int amount) {
		this.balance += amount;
		System.out.println(amount + "�� ����");
	}
	
	public void deposit(int amount) {
		this.balance -= amount;
		System.out.println(amount + "�� ����");
	}
	
	public void transfer(int amount, Account account) {
		this.balance -= amount;
		account.balance += amount;
		System.out.println(this.name +"�� " + account.name + "���� " + amount + "�� ��ü��");
	}
	
	public void print() {
		System.out.println("�� " + this.name + " �����ܰ� = " + this.balance + "��");
	}
	
}

public class EX4_3 {

	public static void main(String[] args) {
		Account ac1 = new Account("ö��");
		ac1.withdraw(50000);
		Account ac2 = new Account("����");
		ac2.withdraw(100000);
		
		ac1.print();
		ac2.print();
		
		ac2.transfer(50000, ac1);
		
		ac1.print();
		ac2.print();
		
	}

}
