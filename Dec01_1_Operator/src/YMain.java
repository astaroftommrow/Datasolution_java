import java.util.Scanner;

public class YMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 오늘 기분은 어떤가요 ?
		System.out.print("오늘의 기분 : ");
		String feelings = keyboard.next();

		// 오늘 컨디션 점수는 ?
		System.out.print("오늘의 컨디션 점수 : ");
		int conditionScore = keyboard.nextInt();
		
		// 대중교통 몇 번 갈아타고 왔는지 ?
		System.out.print("대중교통 몇 번 갈아 탔나요 ? : ");
		int transfer = keyboard.nextInt();
		
		// 밤에 푹 잤나요 ? (잘잤으면 true / 못잤으면 false)
		System.out.print("숙면 여부 : "); 
		boolean deepSleep = keyboard.nextBoolean();
		// 몇 시간 잤나요 ? ( ex: 6.0시간 )
		System.out.print("숙면 시간 : ");
		double sleepingHour = keyboard.nextDouble();
		System.out.println("---------");
		
		// Scanner로 입력받아서 출력까지!
		System.out.printf("오늘 기분 : %s\n", feelings);
		System.out.printf("컨디션 점수 : %d점/100점\n", conditionScore);
		System.out.printf("대중교통 환승 횟수 : %d번\n", transfer);
		System.out.printf("숙면 여부 : %b\n", deepSleep);
		System.out.printf("숙면 시간 : %.1f시간\n", sleepingHour);
		
		
		System.out.println("---------");
		System.out.println("\\\0\0\0\0/\\");
		System.out.println("\0)\0\0(\0\')");
		System.out.println("(\0\0/\0\0)");
		System.out.println("\0\\(__)ㅣ");
		System.out.println("---------");
	}
}

