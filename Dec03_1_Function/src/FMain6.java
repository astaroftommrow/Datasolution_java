
// 재귀적 호출 (recursive call) 
//	함수 속에서 자기 자신(이 함수)을 또 호출 -> 반복

// 함수를 부른다 : 느린 작업

// 반복문 : ex) 'for'

public class FMain6 {
	
	// 등차수열
	// 정수를 하나 넣으면
	// 1 + 2 + 3 + 4 + ... + 그 숫자까지
	// 다 더한 값을 구해주는 함수
	
	// add(1) = 1
	// add(2) = 3 = add(1) + 2
	// add(3) = 6 = add(2) + 3 = add(1) + 2 + 3
	
	public static int add(int x) {
		int answer = (x == 1) ? 1 : (x + add(x - 1));
		return answer;
	}
	
	// 정수를 하나 넣으면 factorial값 구하는 함수
	// 1! = 1
	// 2! = 2	= 2 * 1
	// 3! = 6	= 3 * 2 * 1
	// 4! = 24	= 4 * 3 * 2 * 1
	
	public static int factorial(int x) {
		int answer = (x == 1) ? 1 : (x * factorial(x - 1));
		return answer;
	}
	
	// 피보나치 수열
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ....
	public static int fibo(int x) {
//		int answer = (x == 1 || x == 2) ? 1 : (fibo(x - 1) + fibo(x - 2));
		int answer = (x < 3) ? 1 : (fibo(x - 1) + fibo(x - 2));
		return answer;
	}
	
	public static void main(String[] args) {
//		int a = 함수(10);
//		System.out.println(a);	// -> 55
		
		int i = add(10);
		System.out.println(i);
		
		int i2 = factorial(6);
		System.out.println(i2);
		
		int i3 = fibo(10);
		System.out.println(i3); // 55 
	}
}











