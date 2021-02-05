
public class Def {
	
	// number의 k번째 약수
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

	public static void main(String[] args) { // String[] args : 콘솔창에서 프로그램을 실행할 떄 인자값으로 넣어주는 것을 의미합니다. 거의 사용하지 않습니다.
		int result = function(3050, 10);
		if(result == -1)
		{
			System.out.println("없습니다.");
		}
		else
		{
			System.out.println("3050의 10번째 약수는 : " + result);
		}
	}

}
