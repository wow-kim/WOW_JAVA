import java.util.Scanner; // Scanner import

// 기본 입출력 : 사용자와의 상호작용
// 자바에서는 대표적으로 Scanner 클래스를 이용해 상호작용할수 있음
// Scanner sc = new Scanner(System.in); 으로 클래스 객체를 생성한 뒤에
// sc.netInt(); 와 같은 방법으로 int형을 입력 받을 수 있습니다.
// 입력 받은 자료는 어떠한 처리를 한 뒤에 다시 사용자에게 그 값을 반환할 수 있습니다.


// 자바에서는 Scanner 클래스(기본적인 입출력 방법)만 잘 활용해도 다양한 입출력 형태를 자유자재로 구사할 수 있습니다. -> next() 함수와 nextLine() 함수 적절히 사용

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner : 클래스의 형식을 가짐, 내부 함수가 존재합니다.
		System.out.print("정수를 입력하세요");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 " + i + "입니다.");
		sc.close(); // 입출력하는 변수를 완벽히 닫음으로써 프로그램이 정상적으로 끝날 수 있도록 합니다.
		
		
	}

}
