import java.util.*;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력");
		name = sc.nextLine();
		
		System.out.print("나이 입력");
		age = sc.nextInt();
		System.out.println(name + "님" + age + "살 이네요!");
		sc.close();
	}

}
