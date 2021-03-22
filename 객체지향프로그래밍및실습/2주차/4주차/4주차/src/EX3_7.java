import java.util.Random;

public class EX3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pattern = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] num = { "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King", "Ace" };
		int i;
		
		Random ran = new Random();
		for(i=0; i<5; i++) {
			System.out.println(pattern[ran.nextInt(4)] + "ÀÇ " + num[ran.nextInt(num.length)]);
		}
		
	}

}
