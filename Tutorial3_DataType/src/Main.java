// ���� �ڷ��� : Boolean/Numeric
// (boolean)/(char)/(byte/short/int/long)/(float/double)
// ����� �ڷ��� : String/Array/etc..

// ������ ��Ÿ���� �ڷ����� ���� ������ �� �ڷ����� �����ϴ� �޸� ������ ũ�Ⱑ �ٸ��� �����Դϴ�.
// double ���̶�� �ϴ���� �����ϰ� ū ���� �����ϸ� �߸��� ��� ����� ���� �� �ֽ��ϴ�.
// Ŭ�������� �ڷ����� String : ���������� char�� �迭�� �Ǿ� �ֽ��ϴ�. �׷��ٸ� String�� �ִ� ũ��� 4�Ⱑ����Ʈ�� ���ڸ� ���� �� �ֽ��ϴ�.(������..?!)


public class Main {

	public static void main(String[] args) {
		
		double b = 0.5;
		int a = (int) (b + 0.5); // (Dint) : ����ȯ, �Ǽ����� �ݿø��� �� �̿��� �� �ֽ��ϴ�.
		System.out.println(a);
		
		double c = 10.3;
		double d = 9.6;
		double e = 10.1;
		
		System.out.println((c+d+e)/3);
	}

}
