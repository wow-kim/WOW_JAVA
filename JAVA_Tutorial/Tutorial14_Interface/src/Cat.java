
public interface Cat {
	
	// 추상클래스에서 public에서 정의되면 함수 내용을 넣어주어야 합니다.
	
	abstract void crying();
	public void two();
	// 인터페이스는 어떤 코드조차 넣어둘 수 없습니다. 오류 발생
	//abstract void show() {
	//	System.out.println("Hello");
	//}
}
