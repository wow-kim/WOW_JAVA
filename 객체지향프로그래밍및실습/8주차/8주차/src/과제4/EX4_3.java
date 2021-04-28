package 과제4;

import java.util.*;

public class EX4_3 {
	
	static String solution;
	
	static boolean Check(String solution, StringBuffer answer, char trial) {
		for(int i=0; i< solution.length(); i++) {
			if(solution.charAt(i) == trial && answer.charAt(i) == '_' ){
				answer.setCharAt(i, trial);
				break;
			}
		}
		for(int i=0; i< solution.length(); i++) {
			if( answer.charAt(i) != solution.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"java", "count", "school", "book", "student", "programmer"};
		
		int index = (new Random()).nextInt(words.length);
		String solution = words[index];
		StringBuffer answer = new StringBuffer(solution.length());
		
		for(int i =0; i<solution.length(); i++)
			answer.append("_");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("현재의 상태: " + answer);
			System.out.print("글자를 추측하시오: ");
			char trial = sc.next().charAt(0);
			if (Check(solution, answer, trial))
				break;
			
		}
		sc.close();
		
		System.out.println("정답: " + answer);
		
	}

}
