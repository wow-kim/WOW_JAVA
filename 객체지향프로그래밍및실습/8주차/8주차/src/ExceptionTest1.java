import java.io.*;

class MyException extends Exception {
	public MyException() {
		super("����� ���� ����");
	}
}

public class ExceptionTest1 {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("test.txt");
		char[] a = new char[50];
		fr.read(a);
		for (char c  : a)
			System.out.print(c);
		
		try {
			method1();
		} catch (MyException e) {
			System.out.println(e.getMessage() + "\n ȣ�� ���ó��� : ");
			e.printStackTrace();
			System.out.println("���� �׽�Ʈ ");
		}
		
	}
	public static void method1() throws MyException {
		throw new MyException();
	}

}
