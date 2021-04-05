
class Complex {
	
	private int real;
	private int image;
	
	public Complex() {
		real = 0;
		image = 0;
	}
	
	public void setReal(int r) {
		this.real = r;
	}
	public void setImage(int i) {
		this.image = i;
	}
	public void print() {
		System.out.println(this.real + "+" + this.image + "i" );
	}
}

public class EX4_2 {

	public static void main(String[] args) {
		Complex com  = new Complex();
		com.setReal(10);
		com.setImage(20);
		com.print();

	}

}
