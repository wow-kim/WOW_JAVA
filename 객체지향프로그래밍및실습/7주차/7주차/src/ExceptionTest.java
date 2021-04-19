public class ExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int i = 0;
		
		try {
			for(i=0; i<=arr.length; i++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println("출력");
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			
		} finally {
			System.out.println("최종 처리");
		}
		
		String s1 = "AA";
		String s2 = new String("AA");
		System.out.println(s1.equals(s2));
		
	}

}
