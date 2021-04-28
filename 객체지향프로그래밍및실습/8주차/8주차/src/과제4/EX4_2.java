package ����4;

class Rectangle {
	  int width, height;
	  public Rectangle(int w, int h) {
	    width = w;
	    height = h;
	  }
	}

class ColorRectangle extends Rectangle{
	String color;
	public ColorRectangle(int w, int h, String c) {
		super(w, h);
		color = c;
	}
	public void print() {
		System.out.println("���� : " + this.width);
		System.out.println("���� : " + this.height);
		System.out.println("���� : " + this.color);
	}
}

public class EX4_2 {

	public static void main(String[] args) {
		  ColorRectangle cr = new ColorRectangle(100, 100, "blue");
		  cr.print();
	}

}
