
public class Overflow {
	
	final static int INT_MAX = 214783647;

	public static void main(String[] args) {
		int a = INT_MAX;
		System.out.println(a+1); 
		// �����÷ο� �߻�, 
		// 214783647 : Int���� ���� �� �ִ� �ִ��� ���� -> �����÷ο찡 �߻� -> ��ȯ������ ������ �ֱ� ������ ���� ���� ������ ���ư�
	}

}
