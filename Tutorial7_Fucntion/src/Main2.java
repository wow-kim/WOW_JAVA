
public class Main2 {
	
	// 문자열의 마지막 단어
	public static char function(String input) {
		return input.charAt( input.length() - 1); //charAt : 0번부터
	}
	
	// 둘중에 더 큰 변수 리턴
	public static int max(int a, int b){
		return (a > b) ? a : b; //삼항 연산자
	}
	
	// 함수를 이용한 함수, 셋 중 제일 큰 값 리턴
	public static int mmax(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}
	
	public static void main(java.lang.String[] args) {
		System.out.println("Hello World의 마지막 단어 : " + function("Hello World"));
		System.out.println("가장 큰 값 : " + mmax(345, 56, 77));
	}

}
