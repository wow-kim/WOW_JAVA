
public class Person {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	// get변수, set변수는 전세계적으로 공통적으로 사용하는 필수적, 이클립스에는 한번에 만들어주는 기능도 존재합니다!
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// 생성자도 있습니다!!
	public Person(String name, int age, int height, int weight) {
		super(); // super : 자신의 부모 클래스의 생성자를 실행하겠다.를 의미합니다.
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
