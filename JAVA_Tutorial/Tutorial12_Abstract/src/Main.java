// 객체지향 : 객체는 일반적으로 말하는 Object를 의미하며, 단순한 데이터가 아니고 그 데이터의 조작 방법에 대한 정보 또한 포함하고 있어 그것을 다루는 수법을 객체지향이라고 합니다.
// 추상, 인터페이스 -> 개발의 안정성과 확장 가능성
// 자바에서는 일종의 미완성의 클래스라고 할 수 있는 추상(Abstract) 클래스를 제공합니다.
// 직접적으로 객체 인스턴스를 생성할 수 없지만 새로운 클래스를 작성하는데 밑바탕이 되는 역할을 해줍니다.
// 미리 설계로서 틀을 갖추고 클래스를 작성할 수 있게 한다는 기능적인 측면에서 의미가 있습니다.
// 추상 클래스를 사용하려면 꼭 상속을 받아야 하며, 상속받은 모든 추상 메소드는 반드시 구현을 해주어야 합니다.

public class Main extends Player{

	public static void main(String[] args) {
		
		Main main = new Main(); 
		//static으로 선언된 하나의 메쏘드 안에서 다른 메쏘드를 불러오려면 불러와지는 그 메쏘드도 static으로 선언되어야 합니다.
		// main class를 불러옵니다.
		main.play("Hello Hi");
		main.pause();
		main.stop();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.crying();
		cat.crying();
		
	}
	
	// 추상클래스를 상속받은 클래스들은 추상클래스 안에서 추상적으로 구현이되었던 추상 메소드들을 구현을 해주어야합니다.
	// 반드시 구현해야 하는지 미리 알 수 있다는 점에서 설계적에서 의미가 있습니다.
	@Override
	void play(String songName) {
		System.out.println(songName + "곡을 재생합니다.");
	}

	@Override
	void pause() {
		System.out.println("일시정지");
	}
	
	@Override
	void stop() {
		System.out.println("정지합니다.");
	}

}
