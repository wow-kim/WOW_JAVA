
// 접근 제어
// setter, getter를 사용하여 필드에 접근하기를 권고함.

public class Account {
	
	private String name;
	private int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + ", 통장 잔고는 " + obj.getBalance()+"입니다.");
	}

}
