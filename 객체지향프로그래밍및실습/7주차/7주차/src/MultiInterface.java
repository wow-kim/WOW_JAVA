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
		System.out.println("프린터로 원을 출력합니다.");
	}
	
	public void draw() {
		System.out.println("화면에 원을 그립니다.");
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
