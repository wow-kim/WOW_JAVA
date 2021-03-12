import java.util.*;

public class EX2_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometer;
		double mile;
		
		System.out.print("마일을 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		mile = sc.nextDouble();
		
		kilometer =  1.609*mile;
		
		System.out.println(mile+"마일은 "+kilometer+"킬로미터입니다.");
		sc.close();
		
	}

}
