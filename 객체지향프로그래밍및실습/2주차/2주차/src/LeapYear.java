import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int year;
		boolean isLeapYear;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("year ют╥б : ");
		year = sc.nextInt();
		
		isLeapYear = ((year%4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		System.out.print(year + "=" + isLeapYear);
		sc.close();
	}

}
