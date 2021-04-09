abstract class Shape{
	int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
}

class Rectangle extends Shape{
	int width, height;
	public void draw() {
		System.out.println("R draw");
	}
}

class Triangle extends Shape{
	int width, height;
	public void draw() {
		System.out.println("T draw");
	}
}

class Circle_3 extends Shape{
	int width, height;
	public void draw() {
		System.out.println("C draw");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Shape s;
		//s = new Shape(); 추상 클래스는 객체 생성 불가, Shape를 일반 클래스로 바꾸면 오류안남
		s = new Rectangle();
		s.x = 10;
		s.y = 20;
		// s.widht = 10; Shape 참조변수 s로는 Rectangle에 접근 불가, Shape를 일반 클래스로 바꿔도 오류난다!
		
		Rectangle r;
		r = new Rectangle();
		r.x=10;
		r.y=20;
		r.width = 10;
		r.height = 20;
		
		Shape[] arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle_3();
		
		for(int i=0; i < arrayOfShapes.length; i ++) {
			arrayOfShapes[i].draw();
			
			if (arrayOfShapes[i] instanceof Rectangle)
				System.out.println("R object");
			else if (arrayOfShapes[i] instanceof Triangle)
				System.out.println("T object");
			else if (arrayOfShapes[i] instanceof Circle_3)
				System.out.println("C object");
		}
		
		
		
		
	}

}
