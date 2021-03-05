import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_ {

	public static void main(String[] args) {
		
		File file = new File("input.txt"); // input.txt��� ������ �ҷ��ͼ� file ������ ó���� �� �ֵ��� ���ݴϴ�.
		
		// ����ó�� ���� ; try - catch
		try {
			Scanner sc = new Scanner(file); // ������ ���ؼ� �Է¹޽��ϴ�.
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) { 
			System.out.println("������ �о���� ���߿� ������ �߻��߽��ϴ�.");
		} 
		
	}

}
