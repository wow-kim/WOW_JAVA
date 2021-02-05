import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_ {

	public static void main(String[] args) {
		
		File file = new File("input.txt"); // input.txt라는 파일을 불러와서 file 변수가 처리할 수 있도록 해줍니다.
		
		// 예외처리 구문 ; try - catch
		try {
			Scanner sc = new Scanner(file); // 파일을 통해서 입력받습니다.
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) { 
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		} 
		
	}

}
