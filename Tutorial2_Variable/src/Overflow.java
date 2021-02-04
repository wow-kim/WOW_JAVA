
public class Overflow {
	
	final static int INT_MAX = 214783647;

	public static void main(String[] args) {
		int a = INT_MAX;
		System.out.println(a+1); 
		// 오버플로우 발생, 
		// 214783647 : Int형이 가질 수 있는 최대의 범위 -> 오버플로우가 발생 -> 순환구조를 가지고 있기 때문에 가장 작은 값으로 돌아감
	}

}
