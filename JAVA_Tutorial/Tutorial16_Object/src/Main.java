
// 객체 클래스, Object 클래스
// 모든 객체의 조상으로써 쓰입니다.
// 사실 자바에서 모든 클래스는 암시적으로 Object 클래스를 상속 받고 있씁니다.
// 이러한 클래스가 존재하는 이유는 모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제공하기 위함입니다.

public class Main {

	public static void main(String[] args) {
		
		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		
		// 내부적으로 가지는 값이 같더라도 인스턴스 자체는 서로 다르다.
		System.out.println(archer1 == archer2);
		
		// equals를 이용해보자
		System.out.println(archer1.equals(archer2));
	}

}
