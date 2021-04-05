class MMath{
	int id = 0;
	static int count = 0;
	public static int abs(int x) { return x>0?x:x;}
	public static int power(int base, int exponent) {
		int result = 1;
		for (int i=1;i<=exponent;i++)
			result *= base;
		return result;
	}
	
}

public class MathTest {

	public static void main(String[] args) {
		System.out.println("10ÀÇ 3½ÂÀº"+MMath.power(10, 3));
		MMath mm = new MMath();
		System.out.println(mm.id);
	}

}
