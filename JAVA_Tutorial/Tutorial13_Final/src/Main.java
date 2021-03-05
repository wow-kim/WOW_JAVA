// 자바에서 절대 변하지 않는 특정한 것을 정하고 싶을 때는 Final을 사용합니다.
// 이 키워드는 변수, 메소드, 클래스에 모두 사용할 수 있습니다.
// 변수에 사용하면 상수가 되며
// 메쏘드에 사용하면 재정의가 불가능한 메소드가 되며
// 클래스에 사용할 때는 상속이 불가능한 하나의 완전한 클래스가 되는 것입니다.

public class Main extends Parent{
	
	// 함수의 재정의, 부모 클래스에서 상속받은 함수를 오버라이딩
	// final하게 되면 재정의 불가
	//public void show() {
	//	System.out.println("Hello");
	//}
	
	public static void main(String[] args) {
		
		final int number = 10; // 상수!
		// number = 5; 오류 발생
		System.out.println(number);
		
		Main main = new Main();
		main.show();
		

	}

}
