import java.util.Random;

class Dice {
	int value;
	
	public Dice(){
		value = 0;
	}
	
	public int roll() {
		Random ran = new Random(); 
		return ran.nextInt(6)+1;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int val) {
		this.value = val;
	}
}

public class EX4_1 {
	
	public static void main(String[] args) {
		int count = 0;
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		while (dice1.value + dice2.value != 2) {
			dice1.setValue(dice1.roll());
			dice2.setValue(dice2.roll());
			
			System.out.println("�ֻ���1= "+dice1.getValue() + " �ֻ���2= "+ dice2.getValue());
			count ++;
			
		}
		System.out.println("(1,1)�� �����µ� �ɸ� Ƚ��= " + count);	
	}
}
