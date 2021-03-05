// 클래스 : 객체 지향 프로그래밍에 있어서 가장 기본이 되는 것입니다.
// 현실 세계의 특정한 물건을 지칭할 수 있습니다.
// 가장 대표적으로 사용되는 것이 Node 클래스입니다. 이는 장소나 위치, 자료 구조에서의 서브르리가 될 수 있습니다.
// 개발 프로젝트에서는 종종 Student 클래스와 같이 하나의 처리할 데이터 단위를 명시하는데 사용이 됩니다.
// (예) Car 클래스 -> 성질 : 속력, 색, 이름 등 -> new Car(); 이런 식으로 Car 객체를 생성할수 있습니다. 공장처럼!
// 어떠한 데이터를 변수로 만들어서 사용할 수 있도록 하는 것을 바로 "인스턴스화"라고 합니다. 이러한 변수를 "인스턴스"라고 합니다.
// 인스턴스 : 어떤 클래스에서 만들어진 실제로 사용할수 있는 단위

// 객체 : 실세계의 사물로써 표현 가능



public class Main {

	public static void main(String[] args) {
			
		// 만들어준 Node 클래스를 생성해보자!
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two);
		
		System.out.println("x :" + result.getX() + ", y :" + result.getY());
		
	}

}
