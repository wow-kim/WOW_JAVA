
public class Person {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	// get����, set������ ������������ ���������� ����ϴ� �ʼ���, ��Ŭ�������� �ѹ��� ������ִ� ��ɵ� �����մϴ�!
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
	
	// �����ڵ� �ֽ��ϴ�!!
	public Person(String name, int age, int height, int weight) {
		super(); // super : �ڽ��� �θ� Ŭ������ �����ڸ� �����ϰڴ�.�� �ǹ��մϴ�.
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
