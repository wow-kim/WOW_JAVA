interface Printable{
	void print();
}

interface Drawble {
	void draw();
}

class Shape {
	int x, y;
	
	public void draw() {
		System.out.println("Shape Draw");
	}
}

public class MultiInterface extends Shape implements Printable, Drawble {
	
	public void print() {
		System.out.println("�����ͷ� ���� ����մϴ�.");
	}
	
	public void draw() {
		System.out.println("ȭ�鿡 ���� �׸��ϴ�.");
	}

	public static void main(String[] args) {
		MultiInterface obj = new MultiInterface();
		obj.print();
		obj.draw();
		
		Printable p = obj;
		p.print();
		
		Drawble d = obj;
		d.draw();
	}

}
