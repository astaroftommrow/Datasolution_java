
public class FMain6 {
	
	// ���� �ΰ��� ������, �� �߿� ū ���ڸ� ����ϴ� �Լ� 
	public static void printBigger(int a, int b) {
		int bigNum = (a > b) ? a : b;
		System.out.println(bigNum);
	}
	
	// �Ǽ� �ΰ��� ������, �� �߿� ū ���ڸ� �����ִ� �Լ�
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












