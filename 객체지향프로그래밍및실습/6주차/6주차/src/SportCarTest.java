
public class SportCarTest {

	public static void main(String[] args) {
		
		SportCar obj = new SportCar();
		obj.speed = 10;
		obj.setSpeed(60);
		obj.setTurbo(true);
		
		System.out.println(obj.speed);
		System.out.println(obj.turbo);
		
	}

}
