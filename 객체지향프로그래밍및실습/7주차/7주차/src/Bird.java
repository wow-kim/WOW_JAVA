class Animal{
	void walk() {
		System.out.println("���� �� ����");
	}
}
public class Bird extends Animal {
	
	public void fly() {
		System.out.println("�� �� ����");
	}
	
	public void sing() {
		System.out.println("�뷡�� �� ����");
	}
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
	}

}
