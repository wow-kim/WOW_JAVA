// Person Ŭ������ ����ϴ� Student Ŭ���� ����
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
	
	// �ڽ��� ��ӹ��� Ŭ������ ���� ���� �ѹ��� �ʱ�ȭ���ݴϴ�.
	// super : �ڽ��� �θ� Ŭ������ ���� �����ڸ� �����ϰڴٴ� �ǹ��Դϴ�.
	// this�� ���ִ� ���� : �Ű������� Ŭ���� ���� ������ �̸��� ������ �Ȱ����� ��ǻ�Ͱ� ������ �������� ���ϹǷ� this�� �ʿ��մϴ�.
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA; //GPA�� ù���ڰ� �޶� ������ �Ǳ� ������ this�� �ݵ�� �ʿ������� �ʽ��ϴ�.
	}
	
	public void show() {
		System.out.println("-------------------------");
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getAge());
		System.out.println("Ű : " + getHeight());
		System.out.println("������ : " + getWeight());
		System.out.println("�й� : " + getStudentID());
		System.out.println("�г� : " + getGrade());
		System.out.println("���� : " + getGPA());
		
	}
	
}
