// Ŭ���� : ��ü ���� ���α׷��ֿ� �־ ���� �⺻�� �Ǵ� ���Դϴ�.
// ���� ������ Ư���� ������ ��Ī�� �� �ֽ��ϴ�.
// ���� ��ǥ������ ���Ǵ� ���� Node Ŭ�����Դϴ�. �̴� ��ҳ� ��ġ, �ڷ� ���������� ���긣���� �� �� �ֽ��ϴ�.
// ���� ������Ʈ������ ���� Student Ŭ������ ���� �ϳ��� ó���� ������ ������ �����ϴµ� ����� �˴ϴ�.
// (��) Car Ŭ���� -> ���� : �ӷ�, ��, �̸� �� -> new Car(); �̷� ������ Car ��ü�� �����Ҽ� �ֽ��ϴ�. ����ó��!
// ��� �����͸� ������ ���� ����� �� �ֵ��� �ϴ� ���� �ٷ� "�ν��Ͻ�ȭ"��� �մϴ�. �̷��� ������ "�ν��Ͻ�"��� �մϴ�.
// �ν��Ͻ� : � Ŭ�������� ������� ������ ����Ҽ� �ִ� ����

// ��ü : �Ǽ����� �繰�ν� ǥ�� ����



public class Main {

	public static void main(String[] args) {
			
		// ������� Node Ŭ������ �����غ���!
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two);
		
		System.out.println("x :" + result.getX() + ", y :" + result.getY());
		
	}

}