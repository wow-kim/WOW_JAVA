import java.util.*;

public class EX3_5 {

	public static void main(String[] args) {
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 항의 개수: ");
		int num = sc.nextInt();
		sc.close();
		
		int[] fibo = new int[num+1];
		fibo[0] = 0;
		fibo[1] = 1;
		
		for (i=0; i<num; i++) {
			System.out.print(" "+fibo[i]);
			if (i>=1) {
				fibo[i+1] = fibo[i] + fibo[i-1];
			}
		}
		

		
	}

}
