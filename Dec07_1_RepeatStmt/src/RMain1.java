import java.util.Random;

// 여태까지 했던 것 - 문과적 요소 ..!
// 반복문 - 이과적 요소..! -> 어려워요!

public class RMain1 {

	// 1. 어떤 작업을 53번 반복(횟수)
//	for (변수초기화; 조건식; 값의 증감) { // (1. 변수초기화 맞고) (2. 조건식이 맞으면(참)) (4. 값의 증감) (5. 다시 조건 비교) (7. 값의 증감) (8. 다시 조건 비교) (10. 조건비교후 안맞으면(거짓)) 
//		내용								// (3. 내용 출력) (6. 내용 출력) (9. 내용 출력) (11. 반복문 종료)
//	}
	// 2. 작업 - 점심시간까지 반복(기한)

	public static void main(String[] args) {
		// ㅋ를 3번 출력하고 싶음
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ㅋ\n", i);
		}
		System.out.println("------------");

		// 1, 3, 5, ... , 21 까지 출력
		for (int i = 1; i <= 21; i+=2) {
			System.out.print(i + " ");
			System.out.println();
		}
		
		System.out.println("---------------");
		
		// 5부터 1까지 순서대로 내림차순 출력
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("--------------");
		// 반복문이 5번 도는동안에 1 ~ 10사이의 숫자를 랜덤하게 뽑고 싶을때 ?
		Random r = new Random();
		int x = r.nextInt(10) + 1;
		for (int i = 0; i < 5; i++) {
			System.out.println(x);	// 같은 반복을 5번!
		}
		System.out.println("--------------");

		// 반복문 속에서 변수만드는 건 별로!
		// 반복문이 한 번 돌때마다 변수를 생성함
		for (int i = 0; i < 5; i++) {
			int x2 = r.nextInt(10) + 1;	// 다른 반복을 5번!
			System.out.println(x2);
		}
		
		System.out.println("--------------");
		// 반복문 안에서 변수를 새로 만드는것은 자제하는 게 좋음!
		// 반복문 밖에서 변수 하나 만들어서 갖다 쓰는게 조금 더 효율적!
		int x3 = 0;
		for (int i = 0; i < 5; i++) {
			x3 = r.nextInt(10) + 1 ;	// 변수의 값만 '변경' (O) / 변수를 '생성' (X)
			System.out.println(x3);
		}
		System.out.println("--------------");
		// 1 + 2 + 3 + ... + 10
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("--------------");
		// 팩토리얼!
		// 7! = ? -> 7 * 6 * 5 * 4 * 3 * 2 * 1
		int mul = 1;
		for (int i = 1; i <= 7; i++) {
			mul *= i;
		}
		System.out.println(mul);
		System.out.println("--------------");
		// 1 ~ 50까지 수 중에
		// 3의 배수거나 5의 배수를 다 더한 값
		int sum2 = 0;
		for (int i = 1; i <= 50; i++) {
//			if (i % 3 == 0) {
//				sum2 += i;
//			} else if (i % 5 == 0) {
//				sum2 += i;
//			}
			if (i % 3 == 0 || i % 5 == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
	}
}
