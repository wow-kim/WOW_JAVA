import java.util.Scanner;

// 상속이란 다른 클래스가 가진 정보를 자신이 포함하겠다는 의미입니다.
// 불필요한 코드의 수를 줄일 수 있습니다.
// 부모 클래스의 속성을 "기본적으로 가지면서" 추가적으로 새로운 속성을 추가할 수 있음

// 빵과 빵틀

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("김태현", 25, 175, 70, "2016580009", 4, 3.9);
		Student student2 = new Student("유혜인", 26, 160, 47, "2015580009", 4, 4.1);
		student1.show();
		student2.show();
		
		// 아주 많은 학생들을 관리할 수 있는 Student 클래스의 배열
		// 실질적으로 이런식으로 학생들의 정보를 관리합니다.
		Student[] students = new Student[55];
		for(int i = 0; i < 50; i++) {
			students[i] = new Student("홍길동", 20, 175, 70, i + "", 1, 4.5); // int + "" -> 정수형으로 변환됩니다.
			students[i].show();
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇명의 학생이 존재합니까");
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
			System.out.print("학생의 이름를 입력하세요 : ");
			name = scan.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			System.out.print("학생의 학번를 입력하세요 : ");
			studentID = scan.next();
			System.out.print("학생의 학년를 입력하세요 : ");
			grade = scan.nextInt();
			System.out.print("학생의 학점를 입력하세요 : ");
			gPA = scan.nextDouble();
			
			students[i + 50] = new Student(name, age, height, weight, studentID, grade, gPA);
			
		}
		for(int i = 0; i < 50 + number; i++)
		{
			students[i].show();
		}
		
	}

}
