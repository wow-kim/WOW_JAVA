
public class Teacher extends Person{
	
	private String teacherID;
	private int monthSalaty;
	private int workedYear;
	
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public int getMonthSalaty() {
		return monthSalaty;
	}
	public void setMonthSalaty(int monthSalaty) {
		this.monthSalaty = monthSalaty;
	}
	public int getWorkedYear() {
		return workedYear;
	}
	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}
	
	public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalaty, int workedYear) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalaty = monthSalaty;
		this.workedYear = workedYear;
	}
	
	public void show() {
		System.out.println("---------------------------");
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("키 : " + getHeight());
		System.out.println("몸무게 : " + getWeight());
		System.out.println("교직원 번호 : " + getTeacherID());
		System.out.println("월급 : " + getMonthSalaty());
		System.out.println("연차 : " + getWorkedYear());
	}
	
	
	
	
}
