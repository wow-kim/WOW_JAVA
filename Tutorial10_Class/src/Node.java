
public class Node {

	// �ڹ��� ��ü���� ���α׷����� ������ �߿����, private�� �ܺο��� �ѹ��� ������ �� ���� �����Դϴ�.
	private int x;
	private int y;
	
	// ���� �Լ��� ���� �ܺο��� ������ �� �ְ� ���ݴϴ�.
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x; // this : �ڽ��� ������ �ִ� ������ �Ӽ��� ���� �ٲ��� �� ����մϴ�.
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//������ : �ν��Ͻ� ��ü�� �ϳ��� ����� �ٶ� �ڵ����� ���� �ʱ�ȭ���ִ� �Լ� -> Ŭ������ ���� �̸��� ������ �մϴ�!
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Node Other : �ٸ� ��带 �Ű������� �����ϴ�. ��ȯ���� Node
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}
