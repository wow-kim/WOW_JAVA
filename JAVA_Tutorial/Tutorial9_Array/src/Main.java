import java.util.Scanner; 
// import ���־���ϴ� ���� : scanner�� �⺻ ������ �ܰ迡�� ���Ǵ� ���̺귯���� �ƴϱ� ����, �ܺο� �ִ� ���̺귯���� ���α׷� ������ �����;��մϴ�.


// �迭, 100���� ���Ұ� �� �� �ִ� int�� �迭 : int[] array = new int[100]
// new : ��� �ν��Ͻ��� ���� �� ��ӵ� �ϳ��� ���
// �迭�� index�� 0���� �����մϴ�!(n���� ���Ҷ�� index�� n-1����)

public class Main {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ���! : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i = 0; i < number; i++)
		{
			System.out.print("�迭�� �Է��� ������ �ϳ��� �Է��ϼ��� : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println("���� ū �� : " + result);
		scanner.close();
		
	}

}
