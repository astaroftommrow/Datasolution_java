
public class FMain6 {
	
	// 정수 두개를 넣으면, 그 중에 큰 숫자를 출력하는 함수 
	public static void printBigger(int a, int b) {
		int bigNum = (a > b) ? a : b;
		System.out.println(bigNum);
	}
	
	// 실수 두개를 넣으면, 그 중에 큰 숫자를 구해주는 함수
	public static double getBigger(double a, double b) {
		double bigNum = (a > b) ? a : b;
		bigNum *= 1000;
		return bigNum;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		printBigger(10, 99);
		double bigNum = getBigger(1.3, 3.3);
		Thread.sleep((int) bigNum);
	}
}












