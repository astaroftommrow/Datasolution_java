import java.util.Scanner;

// BMI검사 프로그램

// 이름, 키(cm), 몸무게(kg) 입력
// BMI(체질량지수) : 몸무게 / (키 * 키) -> 키 : m단위
//	18.5미만이면 저체중
//	18.5이상이면 정상
//	25이상이면 과체중
//	30이상이면 경도비만
//	35이상이면 중증도비만
//	40이상이면 고도비만

// 이름, 키, 몸무게, 결과값까지 출력
public class CMain7 {
	// 이름을 입력하는 함수
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = k.next();
		return name;
	}
	// 키를 입력하는 함수
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키(cm) : ");
		double height = k.nextDouble();
		return height / 100;
	}
	// 몸무게를 입력하는 함수
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		double weight = k.nextDouble();
		return weight;
	}
	// BMI를 계산해주는 함수
	public static double calcBMI(double weight, double height) {
		double bmi = weight / (height * height);
		return bmi;
	}
	// 결과를 판정해주는 함수
	// RAM을 덜 쓰려면 -> 변수를 줄이면 된다!
	// HDD를 덜 쓰려면 -> 코드를 줄이면 된다!
	public static String judgeBMI(double bmi) {
		String result = "저체중";
		if (bmi >= 40) {
			result = "고도비만";
		} else if (bmi >= 35) {
			result = "중증도비만";
		} else if (bmi >= 30) {
			result = "경도비만";
		} else if (bmi >= 25) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		}
		return result;
	}
	// 결과를 출력해주는 함수
	public static void printResult(String n, double h, double w, double b, String r) {
		System.out.println("----------------------------");
		System.out.printf("%s님의 키는 %.1fcm, 몸무게는 %.1fkg이고..\n", n, h * 100, w);
		System.out.printf("체질량지수(BMI) : %.1f입니다\n", b);
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------------");
		System.out.printf("%s님은 %s입니다!\n", n, r);
		System.out.println("----------------------------");
	}
	
	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double bmi = calcBMI(weight, height);
		String result = judgeBMI(bmi);
		printResult(name, height, weight, bmi, result);
		
	}
}














