import java.util.Scanner;

public class YMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// ���� ����� ����� ?
		System.out.print("������ ��� : ");
		String feelings = keyboard.next();

		// ���� ����� ������ ?
		System.out.print("������ ����� ���� : ");
		int conditionScore = keyboard.nextInt();
		
		// ���߱��� �� �� ����Ÿ�� �Դ��� ?
		System.out.print("���߱��� �� �� ���� ������ ? : ");
		int transfer = keyboard.nextInt();
		
		// �㿡 ǫ �䳪�� ? (�������� true / �������� false)
		System.out.print("���� ���� : "); 
		boolean deepSleep = keyboard.nextBoolean();
		// �� �ð� �䳪�� ? ( ex: 6.0�ð� )
		System.out.print("���� �ð� : ");
		double sleepingHour = keyboard.nextDouble();
		System.out.println("---------");
		
		// Scanner�� �Է¹޾Ƽ� ��±���!
		System.out.printf("���� ��� : %s\n", feelings);
		System.out.printf("����� ���� : %d��/100��\n", conditionScore);
		System.out.printf("���߱��� ȯ�� Ƚ�� : %d��\n", transfer);
		System.out.printf("���� ���� : %b\n", deepSleep);
		System.out.printf("���� �ð� : %.1f�ð�\n", sleepingHour);
		
		
		System.out.println("---------");
		System.out.println("\\\0\0\0\0/\\");
		System.out.println("\0)\0\0(\0\')");
		System.out.println("(\0\0/\0\0)");
		System.out.println("\0\\(__)��");
		System.out.println("---------");
	}
}

