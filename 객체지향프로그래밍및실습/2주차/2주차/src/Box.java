import java.util.*;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w;
		double h;
		double area;
		double perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형의 가로 : ");
		w = input.nextInt();
		System.out.print("사각형의 세로 : ");
		h = input.nextInt();
		area = w*h;
		perimeter = 2.0*(w+h);
		
		System.out.println("사각형의 널이는 : " + area);
		System.out.print("사각형의 둘레는 : " + perimeter);
		
		input.close();
		
	}

}
