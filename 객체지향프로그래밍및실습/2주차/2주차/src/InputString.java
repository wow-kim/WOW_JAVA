import java.util.*;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�");
		name = sc.nextLine();
		
		System.out.print("���� �Է�");
		age = sc.nextInt();
		System.out.println(name + "��" + age + "�� �̳׿�!");
		sc.close();
	}

}
