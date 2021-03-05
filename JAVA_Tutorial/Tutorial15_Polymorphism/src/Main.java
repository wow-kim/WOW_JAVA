import java.util.Scanner;

// 다형성은 기본적으로 다양한 형태의 성질을 가진다는 의미를 가지고 있습니다.
// 자바는 다형성을 그 특징으로 가지는 객체 지향 프로그래밍 언어이며, 자바에서는 이 다형성을 이용하여 객체를 사용할 때 사용하는 변수 형태를 바꾸어 여러 타입의 객체를 참조할 수 있습니다.
// 프로그램의 소스 코드를 유연하게 구성할 수 있습니다.
// 아주 중요!! : 부모 클래스 타입의 참조 변수로 하위 클래스의 객체를 참조할 수 있게 해줍니다.

public class Main {

	public static void main(String[] args) {
		
		// 다형성 : 자식클래스의 인스턴스를 부모클래스의 변수로 넣어줄 수 있습니다. 
		Fruit fruit1 = new Peach();
		fruit1.show();
		
		Fruit fruit2 = new Banana();
		fruit2.show();
		
		// 사용자가 선택할 수 있도록 하는 것이 다형성의 핵심!!!!
		// 이런식으로 많이 사용합니다. 지린다..!
		Scanner scanner = new Scanner(System.in);
		System.out.println("바나나 : 1, 복숭아 : 2");
		int input = scanner.nextInt();
		Fruit fruit; // 변수 정의
		if(input == 1)
		{
			fruit = new Banana();
			fruit.show();
		}
		else if(input == 2)
		{
			fruit = new Peach();
			fruit.show();
		}
		
		
	}

}
