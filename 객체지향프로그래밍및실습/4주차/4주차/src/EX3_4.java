import java.util.*;

public class EX3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operator;
		double num1;
		double num2;
		double answer;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산을 입력하세요: ");
		operator = sc.next();
		
		System.out.print("숫자 2개를 입력하세요: ");
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
					System.out.println("0으로 나눌 수 없습니다.");
				else {
					answer = num1/num2;
					System.out.println(num1+operator+num2+ " = "+answer);
				}
				break;
		}
		sc.close();
	}
}
