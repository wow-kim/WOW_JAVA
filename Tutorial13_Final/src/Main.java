// �ڹٿ��� ���� ������ �ʴ� Ư���� ���� ���ϰ� ���� ���� Final�� ����մϴ�.
// �� Ű����� ����, �޼ҵ�, Ŭ������ ��� ����� �� �ֽ��ϴ�.
// ������ ����ϸ� ����� �Ǹ�
// �޽�忡 ����ϸ� �����ǰ� �Ұ����� �޼ҵ尡 �Ǹ�
// Ŭ������ ����� ���� ����� �Ұ����� �ϳ��� ������ Ŭ������ �Ǵ� ���Դϴ�.

public class Main extends Parent{
	
	// �Լ��� ������, �θ� Ŭ�������� ��ӹ��� �Լ��� �������̵�
	// final�ϰ� �Ǹ� ������ �Ұ�
	//public void show() {
	//	System.out.println("Hello");
	//}
	
	public static void main(String[] args) {
		
		final int number = 10; // ���!
		// number = 5; ���� �߻�
		System.out.println(number);
		
		Main main = new Main();
		main.show();
		

	}

}
