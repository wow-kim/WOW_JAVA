import java.util.Scanner;

// ����̶� �ٸ� Ŭ������ ���� ������ �ڽ��� �����ϰڴٴ� �ǹ��Դϴ�.
// ���ʿ��� �ڵ��� ���� ���� �� �ֽ��ϴ�.
// �θ� Ŭ������ �Ӽ��� "�⺻������ �����鼭" �߰������� ���ο� �Ӽ��� �߰��� �� ����

// ���� ��Ʋ

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("������", 25, 175, 70, "2016580009", 4, 3.9);
		Student student2 = new Student("������", 26, 160, 47, "2015580009", 4, 4.1);
		student1.show();
		student2.show();
		
		// ���� ���� �л����� ������ �� �ִ� Student Ŭ������ �迭
		// ���������� �̷������� �л����� ������ �����մϴ�.
		Student[] students = new Student[55];
		for(int i = 0; i < 50; i++) {
			students[i] = new Student("ȫ�浿", 20, 175, 70, i + "", 1, 4.5); // int + "" -> ���������� ��ȯ�˴ϴ�.
			students[i].show();
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ����� �л��� �����մϱ�");
		int number = scan.nextInt();
		for(int i = 0; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = scan.next();
			System.out.print("�л��� ���̸� �Է��ϼ��� : ");
			age = scan.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height = scan.nextInt();
			System.out.print("�л��� �����Ը� �Է��ϼ��� : ");
			weight = scan.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			studentID = scan.next();
			System.out.print("�л��� �г⸦ �Է��ϼ��� : ");
			grade = scan.nextInt();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			gPA = scan.nextDouble();
			
			students[i + 50] = new Student(name, age, height, weight, studentID, grade, gPA);
			
		}
		for(int i = 0; i < 50 + number; i++)
		{
			students[i].show();
		}
		
	}

}
