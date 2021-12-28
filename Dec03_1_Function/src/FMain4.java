import java.util.Random;
import java.util.Scanner;

// 동전 맞추기 게임
// 10개

public class FMain4 {
	
	// 동전 10개 섞기
	public static int shakeCoin() {
		Random r = new Random();
		int coin = r.nextInt(10) + 1;
		return coin;
	}
	
	// 질문 & 답 입력
	public static int askUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("몇 개 ? : ");
		int userAns = k.nextInt();
		return userAns;
	}
	
	// 답 맞춰보기
	public static String getResult(int coin, int userAns) {
		String result = (coin == userAns) ? "정답" : "땡";
		return result;
	}
	
	// 결과 출력
	public static void printResult(int coin, int userAns, String result) {
		System.out.printf("쥐고 있던 동전은 %d개 !\n", coin);
		System.out.printf("당신의 답은 %d개 !\n", userAns);
		System.out.printf("그래서 결과는... [%s]입니다 !!!!\n", result);
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(coin, userAns);
		printResult(coin, userAns, result);
		
	}
}
