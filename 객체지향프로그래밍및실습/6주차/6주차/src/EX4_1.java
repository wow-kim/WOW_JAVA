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
			
			System.out.println("주사위1= "+dice1.getValue() + " 주사위2= "+ dice2.getValue());
			count ++;
			
		}
		System.out.println("(1,1)이 나오는데 걸린 횟수= " + count);	
	}
}
