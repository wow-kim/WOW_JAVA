
public class Node {

	// 자바의 객체지향 프로그래밍은 보안을 중요시함, private는 외부에서 한번에 접근할 수 없는 형태입니다.
	private int x;
	private int y;
	
	// 따로 함수를 만들어서 외부에서 접근할 수 있게 해줍니다.
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x; // this : 자신이 가지고 있는 고유의 속성의 값을 바꿔줄 때 사용합니다.
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//생성자 : 인스턴스 객체를 하나를 만들어 줄때 자동으로 값을 초기화해주는 함수 -> 클래스와 같은 이름을 가져야 합니다!
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Node Other : 다른 노드를 매개변수로 가집니다. 반환형은 Node
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}
