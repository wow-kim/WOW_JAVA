public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		String s3 = "Java";
		String s4 = "Java";
//		상수 연산자
//		- new 연산자 없이 인스턴스를 생성한다.
//		- heap이 아니라 Constant Pool 이라는 상수만 모아두는 영역에서 따로 관리한다.
//		- 중복해서 생성되지 않는다.(s3와 s4는 같은 위치에 저장됨)

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		System.out.println();
		
		String s5 = "Hello World";
		int idx = 6;
		char c = s5.charAt(idx);
		System.out.println("Length : " + s5.length());
		System.out.println("Character at index " + idx + " : " + c);
		
		String s6 = "world";
		idx = s5.indexOf(s6);
		if (idx == -1)
			System.out.println(s6 + " does not exist");
		else
			System.out.println(s6 + " index : " + idx);
		
		System.out.println(s1.compareTo(s5));
		System.out.println(s5.compareTo(s1));
		// 각각의 문자의 유니코드 값에 근거해 사전적으로 비교합니다.
		
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		
	}

}
