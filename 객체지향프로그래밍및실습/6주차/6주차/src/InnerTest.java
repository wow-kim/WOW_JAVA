
class Circle{
	int radius;
	Point center;
	
	// ���� Ŭ���� ����
	class Point{
		int x, y;
		
		public Point(int x, int y) {
			this.x =x; this.y = y;
		}
	}
	
	// ���� ���� Ŭ���� ����
	static class Line{
		int x1, y1, x2, y2;
		
		public Line (int a, int b, int c, int d) {
			x1=a; y1=b; x2=c; y2=d;
		}
	}
	
	public Circle(int radius, int x, int y) {
		this.radius = radius;
		this.center = new Point(x, y);
	}
	
	double calcArea() {
		
		// ����Ŭ����
		class C{
			String name;
		}
		C c= new C();
		return 3.14 * radius * radius;
	}
}

public class InnerTest {

	public static void main(String[] args) {
		Circle obj = new Circle(10, 10, 0);
		System.out.println("���� ���� : " + obj.calcArea());
		
		Circle.Point p = obj.new Point(10, 20);
		
		Circle.Line l = new Circle.Line(10, 20, 10, 20);
		
	}

}
