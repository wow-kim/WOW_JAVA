import java.util.Arrays;

public class ArrayArgumentTest {

	public static double minArray(double[] list) {
		double min = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] < min)
				min = list[i];
		}
		return(min);
	}
	
	public static void addArray(double[] list, int len) {
		for(int i =0; i < list.length; i++) {
			list[i]++;
		}
		len++;
	}
	
	public static void main(String[] args) {
		double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
		
		double min;
		min = minArray(a);
		System.out.println("ÃÖ¼Ò°ª"+min);
		
		System.out.println(Arrays.toString(a) + " : " + a.length);
		addArray(a, a.length);
		System.out.println(Arrays.toString(a) + " : " + a.length);
		
	}

}
