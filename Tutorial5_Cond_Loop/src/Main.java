// (i++) == (i += 1) == (i = i + 1) 

public class Main {

	public static void main(String[] args) {
		
		// ���ǹ�
		String a = "I Love You";
		if(a.contains("Love")) // String�� ���� �Լ� contains
		{
			System.out.println("Me too");
		}
		else
		{
			System.out.println("I Hate You");
		}
		
		int score = 95;
		
		if(score >= 90)
		{
			System.out.println("A+");
		}
		else if(score >= 70)
		{
			System.out.println("B+");
		}
		else
		{
			System.out.println("C+");
		}
		
		String b = "Man";
		int c = 0;
		// �ڹٴ� String�� ����� �� equal()�� �̿��մϴ�.
		// �ֳ��ϸ� String�� �ٸ� �ڷ����� �ٸ� ���ڿ� �ڷ����̱� �����Դϴ�.
		if(b.equals("Man"))
		{
			System.out.println("�����Դϴ�");
		}
		
		if(c == 3)
		{
			System.out.println("3�Դϴ�");
		}
		
		if(b.equalsIgnoreCase("man") && c == 0)
		{
			System.out.println("���Դϴ�.");
		}
		
	}

}
