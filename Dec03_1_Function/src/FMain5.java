import java.util.Random;

public class FMain5 {
	
	
	// B : �Լ��� / ����� �����̶� ���̰�, ���簰�� �۸�
	//				��Ÿü or ��ü
	// C : �Ķ���� / �Լ��� ȣ���ϴ� ��(Main �Լ�)���� �ش� �Լ������� �����͸� ���� ��
	//				( �ڷ��� ������, �ڷ��� ������, ... )
	// A : ����Ÿ�� / �ش� �Լ����� �۾��� ����� ȣ���� ��(Main �Լ�)���� ���� �� 
	// public static A B ( C ) {
	//		����
	//		return 
	// }
	
	// ���� ����ϴ� �Լ�
//	public static void printKkk() {
//		System.out.println("��");
//	}
	
	// ���� ������ ���ϴ� �Լ�
	public static String getWeather() {
		String weather = "����";
		return weather;
	}
	
	// 1. ������ ������ �ϳ� ���ϴ� �Լ�
	public static int getNum() {
		Random r = new Random();
		int a = r.nextInt();
		return a;
	}
	// 3. �� ������ ���� ���� ����ϴ� �Լ�
	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		String weather = getWeather();
		System.out.println(weather + "^^7");
		System.out.println("------");
		// 2. ������ ���� 2�� ���ؼ� ...
		int a = getNum();
		int b = getNum();
		System.out.println(a);
		System.out.println(b);
		// 4. ������ ���� 2�� ���� ���� ��� (3�� �̿��ؼ�)
		printSum(a, b);
	}
}
