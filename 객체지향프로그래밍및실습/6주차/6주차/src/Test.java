class Base{
	public Base() {
		System.out.println("Base() ������");
	}
	public Base(String arg) {
		System.out.println("Base() ������ " + arg);
	}
}

class Derived extends Base{
	public Derived() {
		// super("hi");	
		System.out.println("Derived() ������");
	}
}


public class Test {

	public static void main(String[] args) {
		
		Derived r = new Derived();
	}

}
