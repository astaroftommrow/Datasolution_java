import java.util.Scanner;

public class FMain5 {
	
	// 게임을 하고 있는데... 엄마가 심부름 시켜요
	public static void makeErrand() {
		System.out.println("아들!");
		System.out.println("돈 줄테니까");
		System.out.println("슈퍼가서");
		System.out.println("라면이랑");
		System.out.println("참치 사고");
		System.out.println("남은돈 가져와");
	}
	
	// 엄마가 돈을 주셨다 ! (돈 = 입력)
	public static int takeMoney() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("엄마가 준 돈 : ");
		int money = keyboard.nextInt();
		// System.out.printf("엄마가 %d원을 주셨다!\n", money);
		return money;
		// 정수(int)에 대한 값을 main함수에 return,반환할거니까
		// return 타입을 int로 선택!
	}

	// 심부름 중에... (라면 : 3200, 참치 : 2170, 과자 : 1500)
	//	돈이 얼마나 남는지.. 생각을...
	public static void doErrand(int money) {
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		// 계산하는 함수
		//		계산이라는 작업을 하려면 '받아온 돈'이 필요
		//		그 돈을 파라미터로 가져올 것!
		System.out.printf("심부름 하면 %d원이 남네...\n", money - (ramen + tuna + snack));
	}
	
	// 계산하고, 잔돈을 엄마한테 주자..
	public static int calcultate(int money) {
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		
		int restMoney = money - (ramen + tuna + snack);
		return restMoney;
	}
	
	public static void main(String[] args) {
		makeErrand();
		System.out.println("------");
		
		int money = takeMoney();
		System.out.println(money);
		System.out.println("------");
		
		doErrand(money);
		System.out.println("------");
		
		int restMoney = calcultate(money);
		System.out.println(restMoney);
	}

	
	// 함수를 표현하는 4가지 방식!
	//	main에 소스를 최대한 짧게 구성하기 위해서
	//	기능들을 묶어서 함수라는걸로 사용!
	//	기능을 나눠서 효율적으로 사용!
}

