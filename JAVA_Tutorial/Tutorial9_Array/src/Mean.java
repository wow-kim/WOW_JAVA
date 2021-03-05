
public class Mean {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		for(int i = 0; i < 100; i++)
		{
			array[i] = (int) (Math.random() * 100 + 1); 
			// Math : 기본적으로 가지고 있는 클래스, random : 랜덤
			// (int) -> 1부터 100까지의 정수
		}
		int sum = 0;
		for(int i = 0; i < 100; i ++)
		{
			sum += array[i];
		}
		System.out.println("100개의 랜덤 정수 평균 : " + sum/100 );
	}

}
