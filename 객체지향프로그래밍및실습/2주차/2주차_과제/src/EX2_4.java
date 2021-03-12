import java.util.*;

public class EX2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int num_temp;
		String binary = "";
		
		System.out.print("Á¤¼ö: ");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		num_temp = num;
		
		while (num > 0) {			
			binary = (num % 2) + binary;
			num = num / 2 ;
		}

		System.out.println(num_temp +": "+ binary);
		sc.close();
		
	}

}
