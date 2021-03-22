class Circle {
	int radius;
	String color;
	
	double calcArea() {
		return 3.14 * radius * radius;
	}
}
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj;
		obj = new Circle();
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.calcArea();
		System.out.println("원의면적=" + area);
	}

}
