
public class Ascii {

	public static void main(String[] args) {
		
		// �ƽ�Ű �ڵ�
		for(char i = 'a'; i <= 'z'; i++) //�ƽ�Ű�ڵ带 �̿��� ���������� 1�� ���ذ��� ���ڸ� a���� z���� ���
		{
			System.out.print(i + " ");
		}
		
		
		// 10����, 8����, 16����
		int a = 200;
		
		System.out.println("10���� : " + a);
		System.out.format("8���� : %o\n", a); // format�� ��ĭ�� ������� �ʽ��ϴ�.
		System.out.format("16���� : %x", a);
		
		//���ڿ� String, �����Լ��� �����ϴ� Ư���� �ڷ���
		String name = "John Doe"; 
		System.out.println(name);
		System.out.println(name.substring(0, 1)); // substring, 0 : ù��° ����, 1: ������ ����
		System.out.println(name.substring(3, 6));
	}

}
