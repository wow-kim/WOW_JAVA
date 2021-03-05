// 자바에서는 변수 초기화를 하지 않으면 사용할 수 없습니다
// 정수를 나타내는 타입만 해도 short, int, long으로 다양합니다.
// 정수 변수 안에 실수를 넣으면 정수 부분만 변수에 저장됩니다. -> 반올림에 이용할 수 있음. 0.5를 더한 다음 형변환(실수 -> 정수)
public class Main {

	public static void main(String[] args) {
		
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "kth";
		
		System.out.println(intType); // println : intType을 출력한뒤, 줄바꿈을 하여라
		System.out.println(doubleType);
		System.out.println(stringType);
	}

}
