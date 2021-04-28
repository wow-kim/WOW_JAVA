package 과제4;

import java.util.*;

abstract class Sprite{
	int x=3, y=3;
	abstract void move(char c);
}

class Main extends Sprite{
	void move(char c) {
		if(c == 'h' && x > 1) --x;
		else if(c == 'j' && y > 1) --y;
		else if(c == 'k' && y < 9 ) ++y;
		else if(c == 'l' && x < 18) ++x;
		else
			System.out.println("그 곳으로는 갈 수 없습니다.");
	}
}

class Monster extends Sprite {
	public Monster() {
		x = y = 7;	
	}
	void move(char c) {
		int temp_x = (Math.random() - 0.5)>0? 1: -1;
		int temp_y = (Math.random() - 0.5)>0? 1: -1;
		if(x + temp_x >= 1 && x + temp_x <= 18)
			x += temp_x;
		if(y + temp_y >= 1 && y + temp_y <= 9)
			y += temp_y;	
	}
}

class Gold extends Sprite {
	public Gold() {
		x=3;
		y=6;
	}
	void move(char c) {
	}
}

public class EX4_1 {

	public static void main(String[] args) {
		
		char[][] table = new char[11][20];

		Main Me = new Main();
		Monster M = new Monster();
		Gold G = new Gold();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			for(int i=0; i<11; i++) {
				for(int j=0; j<20; j++) {
					if(j == 0 || j == 19 || i == 0 || i == 10 )
						table[i][j] = '#';
					else
						table[i][j] = ' ';
				}
			}
			
			table[G.y][G.x] = 'G';
			table[Me.y][Me.x] = '@';
			table[M.y][M.x] = 'M';	
			
			for(int i=0; i<11; i++) {
				for(int j=0; j<20; j++) {
					System.out.print(table[i][j]);
				}
				System.out.print("\n");
			}
			System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l) : ");
			char dir = sc.next().charAt(0);
			
			Me.move(dir);
			if(Me.x == G.x && Me.y == G.y) {
				System.out.println("I have got Gold");
				break;
			}
			
			M.move(dir);
			if(Me.x == M.x && Me.y == M.y) {
				System.out.println("Monster has got me");
				break;
			}
			
			if(M.x == G.x && M.y == G.y) {
				System.out.println("Monster has got Gold");
				break;
			}
		
		}
		sc.close();
	}

}
