// �������̽� : �߻�Ŭ�������� �� �߻�����! �߻��̶� ����� �����Դϴ�
// �������̽��� ���� ����� �����ϰ� ���ִ� ��� ����Դϴ�.
// �߻� Ŭ������ �߻� �޼ҵ� �ܿ� ��� ������ �Ϲ� �޼ҵ带 ���� �� ������
// �������̽������� �ݵ�� ������ ���ǵ� �߻� �޼ҵ�� ������� ���� �� �ִٴ� Ư¡�� �ֽ��ϴ�. ���� ���迡 �ʿ��� �޼ҵ常 ��� �ؾ��մϴ�.(�߻�ȭ�� ������ �� �����ϴ�.  ���踸 �մϴ�)
// �� ������Ʈ�� ���� �۾��� �����ϰ�, �䱸�Ǵ� ������ ������ �� ���Ƽ� �� ü�����̶�� ���� �޽��ϴ�.

// �������̽� ��ӿ��� extends�� �ƴ� implements ��� 
// �߻� Ŭ������ ���� ����� �Ұ���, �������̽��� ����
public class Main implements Dog, Cat {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.one();
		main.two();

	}
	
	
	// ��ġ�°� ������ �ϳ��� �������൵ ��
	@Override
	public void crying() {
		System.out.println("��!");
		
	}

	@Override
	public void one() {
		System.out.println("Hello");
		
	}

	@Override
	public void two() {
		System.out.println("World");
	}

}
