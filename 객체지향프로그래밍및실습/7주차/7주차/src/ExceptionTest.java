public class ExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int i = 0;
		
		try {
			for(i=0; i<=arr.length; i++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println("���");
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �߻�");
			
		} finally {
			System.out.println("���� ó��");
		}
				
		
	}

}
