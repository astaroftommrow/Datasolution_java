import java.util.Scanner;

// 논리연산자
//		결과가 boolean (true / false)
//		> (초과) , >= (이상) , == (같다) , != (다르다) , < (미만) , <= (이하) 

public class OMain3 {
	
	public static void main(String[] args) {
		// 놀이공원에서 놀이기구를 타도 되나 판정해주는 프로그램
		// 키(cm), 나이
		// 키는 XXXcm, 나이는 XX살
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		height /= 100; // height = height / 100;
		System.out.print("나이 : ");
		int age = keyboard.nextInt();
		System.out.println("----------");
		System.out.printf("키는 %.1fcm, 나이는 %d살\n", height, age);
		
		// 나이가 10살이 넘는 사람만 탈 수있음
		boolean ride = (age > 10);
		System.out.printf("ride 탑승 가능 ? : %b\n", ride);
		
		// 나이가 5살 미만만 탈 수 있음!
		boolean ride2 = (age < 5);
		System.out.printf("ride2 탑승 가능 ? : %b\n", ride2);
		
		// 나이 20살만 탈 수 있음!
		boolean ride3 = (age == 20);
		System.out.printf("ride3 탑승 가능 ? : %b\n", ride3);
		
		// 나이가 1살만 아니면 탈 수 있음!
		boolean ride4 = (age != 1);
		System.out.printf("ride4 탑승 가능 ? : %b\n", ride4);
		
		// 나이가 홀수인 사람만 탈 수 있음! // 약간의 수학적 사고 필요하다~
		boolean ride5 = (age % 2 == 1);	// -> 홀수를 나타냄
		System.out.printf("ride5 탑승 가능 ? : %b\n", ride5);
		System.out.println("-----------------------------");
		// 고오오오오오오오오오급 내용! **
		//		~고 (and) 	: &&
		//					: 확률 낮은것을 앞으로 배치
		//		~거나 (or) 	: ||	(shift + \)
		//		XOR 		: ^		(eXclusive OR) => 두 입력이 서로 다를때 '1' 결과값을 출력 
		//		NOT			: !		=> 결과를 뒤집는 것
		
		//	A && B : A도 만족, B도 만족 => 최종 OK!
		//			: 확률 낮은 조건을 앞으로 배치를..
		//	A || B : A가 만족하거나, B가 만족하거나, 둘 다 만족하거나 => 최종 OK!
		//			: 확률 높은 조건을 앞으로 배치
		
		
		// 나이가 3살이 넘고, 키가 2m 넘어야 탈수 있음!

		// 나이가 3살이 넘어야		키가 2m가 넘어야
		//			95%					5%		=> 95%이상의 확률로 2번 검사해야..
		// 키가 2m가 넘어야			나이가 3살이 넘어야
		//			5%					95%		=> 95%의 확률로 1번만...
		
		
		// boolean ride6 = (age > 3 && height > 200);
		boolean ride6 = (height > 2 && age > 3);
		
		System.out.printf("ride6 탑승 가능 ? : %b\n", ride6);
		
		// 키가 1.9m넘거나, 나이가 50살 미만이면 탈 수 있음
		// boolean ride7 = (height > 190 || age < 50);
		boolean ride7 = (age < 50 || height > 1.9);
		
		System.out.printf("ride7 탑승 가능 ? : %b\n", ride7);
		
		// 10 < 나이 < 40이면 탈 수 있음
		boolean ride8 = (age > 10 && age < 40);
		System.out.printf("ride8 탑승 가능 ? : %b\n", ride8);
		
		// 나이가 10살 이상이던지, 키가 1.5m이상이던지 하나만
		boolean ride9 = (age >= 10) ^ (height >= 1.5);
		System.out.printf("ride9 탑승 가능 ? : %b\n", ride9);
		
		// ride9를 탈 수 있는 사람은 못타고,
		// ride9를 탈 수 없는 사람만 탈 수 있음
		boolean ride10 = !ride9;
		System.out.printf("ride10 탑승 가능 ? : %b\n", ride10);
		
		// 불 대수
		// 0 (거짓), 1 (참)
	}
}