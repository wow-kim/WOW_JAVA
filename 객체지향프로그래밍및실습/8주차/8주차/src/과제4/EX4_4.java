package 과제4;

import java.util.Scanner;

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(){
		super("사용자 정의 예외");
	}
}

class BankAccount {
	int balance;
	public void deposit(int amount) {
		balance += amount;
		System.out.println("예금: " + amount + "원 입금되었습니다.");
	}
	public void withdraw(int amount) throws NegativeBalanceException {
		if (balance - amount >= 0){
			balance -= amount;
			System.out.println("출금: " + amount + "원 출금되었습니다.");	
		} else {
			throw new NegativeBalanceException();
		}
	}
}

public class EX4_4 {

	public static void main(String[] args)  {
		BankAccount account = new BankAccount();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("0 : 예금, 1: 출금, 2: 종료 ");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.print("Amount? : ");
				account.deposit(sc.nextInt());
			} else if(input == 1) {
				System.out.print("Amount? : ");
				int amount = sc.nextInt();
				try {
					account.withdraw(amount);
				} catch (NegativeBalanceException e) {
					System.out.println("출금: " + amount + "원 잔액이 부족합니다.");
				}
			} else {
				System.out.println("종료합니다.");
				break;
			}
		}
		sc.close();
	}
}
