import java.util.Random;

// 오늘도 함수 ! 

public class FMain1 {
	// 랜덤한 정수를 '출력'하는 함수!
	public static void red() {
		Random r = new Random(); // 랜덤한 정수 뽑을 준비 ! 
		int i = r.nextInt();
		System.out.println(i);
	}
	
	// 랜덤한 정수를 '생성'하는 함수! (구하는) // 정수를 '생성'하는것이 목표!
	public static int blue() {
		Random r = new Random();
		int i = r.nextInt();
		return i;	// i에 있는 값을 최종 결과로 뱉어내기
					// 이 함수는 종료
	}
	
	// 정수를 하나 넣으면
	// 홀수인지 짝수인지 출력하는 함수
	public static void green(int a) {
		String result = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("%d는 %s!\n", a, result);
	}
	
	// 정수를 두 개 넣었을 때
	// 앞 숫자가 크면 '앞', 뒷 숫자가 크거나 같으면 '뒤' 생성
	public static String purple(int a, int b) {
		String result = (a > b) ? "앞" : "뒤";
		return result;
	}
	
	
	// JVM -> main함수를 자동으로 호출
	public static void main(String[] args) {
		red();
		// blue()를 통해 구해진 숫자를 i라는 그릇에 담아서 콘솔에 출력
		int i = blue();
		System.out.println(i);
		System.out.println("-----");
		// green()를 통해서 짝수인지 홀수인지 콘솔에 출력
		green(i);
		green(5);
		green(8);
		System.out.println("-----");
		String ss = purple(20, 30);
		System.out.println(ss);
		System.out.println("-----");
		
		// 점심메뉴 (2가지 중 하나)
		// 위의 함수를 이용해서...
		// 랜덤한 숫자를 2개 뽑아서
		// 먼저 뽑힌게 크면 '초밥', 아니면 '짜장면'
		
		int r1 = blue();
		int r2 = blue();
		System.out.println(r1);
		System.out.println(r2);
		String sss = purple(r1, r2);
		System.out.println(sss);
		String menu = (sss.equals("앞")) ? "초밥" : "짜장면";
			// 위의 식은 "앞"이라는 내용을 "초밥"으로 바꾸는 것!
		
		// String menu = (r1 > r2) ? "초밥" : "짜장면";
		System.out.println(menu);
	}
}












