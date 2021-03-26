import java.util.ArrayList;
import java.util.Random;

public class EX3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pattern = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] num = { "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King", "Ace" };
		
		ArrayList<String[]> CardList =new ArrayList<String[]>();;

		Random ran = new Random();
		int i = 0;
		while(i < 5) {
			String[] card = {pattern[ran.nextInt(4)], num[ran.nextInt(13)]};
			if (CardList.contains(card)){
				break;
			}
			else {
				CardList.add(card);
				System.out.println(card[0] +"ÀÇ " + card[1]);
				i++;
			}
			
			
		}
		
	}
	
}
