
public class Main2 {
	
	// ���ڿ��� ������ �ܾ�
	public static char function(String input) {
		return input.charAt( input.length() - 1); //charAt : 0������
	}
	
	// ���߿� �� ū ���� ����
	public static int max(int a, int b){
		return (a > b) ? a : b; //���� ������
	}
	
	// �Լ��� �̿��� �Լ�, �� �� ���� ū �� ����
	public static int mmax(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}
	
	public static void main(java.lang.String[] args) {
		System.out.println("Hello World�� ������ �ܾ� : " + function("Hello World"));
		System.out.println("���� ū �� : " + mmax(345, 56, 77));
	}

}
