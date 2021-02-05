
public class Recur {

	public static int factorial(int number){
		if ( number == 1) {
			return 1;
		}
		else
			return  number * factorial(number - 1);
	}
	
	public static int fibonacci(int number) {
		if ( number == 1){
			return 1;
		}
		else if( number == 2){
			return 1;
		}
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼 : " + factorial(10));
		System.out.println("10 피보나치 : " + fibonacci(10));

	}

}
