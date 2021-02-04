// 연산자

public class Main {
	
	final static int SECOND = 1000;

	public static void main(String[] args) {
		
		int minute = SECOND / 60;
		int second = SECOND / 60;
		System.out.println(minute + "분" + second + "초");
		
		int a = 10;
		System.out.println("a = " + a);
		a++; // 증감연산자
		System.out.println("a = " + a);
		System.out.println("a = " + ++a); // 앞에 붙어있는 경우 +1을 하고 a를 출력
		System.out.println("a = " + a--); // 뒤에 붙어있는 경우 a를 출력하고 빠져나가며 1을 더함
		
		// 나머지 출력
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		// 비교 연산자
		int b = 50;
		int c = 50;
		System.out.println(b == c);
		System.out.println(b > c);
		System.out.println((b > c ) && (b == c)); // and
		System.out.println((b > c ) || (b == c)); // or

		int x = 50;
		int y = 60;
		System.out.println(max(x, y));
		
		double q = Math.pow(3.0, 20.0); // Math라는 클래스에 있는 pow라는 함수를 불러옴
		System.out.println("3의 20제곱은 " + (int) q); // 정수형으로 형변환
		
		}
	
	// 함수를 만들어보자, 반환형 함수이름(매개변수)
	static int max(int d, int e) { // static : 클래스 전반적으로 사용되는 함수, Main 메쏘드에서 Max 함수를 사용하기 위해 붙여줌(Local/Global 느낌인듯?)
		int result  = (d > e ) ? d : e; // 삼항연산자, (d > e)가 참값이라면 d를, 아니라면 e를 반환
		return result;
		
	}

}
