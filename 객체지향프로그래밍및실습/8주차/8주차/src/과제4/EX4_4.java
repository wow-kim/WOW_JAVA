package ����4;

import java.util.Scanner;

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(){
		super("����� ���� ����");
	}
}

class BankAccount {
	int balance;
	public void deposit(int amount) {
		balance += amount;
		System.out.println("����: " + amount + "�� �ԱݵǾ����ϴ�.");
	}
	public void withdraw(int amount) throws NegativeBalanceException {
		if (balance - amount >= 0){
			balance -= amount;
			System.out.println("���: " + amount + "�� ��ݵǾ����ϴ�.");	
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
			System.out.print("0 : ����, 1: ���, 2: ���� ");
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
					System.out.println("���: " + amount + "�� �ܾ��� �����մϴ�.");
				}
			} else {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		sc.close();
	}
}
