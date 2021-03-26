//package CH03;

import java.util.Scanner;

public class Tic_OLD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = new char[3][3];
		int x, y;
		int win=0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i < 3; i++)
			for (int j=0; j<3; j++)
				board[i][j] = ' ';
		
		do {
			for (int i=0; i<3; i++) {
				System.out.println("  "+board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
				
				if (i != 2)
					System.out.println("---|---|---");	
			}
			
			do {
			System.out.print("다음 수의 좌표를 입력하세요: ");
			x = scan.nextInt();
			y = scan.nextInt();
			if (x >= 0 && x <= 2 && y >=0 && y <= 2)
				break;
			} while (true);
				
			if (board[x][y] != ' ') {
				System.out.println("잘못된 위치입니다. ");
				continue;
			} else {
				board[x][y] = 'x';
			}
			
			int a=0, b=0;
			for (a=0; a< 2; ++a) {
				for (b=0; b < 2; ++b) {
					if (board[a][b] != ' ')
						win++;
				}
			}
			System.out.println(win);
			if (win == 9) {
				System.out.println("게임 끝!");
				break;
			} else {
				win = 0;
			}
			
			
			int i=0, j=0;
			for (i=0; i< 2; ++i) {
				for (j=0; j < 2; ++j) {
					if (board[i][j] == ' ')
						break;
				}
				if (board[i][j] == ' ')
					break;
			}
			
			if (i<3 && j < 3)
				board[i][j] = 'o';
		} while (true);
		
	}
	

}
