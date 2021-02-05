// break를 통해 반복문을 즉시 빠져나올 수 있습니다.
// 무한루프 : for(;;), while(true)

public class Loop {

	final static int N = 15;
	
	public static void main(String[] args) {
		
		// while문
		int i = 1, sum = 0;
		while(i <= 1000)
		{
			sum += i++;
		}
		System.out.println("sum : " + sum);
		
		// for문
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
