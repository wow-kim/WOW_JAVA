import java.nio.channels.ScatteringByteChannel;
import java.util.*;

class User{
	String userId, password;
	static int count = 0;
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
		count++;
	}
}

public class UserTest {

	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
				
		while (true) {
			System.out.println("=================================");
			System.out.println("1. Sing Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("=================================");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("��ȣ�� �Է��Ͻÿ� : ");
			int num = sc.nextInt();
			
			if (num == 1) {
				System.out.print("Id: ");
				String id_signUp = sc.next();
				System.out.print("Password: ");
				String pw_singUp = sc.next();
				users.add(new User(id_signUp, pw_singUp));
			} else if (num == 2) {
				System.out.print("Id: ");
				String id_login = sc.next();
				System.out.print("Password: ");
				String pw_login = sc.next();
				User temp = new User(id_login, pw_login);
				
				boolean flag = false;
				for (User obj : users) {
					if (temp.userId.equals(obj.userId) && temp.password.equals(obj.password)) {
						flag = true;
						break;
					}
				}
				
				if (flag == true)
					System.out.println("�α��εǾ����ϴ�.");
				else
					System.out.println("���̵� �Ǵ� ��й�ȣ�� ��Ȯ�� �Է��ϼ���.");
				
			} else if (num == 3) {
				for(User obj : users) {
					System.out.println("{ " + obj.userId + ", " + obj.password + " }"); 
				}
			} else if (num == 4) {
				System.exit(0);
			} else {
				System.out.println("Wrong Number!");
			}		
			
		}

	}

}
