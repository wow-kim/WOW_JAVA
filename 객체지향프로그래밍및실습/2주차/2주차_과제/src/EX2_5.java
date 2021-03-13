public class EX2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4080;
		int y;
		int z;
		int a;
		int b;
		int remainder;
		
		String y_hex = "";
		String z_hex = "";
		String a_hex = "";
		String b_hex = "";
		
		y = x << 8;
		z = x >> 8;
		a = x & 0xf0ff;
		b = x ^ 0xf0ff;
		
		while (y > 0) {
			remainder = y % 16;
			
			if(remainder==10) { 	
	          	y_hex = "A"+y_hex;	 //10-> A
	          }else if(remainder==11) {
	        	y_hex = "B"+y_hex;	 //11-> B
	          } else if(remainder==12) {
	        	y_hex = "C"+y_hex;	 //12-> C
	          } else if(remainder==13) {
	        	y_hex = "D"+y_hex; 	//13-> D
	          } else if(remainder==14) {
	        	y_hex = "E"+y_hex; 	//14-> E
	          } else if(remainder==15) {
	        	y_hex = "F"+y_hex; 	//15-> F
	          } else{
	        	y_hex = remainder + y_hex;
	          }
			y = y / 16 ;
		}		
		
		y_hex = "0x" +  y_hex;
			
		while (z > 0) {			
			remainder = z % 16;
			
			if(remainder==10) { 	
	          	z_hex = "A"+z_hex;	 //10-> A
	          }else if(remainder==11) {
	        	z_hex = "B"+z_hex;	 //11-> B
	          } else if(remainder==12) {
	        	z_hex = "C"+z_hex;	 //12-> C
	          } else if(remainder==13) {
	        	z_hex = "D"+z_hex; 	//13-> D
	          } else if(remainder==14) {
	        	z_hex = "E"+z_hex; 	//14-> E
	          } else if(remainder==15) {
	        	z_hex = "F"+z_hex; 	//15-> F
	          } else{
	        	z_hex = remainder + z_hex;
	          }
			z = z / 16 ;
		}
			
		z_hex = "0x" + z_hex;
		
		while (a > 0) {			
			remainder = a % 16;
			
			if(remainder==10) { 	
	          	a_hex = "A"+a_hex;	 //10-> A
	          }else if(remainder==11) {
	        	a_hex = "B"+a_hex;	 //11-> B
	          } else if(remainder==12) {
	        	a_hex = "C"+a_hex;	 //12-> C
	          } else if(remainder==13) {
	        	a_hex = "D"+a_hex; 	//13-> D
	          } else if(remainder==14) {
	        	a_hex = "E"+a_hex; 	//14-> E
	          } else if(remainder==15) {
	        	a_hex = "F"+a_hex; 	//15-> F
	          } else{
	        	a_hex = remainder + a_hex;
	          }
			a = a / 16 ;
		}
		
		a_hex = "0x" + a_hex;
	
		while (b > 0) {			
			remainder = b % 16;
			
			if(remainder==10) { 	
	          	b_hex = "A"+b_hex;	 //10-> A
	          }else if(remainder==11) {
	        	b_hex = "B"+b_hex;	 //11-> B
	          } else if(remainder==12) {
	        	b_hex = "C"+b_hex;	 //12-> C
	          } else if(remainder==13) {
	        	b_hex = "D"+b_hex; 	//13-> D
	          } else if(remainder==14) {
	        	b_hex = "E"+b_hex; 	//14-> E
	          } else if(remainder==15) {
	        	b_hex = "F"+b_hex; 	//15-> F
	          } else{
	        	b_hex = remainder + b_hex;
	          }
	        	
			b = b / 16 ;
		}
			
		b_hex = "0x" + b_hex;
		
		System.out.println("y="+y_hex);
		System.out.println("z="+z_hex);
		System.out.println("a="+a_hex);
		System.out.println("b="+b_hex);
		
	}

}