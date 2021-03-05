// 인터페이스 : 추상클래스보다 더 추상적인! 추상이랑 비슷한 개념입니다
// 인터페이스는 다중 상속을 구현하게 해주는 고급 기술입니다.
// 추상 클래스는 추상 메소드 외에 멤버 변수나 일반 메소드를 가질 수 있지만
// 인터페이스에서는 반드시 사전에 정의된 추상 메소드와 상수만을 가질 수 있다는 특징이 있습니다. 정말 설계에 필요한 메소드만 사용 해야합니다.(추상화의 정도가 더 높습니다.  설계만 합니다)
// 팀 프로젝트의 동시 작업에 유리하고, 요구되는 설계의 기준이 더 높아서 더 체계적이라는 평을 받습니다.

// 인터페이스 상속에는 extends가 아닌 implements 사용 
// 추상 클래스는 다중 상속이 불가능, 인터페이스는 가능
public class Main implements Dog, Cat {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.one();
		main.two();

	}
	
	
	// 겹치는게 있으면 하나만 정의해줘도 됨
	@Override
	public void crying() {
		System.out.println("월!");
		
	}

	@Override
	public void one() {
		System.out.println("Hello");
		
	}

	@Override
	public void two() {
		System.out.println("World");
	}

}
