
public class Circle1 {
	int radius;
	
	void setRadius(int r) {
		radius = r;
	}
	
	double calcArea() {
		return 3.14*radius*radius;
	}
	
	void print() {
		System.out.println("���� ������: "+radius);
		System.out.println("���� ����: "+calcArea());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 obj;
		obj = new Circle1();
		obj.setRadius(10);
		obj.print();
		
	}

}
