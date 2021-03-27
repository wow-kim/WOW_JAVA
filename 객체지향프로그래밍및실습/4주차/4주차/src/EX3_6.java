import java.util.Scanner;

public class EX3_6 {
	
	static void showBoard(char[][] board) {
		for (int i=0; i<3; i++) {
			System.out.println("  "+board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
			
			if (i != 2)
				System.out.println("---|---|---");	
		}
	}
	
	static boolean checkWin(char[][] table) {		
		// 행 검사
		for (int i = 0; i < 3; i++) {
			char t = table[i][0];
			if (t == 'o'){
					if (t == table[i][1] && t == table[i][2]) {
						System.out.println("Computer Win");
						return true;
					}
			}
			else if(t == 'x') {
					if (t == table[i][1] && t == table[i][2]) {
						System.out.println("You Win");
						return true;
					}	
			}
		}
		
		// 열 검사
		for (int j = 0; j < 3; j++) {
			char t = table[0][j];
			if (t == 'o'){
				if (t == table[1][j] && t == table[2][j]) {
					System.out.println("Computer Win");
					return true;
					}
			} else if(t == 'x') {
				if (t == table[1][j] && t == table[2][j]) {
					System.out.println("You Win");
					return true;
					}	
			}
		}
		
		// 대각선 검사
		char t = table[1][1];
		if (t == 'o') {
			if ((t==table[0][0] && t == table[2][2])||(t==table[0][2] && t==table[2][0])){
				System.out.println("Computer Win");
				return true;
			}
		} else if (t == 'x') {
			if ((t==table[0][0] && t == table[2][2])||(t==table[0][2] && t==table[2][0])){
				System.out.println("You Win");
				return true;
			}
		}
		
		// 무승부 검사
		for (int a=0; a< 3; a++) {
			for (int b=0; b < 3; b++) {
				if (table[a][b] == ' ')
					return false;
			}
		}	
		System.out.println("무승부");
		return true;
	}

	
	public static void main(String[] args) {		
		char[][] board = new char[3][3];
		int x, y;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i < 3; i++)
			for (int j=0; j<3; j++)
				board[i][j] = ' ';
		
		do {
			showBoard(board);
			
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
			
			if (checkWin(board) == true) {
				showBoard(board);
				break;
			}
			
			boolean flag = false;
			for (int i=0; i< 3; i++) {
				for (int j=0; j < 3; j++) {
					if (board[i][j] == ' ') {
						board[i][j] = 'o';
						flag = true;
						break;
					}
				}
				if (flag == true)
					break;
			}
			
			if (checkWin(board) == true){
				showBoard(board);
				break;
			}
			
		} while (true);
		
		scan.close();
	}
}
