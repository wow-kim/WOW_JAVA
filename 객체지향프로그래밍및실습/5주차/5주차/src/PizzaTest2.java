class Pizza1{
	int radius;
	
	Pizza1(int r){
		radius = r;
	}
	
	Pizza1 whosLargest(Pizza1 p) {
		if (this.radius > p.radius)
			return this;
		else
			return p;
	}
}

public class PizzaTest2 {

	public static void main(String[] args) {
		Pizza1 obj1 = new Pizza1(14);
		Pizza1 obj2 = new Pizza1(18);
		
		Pizza1 large = obj1.whosLargest(obj2);
		System.out.println(large.radius + "인치 피자");
	}

}
