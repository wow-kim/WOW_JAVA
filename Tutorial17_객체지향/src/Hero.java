
// 하나의 게임 캐릭터를 의미합니다.
// Hero 클래스를 상속받아 다양한 직업을 가질 수 있도록 해봅시다!
public class Hero {

	String name;
	
	// 초기화
	public Hero(String name) {
		this.name = name;
	}
	
	public void attack() {
		System.out.println("주먹 지르기");
	}
	
}
