import java.util.Random;
import java.util.Scanner;

public class YMain {
	// 홀짝게임 만들기!
	//		동전 10개를 쥐고있다가
	
	// 		내가 '홀' 하면
	
	public static void main(String[] args) {
//		Random r = new Random();
//		int i = r.nextInt(5) + 1;	// 0 ~ 4 -> 1 ~ 5 
//		System.out.println(i);
		
		// 입력 받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		// 랜덤하게 동전을 뽑을 준비
		Random r = new Random();
		
		// 지정한 갯수 중에서 랜덤한 동전 갯수 뽑기
		int coin = r.nextInt(10) + 1;
//		System.out.println(coin);
		
		// 동전갯수가 홀수면 '홀', 짝수면 '짝'
		String answer = (coin % 2 == 1) ? "홀" : "짝";
		// System.out.println(answer);
		
		// 답 맞출수 있게 입력(홀 or 짝)
		System.out.print("홀 or 짝 : ");
		String userAns = keyboard.next();
		// System.out.println(userAns);
		
		// 결과를 맞춰봐야.. (컴퓨터가 뽑은 정답?과 입력한 정답이 같은지)
		String result = (answer.equals(userAns)) ? "정답" : "땡";
		System.out.printf("동전 : %d개\n", coin);
		System.out.println(result);
		
	}
}











