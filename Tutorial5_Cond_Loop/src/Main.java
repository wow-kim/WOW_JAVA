// (i++) == (i += 1) == (i = i + 1) 

public class Main {

	public static void main(String[] args) {
		
		// 조건문
		String a = "I Love You";
		if(a.contains("Love")) // String에 대한 함수 contains
		{
			System.out.println("Me too");
		}
		else
		{
			System.out.println("I Hate You");
		}
		
		int score = 95;
		
		if(score >= 90)
		{
			System.out.println("A+");
		}
		else if(score >= 70)
		{
			System.out.println("B+");
		}
		else
		{
			System.out.println("C+");
		}
		
		String b = "Man";
		int c = 0;
		// 자바는 String을 비요할 때 equal()을 이용합니다.
		// 왜냐하면 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
		if(b.equals("Man"))
		{
			System.out.println("남자입니다");
		}
		
		if(c == 3)
		{
			System.out.println("3입니다");
		}
		
		if(b.equalsIgnoreCase("man") && c == 0)
		{
			System.out.println("참입니다.");
		}
		
	}

}
