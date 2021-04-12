abstract class Sprite {
	int x=3, y=3;
	abstract void move(char c);
}

class Main extends Sprite {
	void move(char c) {
		if( c == 'h') --x;
		else if (c == 'j') --y;
		else if (c == 'k') ++y;
		else if (c == 'l') ++x;
	}
}

class Monster extends Sprite {
	public Monster() {
		x = y = 7;
	}
	void move(char c) {
		x += (Math.random() - 0.5)>0? 1: -1;
		y += (Math.random() - 0.5)>0? 1: -1;
	}
}

public class GoldGame {

	public static void main(String[] args) {
		Main me = new Main();
		Monster monster = new Monster();
		boolean flag = false;
		
		char[] table = 
		
		
	}

}
