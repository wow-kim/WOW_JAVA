
// ��ü Ŭ����, Object Ŭ����
// ��� ��ü�� �������ν� ���Դϴ�.
// ��� �ڹٿ��� ��� Ŭ������ �Ͻ������� Object Ŭ������ ��� �ް� �־��ϴ�.
// �̷��� Ŭ������ �����ϴ� ������ ��� Ŭ������ �������� �����ϰ� �־�� �ϴ� ����� �����ϱ� �����Դϴ�.

public class Main {

	public static void main(String[] args) {
		
		Archer archer1 = new Archer("�ü�1", "��");
		Archer archer2 = new Archer("�ü�1", "��");
		
		// ���������� ������ ���� ������ �ν��Ͻ� ��ü�� ���� �ٸ���.
		System.out.println(archer1 == archer2);
		
		// equals�� �̿��غ���
		System.out.println(archer1.equals(archer2));
	}

}
