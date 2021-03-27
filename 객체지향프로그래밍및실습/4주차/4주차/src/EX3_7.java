
public class EX3_7 {

	public static void main(String[] args) {
		String[] patterns = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] nums = { "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King", "Ace" };
		
		boolean check[] = new boolean[52];
		for(int c = 0; c < check.length; c++)
			check[c] = false;
		
		int i = 0;
		while(i < 5) {
			int card = (int) (Math.random()*52);
			if (check[card] == false) {
				check[card] = true;
				String pattern = patterns[card/13];
				String num = nums[card%13];
				System.out.println(pattern + "ÀÇ " + num);
				i++;
			}

			
		}
		
	}
	
}
