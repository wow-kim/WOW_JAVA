// break�� ���� �ݺ����� ��� �������� �� �ֽ��ϴ�.
// ���ѷ��� : for(;;), while(true)

public class Loop {

	final static int N = 15;
	
	public static void main(String[] args) {
		
		// while��
		int i = 1, sum = 0;
		while(i <= 1000)
		{
			sum += i++;
		}
		System.out.println("sum : " + sum);
		
		// for��
		for(int j = N; j > 0; j --)
		{
			for(int k = j; k > 0; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// x^2 + y^2 = r^2
		for(int x = -N; x <= N; x++)
		{
			for(int y = -N; y <= N; y++ )
			{
				if(x*x + y*y <= N*N)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		
	}

}
