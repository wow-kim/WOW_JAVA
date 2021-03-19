import java.util.Arrays;;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] toppings = {"aa", "bb"};
		
		for(int i = 0; i < toppings.length; i++)
			System.out.print(toppings[i] + " ");
		
		System.out.println();
		
		System.out.println(toppings);
		System.out.println(Arrays.toString(toppings));
		
		System.out.println();
		
		int[][] iarr = {
				{10, 20, 30},
				{40, 50},
				{60, 70, 80}
		};
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr[i]);
			System.out.println(Arrays.toString(iarr[i]));
		}
		
	}

}
