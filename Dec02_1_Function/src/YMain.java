import java.util.Random;
import java.util.Scanner;

public class YMain {
	// Ȧ¦���� �����!
	//		���� 10���� ����ִٰ�
	
	// 		���� 'Ȧ' �ϸ�
	
	public static void main(String[] args) {
//		Random r = new Random();
//		int i = r.nextInt(5) + 1;	// 0 ~ 4 -> 1 ~ 5 
//		System.out.println(i);
		
		// �Է� ���� �غ�
		Scanner keyboard = new Scanner(System.in);
		
		// �����ϰ� ������ ���� �غ�
		Random r = new Random();
		
		// ������ ���� �߿��� ������ ���� ���� �̱�
		int coin = r.nextInt(10) + 1;
//		System.out.println(coin);
		
		// ���������� Ȧ���� 'Ȧ', ¦���� '¦'
		String answer = (coin % 2 == 1) ? "Ȧ" : "¦";
		// System.out.println(answer);
		
		// �� ����� �ְ� �Է�(Ȧ or ¦)
		System.out.print("Ȧ or ¦ : ");
		String userAns = keyboard.next();
		// System.out.println(userAns);
		
		// ����� �������.. (��ǻ�Ͱ� ���� ����?�� �Է��� ������ ������)
		String result = (answer.equals(userAns)) ? "����" : "��";
		System.out.printf("���� : %d��\n", coin);
		System.out.println(result);
		
	}
}











