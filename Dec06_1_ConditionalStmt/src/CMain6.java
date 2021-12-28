import java.util.Scanner;

public class CMain6 {
	// 1년 = 12달
	// 각 달마다 며칠인지 다릅니다
	// 몇월인지 입력을 받아서
	// 31일까지 있습니다. / 30일까지 있습니다 / 28일까지 있습니다
	// 14월 -> 없는 달입니다 출력
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = k.nextInt();
		int day = 0;
		
		switch (month) {
		case 1: case 3:	case 5:	case 7:	case 8:	case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 0;
			System.err.println("없는 달입니다.");
			break;
		}
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, day);
	
	
	}
}
