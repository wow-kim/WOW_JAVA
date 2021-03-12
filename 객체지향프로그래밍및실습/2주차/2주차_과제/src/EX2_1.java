import java.util.*;

public class EX2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orange;
		int box;
		int remainder;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		orange = sc.nextInt();
		
		box = orange / 10;
		remainder = orange % 10;
		
		System.out.println(box + "박스가 필요하고 " + remainder + "개가 남습니다.");
		sc.close();
		
	}

}
