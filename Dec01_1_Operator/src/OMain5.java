import java.util.Scanner;

public class OMain5 {
	// Ű, �����Ը� �Է� �޾Ƽ� -> �񸸵� �˻� ���α׷�
	
	// ǥ��ü�� = (Ű - 100) * 0.9
	// �񸸵� = (���� ü�� / ǥ�� ü��) * 100
	// �񸸵��� 120�� ������ ��, �ƴϸ� �Ⱥ�
	
	public static void main(String[] args) throws InterruptedException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = keyboard.nextDouble();
		System.out.print("������ : ");
		double weight = keyboard.nextDouble();
		
		double stdWeight = (height - 100) * 0.9;
		double bimando = (weight / stdWeight) * 100;

		String result = (bimando > 120) ? "��" : "�Ⱥ�";
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		System.out.printf("����� %s�Դϴ�\n", result);
		
		System.out.print("�ƹ��ų� �Է��ϼ��� : ");
		String bye = keyboard.next();
		System.out.println("���� ���� ��!");
		System.out.print("�ƹ��ų� �Է��ϼ���(��¥��!) : ");
		String realBye = keyboard.next();
		System.out.println("�ȳ�!!!!!!!!!!!!!!!");
		keyboard.close();
	}
}












