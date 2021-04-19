class Base{
	public Base() {
		System.out.println("Base() 持失切");
	}
	public Base(String arg) {
		System.out.println("Base() 持失切 " + arg);
	}
}

class Derived extends Base{
	public Derived() {
		// super("hi");	
		System.out.println("Derived() 持失切");
	}
}


public class Test {

	public static void main(String[] args) {
		
		Derived r = new Derived();
	}

}
