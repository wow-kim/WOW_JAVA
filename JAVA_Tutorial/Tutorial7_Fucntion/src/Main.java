// 객체 지향 프로그래밍을 공부해봅시다.
// 객체 지향 : 객체는 일반적으로 말하는 물건을 의미하며, 여기서 물건은 단순한 데이터가 아니고 그 데이터의 조작 방법에 대한 정보 또한 포함하고 있어 그것을 대상으로 다루는 수법을 객체지향이라고 합니다.
// 현실 세계의 다양한 사물을 컴퓨터 내부의 언어로 표현하고 활용할 수 있습니다.


// 사용자 정의 함수 : 정해진 특정한 기능을 수행하는 모듈을 의미, 하나의 문제를 잘게 분해할 수 있습니다.
// 각각의 모듈로서 쉽게 수정되고 보완될 수 있다는 장점이 있습니다.

public class Main {
	
	// 함수의 반환형, 매개변수, return
	// 자바에서는 함수와 메쏘드가 같은 의미입니다.
	// 원래 메쏘드는 클래스 및 객체와 연관되어 있는 함수
	// 메쏘드 -> 클래스 내에 선언되어 있는 함수
	public static int function(int a, int b, int c) {
		int min;
		if(a > b)
		{
			if(b > c)
			{
				min = c;
			}
			else
			{
				min = b;
			}
		}
		else
		{
			if(a > c)
			{
				min = c;
			}
			else
			{
				min = a;
			}
		}
		for(int i = min; i > 0; i--)
		{
			if(a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println("최대공약수 : " + function(450, 300 ,750) );

	}

}
