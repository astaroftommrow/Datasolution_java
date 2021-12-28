
public class FMain4 {
	
	// 오버로딩 (Overloading) **** 고오오오오오오오오오오급 기술!
	//	함수명 같게, 파라미터를 다르게 하는 기술
	//	호출할때 어떤 값을 넣었냐에 따라 함수가 불러지게 하는 기술
	
	// 같은 자료형을 써도, 파라미터의 개수가 다르면 오버로딩 O
	// 파라미터의 개수가 같아도, 다른 자료형을 사용하면 오버로딩 O
	
	// 정수 2개를 넣으면 그 합을 출력해주는 함수
	public static void printSum(int jksdfhksdlfjskl, int b) {
		System.out.println(jksdfhksdlfjskl + b);
	}
	
	// 정수 3개를 넣으면 그 합을 출력해주는 함수
	public static void printSum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	// 실수 3개를 넣으면 그 합을 출력해주는 함수
	public static void printSum(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	// 정수를 넣으면 (1개) -> 윽! 출력
	public static void tired(int a) {
		System.out.println("윽!");
	}
	
	// 문자열을 넣으면 (1개) -> 악! 출력
	public static void tired(String s) {
		System.out.println("악!");
	}
	
	// 실수를 넣으면 (1개) -> 으아아아악! 출력
	public static void tired(double d) {
		System.out.println("으아아아악!");
	}
	// 아무것도 넣지 않으면 -> 졸리다.. 출력
	public static void tired() {
		System.out.println("졸리다...");
	}
	
	
	
	// 프로그램 실행 시 -> JVM -> main함수를 자동으로 호출
	public static void main(String[] args) {
		printSum(10, 5);
		printSum(1, 2, 3);
		printSum(1.1, 2.2, 3.3);
		System.out.println("------------------");
		tired(3);
		tired("ㅋzzzz");
		tired(3.1);
		tired();
		
		// 오버로딩..을 알아봤는데...
		// 사실 우리는 첫날부터 이 오버로딩을 사용하고 있었다 ! ㅇ0ㅇ!
		// System.out.println(); -> 오버로딩 대표적인 예 ! 
		
	}
}
