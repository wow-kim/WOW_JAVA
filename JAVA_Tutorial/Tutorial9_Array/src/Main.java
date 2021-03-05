import java.util.Scanner; 
// import 해주어야하는 이유 : scanner는 기본 컴파일 단계에서 사용되는 라이브러리가 아니기 때문, 외부에 있는 라이브러리를 프로그램 안으로 가져와야합니다.


// 배열, 100개의 원소가 들어갈 수 있는 int형 배열 : int[] array = new int[100]
// new : 어떠한 인스턴스를 만들 때 약속된 하나의 언어
// 배열의 index는 0부터 시작합니다!(n개의 원소라면 index는 n-1까지)

public class Main {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요! : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i = 0; i < number; i++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println("가장 큰 수 : " + result);
		scanner.close();
		
	}

}
