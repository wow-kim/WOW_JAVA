import java.util.Scanner; // Scanner import

// �⺻ ����� : ����ڿ��� ��ȣ�ۿ�
// �ڹٿ����� ��ǥ������ Scanner Ŭ������ �̿��� ��ȣ�ۿ��Ҽ� ����
// Scanner sc = new Scanner(System.in); ���� Ŭ���� ��ü�� ������ �ڿ�
// sc.netInt(); �� ���� ������� int���� �Է� ���� �� �ֽ��ϴ�.
// �Է� ���� �ڷ�� ��� ó���� �� �ڿ� �ٽ� ����ڿ��� �� ���� ��ȯ�� �� �ֽ��ϴ�.


// �ڹٿ����� Scanner Ŭ����(�⺻���� ����� ���)�� �� Ȱ���ص� �پ��� ����� ���¸� ��������� ������ �� �ֽ��ϴ�. -> next() �Լ��� nextLine() �Լ� ������ ���

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner : Ŭ������ ������ ����, ���� �Լ��� �����մϴ�.
		System.out.print("������ �Է��ϼ���");
		int i = sc.nextInt();
		System.out.println("�Էµ� ������ " + i + "�Դϴ�.");
		sc.close(); // ������ϴ� ������ �Ϻ��� �������ν� ���α׷��� ���������� ���� �� �ֵ��� �մϴ�.
		
		
	}

}
