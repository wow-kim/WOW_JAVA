import java.util.Scanner;

public class mini_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random() * 100);
		int guess;
		int trial = 0;
		
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("������ ���纸���� : ");
			guess = sc.nextInt();
			trial++;
			if (guess < answer)
				System.out.println("���ڰ� �� �����ϴ�.");
			else if (guess > answer)
				System.out.println("���ڰ� �� �����ϴ�.");
		} while (guess != answer);
		System.out.println("�����մϴ�!, �õ�Ƚ�� : " + trial);
		sc.close();
	}
}
