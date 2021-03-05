
public class Iter {

	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i ++)
		{
			sum *= i;
		}
		return sum;
	}
	
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if(number == 1)
		{
			return one;
		}
		else if(number == 2)
		{
			return two;
		}
		else
		{
			for(int i=2; i < number; i++)
			{
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼 : " + factorial(10));
		System.out.println("피보나치 10 : " + fibonacci(10));
		
	}

}
