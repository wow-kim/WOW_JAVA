public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		String s3 = "Java";
		String s4 = "Java";
//		��� ������
//		- new ������ ���� �ν��Ͻ��� �����Ѵ�.
//		- heap�� �ƴ϶� Constant Pool �̶�� ����� ��Ƶδ� �������� ���� �����Ѵ�.
//		- �ߺ��ؼ� �������� �ʴ´�.(s3�� s4�� ���� ��ġ�� �����)

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
		// ������ ������ �����ڵ� ���� �ٰ��� ���������� ���մϴ�.
		
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		
	}

}
