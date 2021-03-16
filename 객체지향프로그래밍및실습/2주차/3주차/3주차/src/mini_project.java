import java.util.Scanner;

public class mini_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random() * 100);
		int guess;
		int trial = 0;
		
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("정답을 맞춰보세요 : ");
			guess = sc.nextInt();
			trial++;
			if (guess < answer)
				System.out.println("숫자가 더 높습니다.");
			else if (guess > answer)
				System.out.println("숫자가 더 낮습니다.");
		} while (guess != answer);
		System.out.println("축하합니다!, 시도횟수 : " + trial);
		sc.close();
	}
}
