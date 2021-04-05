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
			
			System.out.print("\n몇번째 좌석을 예약하시겠습니까? ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (seats[num] == 0) {
				seats[num] = 1;
				System.out.println("예약되었습니다.\n");
			} else {
				System.out.println("예약할 수 없습니다.");
				break;
			}
			
		}
		
	}

}
