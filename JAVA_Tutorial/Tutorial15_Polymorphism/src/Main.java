import java.util.Scanner;

// �������� �⺻������ �پ��� ������ ������ �����ٴ� �ǹ̸� ������ �ֽ��ϴ�.
// �ڹٴ� �������� �� Ư¡���� ������ ��ü ���� ���α׷��� ����̸�, �ڹٿ����� �� �������� �̿��Ͽ� ��ü�� ����� �� ����ϴ� ���� ���¸� �ٲپ� ���� Ÿ���� ��ü�� ������ �� �ֽ��ϴ�.
// ���α׷��� �ҽ� �ڵ带 �����ϰ� ������ �� �ֽ��ϴ�.
// ���� �߿�!! : �θ� Ŭ���� Ÿ���� ���� ������ ���� Ŭ������ ��ü�� ������ �� �ְ� ���ݴϴ�.

public class Main {

	public static void main(String[] args) {
		
		// ������ : �ڽ�Ŭ������ �ν��Ͻ��� �θ�Ŭ������ ������ �־��� �� �ֽ��ϴ�. 
		Fruit fruit1 = new Peach();
		fruit1.show();
		
		Fruit fruit2 = new Banana();
		fruit2.show();
		
		// ����ڰ� ������ �� �ֵ��� �ϴ� ���� �������� �ٽ�!!!!
		// �̷������� ���� ����մϴ�. ������..!
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ٳ��� : 1, ������ : 2");
		int input = scanner.nextInt();
		Fruit fruit; // ���� ����
		if(input == 1)
		{
			fruit = new Banana();
			fruit.show();
		}
		else if(input == 2)
		{
			fruit = new Peach();
			fruit.show();
		}
		
		
	}

}
