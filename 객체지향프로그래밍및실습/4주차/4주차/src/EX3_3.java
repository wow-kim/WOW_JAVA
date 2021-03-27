
public class EX3_3 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		for (a=1; a<100 ; a++) {
			for (b=1; b<100; b++) {
				for (c=2; c<100; c++) {
					if (a*a + b*b == c*c)
						System.out.println(a+" "+ b+" "+c);
				}
			}
		}
		
		
	}

}
