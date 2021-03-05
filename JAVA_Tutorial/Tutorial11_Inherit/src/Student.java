// Person 클래스를 상속하는 Student 클래스 생성
public class Student extends Person {

	private String studentID;
	private int grade;
	private double GPA;
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	// 자신이 상속받은 클래스의 변수 또한 한번에 초기화해줍니다.
	// super : 자신의 부모 클래스가 가진 생성자를 실행하겠다는 의미입니다.
	// this를 해주는 이유 : 매개변수와 클래스 내의 변수가 이름이 완전히 똑같으면 컴퓨터가 변수를 구분하지 못하므로 this가 필요합니다.
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA; //GPA는 첫글자가 달라서 구분이 되기 때문에 this가 반드시 필요하지는 않습니다.
	}
	
	public void show() {
		System.out.println("-------------------------");
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("키 : " + getHeight());
		System.out.println("몸무게 : " + getWeight());
		System.out.println("학번 : " + getStudentID());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGPA());
		
	}
	
}
