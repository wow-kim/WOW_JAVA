// ���� �ڷ��� : Boolean/Numeric
// (boolean-Not applicable)/(char - 2����Ʈ)/(byte - 1����Ʈ,/short - 2����Ʈ/int -4����Ʈ/long - 8����Ʈ)/(float - 4����Ʈ/double - 8����Ʈ)
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
