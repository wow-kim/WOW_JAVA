import java.util.*;

public class EX2_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometer;
		double mile;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);
		mile = sc.nextDouble();
		
		kilometer =  1.609*mile;
		
		System.out.println(mile+"������ "+kilometer+"ų�ι����Դϴ�.");
		sc.close();
		
	}

}
