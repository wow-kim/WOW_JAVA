class Plane{
	String manufacturer;
	String model;
	int passengers;
	static int planes = 0;
	
	public Plane() {
		this.manufacturer = "None";
		this.model = "None";
		this.passengers = 0;
		planes++;
	}
	public Plane(String manufacturer, String model, int passengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.passengers = passengers;
		planes++;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String a) {
		this.manufacturer = a;
	}
	
	public String getModel() {
		return this.model;
	}
	public void setModel(String b) {
		this.model = b;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	public void setPassengers(int c) {
		this.passengers = c;
	}
	
	static int getPlanes() {
		return planes;
	}
}

public class EX5_2 {
	
	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		Plane p3 = new Plane();
		
		p1.setManufacturer("¿¡¾î¹ö½º");
		p1.setModel("A380");
		p1.setPassengers(500);
		
		p2.setManufacturer("º¸À×");
		p2.setModel("B777");
		p2.setPassengers(400);
		
		p3.setManufacturer("º¸À×");
		p3.setModel("B747");
		p3.setPassengers(300);
		
		System.out.println("Á¦ÀÛ»ç: "+ p1.getManufacturer() + " ¸ðµ¨: "+p1.getModel() + " ÃÖ´ë½Â°´: " + p1.getPassengers() +"¸í");
		System.out.println("Á¦ÀÛ»ç: "+ p2.getManufacturer() + " ¸ðµ¨: "+p2.getModel() + " ÃÖ´ë½Â°´: " + p2.getPassengers() +"¸í");
		System.out.println("Á¦ÀÛ»ç: "+ p3.getManufacturer() + " ¸ðµ¨: "+p3.getModel() + " ÃÖ´ë½Â°´: " + p3.getPassengers() +"¸í");
		System.out.println("Ç×°ø±â ´ë¼ö = " + Plane.planes + "´ë");
	}

}
