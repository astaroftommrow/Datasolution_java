import java.util.Random;
import java.util.Scanner;

public class FMain3 {
	
	// Ȧ¦ (�Լ�.ver)

	// ������ ���� ���� ��������
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10) + 1;
//		return coin;
		return new Random().nextInt(10) + 1;
	}
	
	// ���� & �� �Է�
	public static String askUserAns() {
//		Scanner k = new Scanner(System.in);
		System.out.print("Ȧ or ¦ : ");
//		String userAns = k.next();
//		return userAns;
		return new Scanner(System.in).next();
	}
	
	// ���� ������ Ȧ���� 'Ȧ', ¦���� '¦'
	public static String getAnswer(int coin) {
//		String answer = (coin % 2 == 0) ? "¦" : "Ȧ";
//		return answer;
		return (coin % 2 == 0) ? "¦" : "Ȧ";
	}
	
	// ��� ����
	public static String getResult(String ua, String a) {
//		String result = (ua.equals(a)) ? "����" : "��";
//		return result;
		return (ua.equals(a)) ? "����" : "��";
	}
	
	// ���
	public static void printResult(int coin, String ua, String a, String r) {
		System.out.printf("������ %d�� !\n", coin);
		System.out.printf("���� �Է��� �� : %s !\n", ua);
		System.out.printf("��� : %s �̶� %s !\n", a, r);
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();
		String userAns = askUserAns();
		String answer = getAnswer(coin);
		String result = getResult(userAns, answer);
		printResult(coin, userAns, answer, result);
		
	}
}






