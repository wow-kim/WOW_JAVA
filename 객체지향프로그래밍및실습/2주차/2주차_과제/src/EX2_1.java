import java.util.*;

public class EX2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orange;
		int box;
		int remainder;
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);
		orange = sc.nextInt();
		
		box = orange / 10;
		remainder = orange % 10;
		
		System.out.println(box + "�ڽ��� �ʿ��ϰ� " + remainder + "���� �����ϴ�.");
		sc.close();
		
	}

}
