import java.util.*;

public class EX3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operator;
		double num1;
		double num2;
		double answer;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		operator = sc.next();
		
		System.out.print("���� 2���� �Է��ϼ���: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		switch(operator){
			case "+":
				answer = num1+num2;
				System.out.println(num1+operator+num2+ " = "+answer);
				break;
			case "-":
				answer = num1-num2;
				System.out.println(num1+operator+num2+ " = "+answer);
				break;
			case "*":
				answer = num1*num2;
				System.out.println(num1+operator+num2+ " = "+answer);
				break;
			case "/":
				if (num2==0)
					System.out.println("0���� ���� �� �����ϴ�.");
				else {
					answer = num1/num2;
					System.out.println(num1+operator+num2+ " = "+answer);
				}
				break;
		}
		sc.close();
	}
}
