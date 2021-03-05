// ������

public class Main {
	
	final static int SECOND = 1000;

	public static void main(String[] args) {
		
		int minute = SECOND / 60;
		int second = SECOND / 60;
		System.out.println(minute + "��" + second + "��");
		
		int a = 10;
		System.out.println("a = " + a);
		a++; // ����������
		System.out.println("a = " + a);
		System.out.println("a = " + ++a); // �տ� �پ��ִ� ��� +1�� �ϰ� a�� ���
		System.out.println("a = " + a--); // �ڿ� �پ��ִ� ��� a�� ����ϰ� ���������� 1�� ����
		
		// ������ ���
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		// �� ������
		int b = 50;
		int c = 50;
		System.out.println(b == c);
		System.out.println(b > c);
		System.out.println((b > c ) && (b == c)); // and
		System.out.println((b > c ) || (b == c)); // or

		int x = 50;
		int y = 60;
		System.out.println(max(x, y));
		
		double q = Math.pow(3.0, 20.0); // Math��� Ŭ������ �ִ� pow��� �Լ��� �ҷ���
		System.out.println("3�� 20������ " + (int) q); // ���������� ����ȯ
		
		}
	
	// �Լ��� ������, ��ȯ�� �Լ��̸�(�Ű�����)
	static int max(int d, int e) { // static : Ŭ���� ���������� ���Ǵ� �Լ�, Main �޽�忡�� Max �Լ��� ����ϱ� ���� �ٿ���(Local/Global �����ε�?)
		int result  = (d > e ) ? d : e; // ���׿�����, (d > e)�� �����̶�� d��, �ƴ϶�� e�� ��ȯ
		return result;
		
	}

}
