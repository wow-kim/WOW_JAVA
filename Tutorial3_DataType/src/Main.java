// 원시 자료형 : Boolean/Numeric
// (boolean)/(char)/(byte/short/int/long)/(float/double)
// 비원시 자료형 : String/Array/etc..

// 정수를 나타내는 자료형이 많은 이유는 각 자료형이 차지하는 메모리 공간의 크기가 다르기 때문입니다.
// double 형이라고 하더라고 과도하게 큰 수를 저장하면 잘못된 계산 결과가 나올 수 있습니다.
// 클래스이자 자료형인 String : 내부적으로 char의 배열로 되어 있습니다. 그렇다면 String의 최대 크기는 4기가바이트의 문자를 담을 수 있습니다.(몇억글자..?!)


public class Main {

	public static void main(String[] args) {
		
		double b = 0.5;
		int a = (int) (b + 0.5); // (Dint) : 형변환, 실수값을 반올림할 때 이용할 수 있습니다.
		System.out.println(a);
		
		double c = 10.3;
		double d = 9.6;
		double e = 10.1;
		
		System.out.println((c+d+e)/3);
	}

}
