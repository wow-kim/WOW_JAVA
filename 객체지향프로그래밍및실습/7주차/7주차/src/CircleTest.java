class Circle{
	int x,y;
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle(r="+radius+")";
	}
	
	public boolean equals(Circle c1) {
		if(radius == c1.radius) return true;
		else return false;
	}
}
public class CircleTest {

	public static void main(String[] args) {
		
		Circle obj1 = new Circle(20);
		Circle obj2 = new Circle(20);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1.equals(obj2))
			System.out.println("같습니다");
		else
			System.out.println("다릅니다.");
	}

}
