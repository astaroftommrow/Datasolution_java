import java.util.Random;
import java.util.Scanner;

// ���� ���߱� ����
// 10��

public class FMain4 {
	
	// ���� 10�� ����
	public static int shakeCoin() {
		Random r = new Random();
		int coin = r.nextInt(10) + 1;
		return coin;
	}
	
	// ���� & �� �Է�
	public static int askUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("�� �� ? : ");
		int userAns = k.nextInt();
		return userAns;
	}
	
	// �� ���纸��
	public static String getResult(int coin, int userAns) {
		String result = (coin == userAns) ? "����" : "��";
		return result;
	}
	
	// ��� ���
	public static void printResult(int coin, int userAns, String result) {
		System.out.printf("��� �ִ� ������ %d�� !\n", coin);
		System.out.printf("����� ���� %d�� !\n", userAns);
		System.out.printf("�׷��� �����... [%s]�Դϴ� !!!!\n", result);
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(coin, userAns);
		printResult(coin, userAns, result);
		
	}
}
