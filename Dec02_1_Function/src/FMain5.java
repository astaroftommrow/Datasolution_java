import java.util.Scanner;

public class FMain5 {
	
	// ������ �ϰ� �ִµ�... ������ �ɺθ� ���ѿ�
	public static void makeErrand() {
		System.out.println("�Ƶ�!");
		System.out.println("�� ���״ϱ�");
		System.out.println("���۰���");
		System.out.println("����̶�");
		System.out.println("��ġ ���");
		System.out.println("������ ������");
	}
	
	// ������ ���� �̴ּ� ! (�� = �Է�)
	public static int takeMoney() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("������ �� �� : ");
		int money = keyboard.nextInt();
		// System.out.printf("������ %d���� �̴ּ�!\n", money);
		return money;
		// ����(int)�� ���� ���� main�Լ��� return,��ȯ�ҰŴϱ�
		// return Ÿ���� int�� ����!
	}

	// �ɺθ� �߿�... (��� : 3200, ��ġ : 2170, ���� : 1500)
	//	���� �󸶳� ������.. ������...
	public static void doErrand(int money) {
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		// ����ϴ� �Լ�
		//		����̶�� �۾��� �Ϸ��� '�޾ƿ� ��'�� �ʿ�
		//		�� ���� �Ķ���ͷ� ������ ��!
		System.out.printf("�ɺθ� �ϸ� %d���� ����...\n", money - (ramen + tuna + snack));
	}
	
	// ����ϰ�, �ܵ��� �������� ����..
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

	
	// �Լ��� ǥ���ϴ� 4���� ���!
	//	main�� �ҽ��� �ִ��� ª�� �����ϱ� ���ؼ�
	//	��ɵ��� ��� �Լ���°ɷ� ���!
	//	����� ������ ȿ�������� ���!
}

