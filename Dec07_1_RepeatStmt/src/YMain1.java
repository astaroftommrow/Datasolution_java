import java.util.Scanner;

// 평일 스케쥴 출력해주는 프로그램

// 시간을 입력받아서 -> 해당시간에 속하는 내용을 출력 
//		-> (입력한시간이) 시간 범위가 아니면 다시 입력
//	오전 9시 ~ 오후 6시 : 학원에서 공부
//	오전 9시, 오후 6시 : QR찍기
//	오후 1시 : 점심시간
//	오후 6시 넘어서 ~ 오후 8시 : 집에 가는 시간
//	오전 6시 ~ 오전 9시 전까지 : "기상 + 씻기 + 학원가기"
//	오후 8시 ~ 오전 6시 : "여가시간 + 취침" 

public class YMain1 {
	
	// 시간을 입력받는 함수
	public static int getHour() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("시간 입력(00 ~ 24) : ");
		int hour = keyboard.nextInt();
		return (hour >= 0 && hour <= 24) ? hour : getHour();
	}
	
	// 시간을 출력하는 함수
	public static void printHour(int jasdfklsajfk) {
		System.out.println("-------------");
		System.err.printf("%d시 ! \n", jasdfklsajfk);
		System.out.println("-------------");
	}
	
	public static void printResult(int hour) {
		if (hour >= 9 && hour <= 18) {
			System.err.println("학원에서 공부를 합니다.");
			if (hour == 9 || hour == 18) {
				System.err.println("QR!!!!!!!!!!!");
			} else if (hour >= 13 && hour < 14) {
				System.err.println("점심 빠아아아아아압!!!!");
			}
		} else if (hour > 18 && hour <= 20) {
			System.err.println("침대가 기다려요!!!! 얼른 가야해요!!");
		} else if (hour >= 6 && hour < 9) {
			System.err.println("일어나기 + 씻기 + 학원가기...");
		} else {
			System.err.println("여가 시간 + 취침 !");
		}
	}
	
	public static void main(String[] args) {
		int hour = getHour();
		printHour(hour);
		printResult(hour);
	}
}


