import java.util.*;

class NotFoundException extends Exception{
	public NotFoundException() {
		super("사용자 정의 예외");
	}
}

public class ExceptionTest2 {
	
	static void searchArray(int[] arr, int key) throws NotFoundException {
		
		Arrays.sort(arr);
		int i = Arrays.binarySearch(arr, key);
		if (i >=0) {
			System.out.println("숫자의 위치 : " + i);
		} else {
			
			throw new NotFoundException();
		}
	}

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		int[] arr = {3, 1, 5, 9, 6};
		int key = 8;
		try {
			searchArray(arr, key);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage() + "\n 호출 스택내용 : ");
			e.printStackTrace();
		}
	}

}

