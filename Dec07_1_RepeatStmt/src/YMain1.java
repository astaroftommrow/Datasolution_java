import java.util.Scanner;

// ���� ������ ������ִ� ���α׷�

// �ð��� �Է¹޾Ƽ� -> �ش�ð��� ���ϴ� ������ ��� 
//		-> (�Է��ѽð���) �ð� ������ �ƴϸ� �ٽ� �Է�
//	���� 9�� ~ ���� 6�� : �п����� ����
//	���� 9��, ���� 6�� : QR���
//	���� 1�� : ���ɽð�
//	���� 6�� �Ѿ ~ ���� 8�� : ���� ���� �ð�
//	���� 6�� ~ ���� 9�� ������ : "��� + �ı� + �п�����"
//	���� 8�� ~ ���� 6�� : "�����ð� + ��ħ" 

public class YMain1 {
	
	// �ð��� �Է¹޴� �Լ�
	public static int getHour() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�ð� �Է�(00 ~ 24) : ");
		int hour = keyboard.nextInt();
		return (hour >= 0 && hour <= 24) ? hour : getHour();
	}
	
	// �ð��� ����ϴ� �Լ�
	public static void printHour(int jasdfklsajfk) {
		System.out.println("-------------");
		System.err.printf("%d�� ! \n", jasdfklsajfk);
		System.out.println("-------------");
	}
	
	public static void printResult(int hour) {
		if (hour >= 9 && hour <= 18) {
			System.err.println("�п����� ���θ� �մϴ�.");
			if (hour == 9 || hour == 18) {
				System.err.println("QR!!!!!!!!!!!");
			} else if (hour >= 13 && hour < 14) {
				System.err.println("���� ���ƾƾƾƾƾ�!!!!");
			}
		} else if (hour > 18 && hour <= 20) {
			System.err.println("ħ�밡 ��ٷ���!!!! �� �����ؿ�!!");
		} else if (hour >= 6 && hour < 9) {
			System.err.println("�Ͼ�� + �ı� + �п�����...");
		} else {
			System.err.println("���� �ð� + ��ħ !");
		}
	}
	
	public static void main(String[] args) {
		int hour = getHour();
		printHour(hour);
		printResult(hour);
	}
}


