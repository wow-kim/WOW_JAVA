
public class Def {
	
	// number�� k��° ���
	public static int function(int number, int k) {
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				k--;
				if(k == 0)
				{
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) { // String[] args : �ܼ�â���� ���α׷��� ������ �� ���ڰ����� �־��ִ� ���� �ǹ��մϴ�. ���� ������� �ʽ��ϴ�.
		int result = function(3050, 10);
		if(result == -1)
		{
			System.out.println("�����ϴ�.");
		}
		else
		{
			System.out.println("3050�� 10��° ����� : " + result);
		}
	}

}
