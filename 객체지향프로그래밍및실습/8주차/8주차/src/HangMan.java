import java.util.*;

public class HangMan {

	public static void main(String[] args) {

		String answer = "count";
		String now = "_____";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("������ ����" + now);
			System.out.print("���ڸ� �����Ͻÿ�: ");
			String c = sc.nextLine();
			int index = answer.indexOf(c);
			if (index == -1) {
				continue;
			} else if (index == answer.length()-1) {
				now = now.substring(0, index) + c;
			} else {
				now = now.substring(0, index) + c + now.substring(index+1); 
			}
		} while(answer.equals(now) == false);
		
		System.out.println("����!, ���� : "+ now);
		sc.close();
	}

}
