import java.util.*;

public class EX2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money;
		int price;
		int tax;
		int changes;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("πﬁ¿∫ µ∑: ");
		money = sc.nextInt();
		
		System.out.print("ªÛ«∞ ∞°∞›: ");
		price = sc.nextInt();
		
		tax = price / 10;
		changes = money - price;
		System.out.println("∫Œ∞°ºº: "+ tax);
		System.out.println("¿‹µ∑: "+ changes);
		sc.close();

		
	}

}
