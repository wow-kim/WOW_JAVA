class Pizza{
	String toppings;
	static int count = 0;
	
	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;
	}
}

public class PizzaTest {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("Cheese");
		Pizza p2 = new Pizza("Pepperoni");
		System.out.println("���� ����=" + p1.toppings);
		System.out.println("���� ����=" + p2.toppings);
		System.out.println("���� ����=" + Pizza.count);
		System.out.println("���� ����=" + p1.count);
	}

}
