
public class EX3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int d;
		boolean flag;
		
		System.out.print("2부터 100사이 모든 소수 : ");
		for(n=2; n<101; n++) {
			if (n==2) {
				System.out.print(" " + n);
				continue;
			}
			
			flag = true;
			for (d=2; d<n; d++) {
				if (n % d == 0) {
					flag = false;
					break;
				}
			}				
			if (flag==true)
				System.out.print(" "+n);
		}
	}

}
