
public class Ascii {

	public static void main(String[] args) {
		
		// 아스키 코드
		for(char i = 'a'; i <= 'z'; i++) //아스키코드를 이용해 내부적으로 1씩 더해가며 문자를 a부터 z까지 출력
		{
			System.out.print(i + " ");
		}
		
		
		// 10진수, 8진수, 16진수
		int a = 200;
		
		System.out.println("10진수 : " + a);
		System.out.format("8진수 : %o\n", a); // format은 한칸을 띄워주지 않습니다.
		System.out.format("16진수 : %x", a);
		
		//문자열 String, 내부함수가 존재하는 특수한 자료형
		String name = "John Doe"; 
		System.out.println(name);
		System.out.println(name.substring(0, 1)); // substring, 0 : 첫번째 문자, 1: 마지막 문자
		System.out.println(name.substring(3, 6));
	}

}
