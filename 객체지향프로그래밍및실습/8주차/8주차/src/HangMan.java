import java.util.*;

public class HangMan {

	public static void main(String[] args) {

		String answer = "count";
		String now = "_____";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("현재의 상태" + now);
			System.out.print("글자를 추측하시오: ");
			String c = sc.nextLine();
			int index = answer.indexOf(c);
			if (index == -1) {
				continue;
			} else if (index == answer.length()-1) {
				now = now.substring(0, index) + c;
			} else {
				now = now.substring(0, index) + c + now.substring(index+1); 
			}
		} while(answer.equals(now) == false);
		
		System.out.println("성공!, 정답 : "+ now);
		sc.close();
	}

}
