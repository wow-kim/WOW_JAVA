import java.util.*;

public class EX5_1 {

	public static void main(String[] args) {
		int[] seats = new int[10];
		for(int i=0; i<10; i++)
			seats[i] = 0;
		
		while (true) {
			System.out.println("---------------------");
			for(int i=0; i<10; i++)
				System.out.print(i + " ");
			System.out.println("\n---------------------");
			for(int i=0; i<10; i++)
				System.out.print(seats[i] + " ");
			
			System.out.print("\n���° �¼��� �����Ͻðڽ��ϱ�? ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (seats[num] == 0) {
				seats[num] = 1;
				System.out.println("����Ǿ����ϴ�.\n");
			} else {
				System.out.println("������ �� �����ϴ�.");
				break;
			}
			
		}
		
	}

}
