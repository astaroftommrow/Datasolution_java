import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		// �̸��� �ϳ� �Է¹�����.. 
		// �� �̸��� 'ȫ�浿'�̶� ������ true / false
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = keyboard.next();
		boolean b = (name == "ȫ�浿");
		System.out.println(b);
		
		// ** String ������ ��
		// ����� �� ��ü�� ���ϱ� ���ؼ� .equals�� ���!
		boolean b2 = name.equals("ȫ�浿");
		System.out.println(b2);
		System.out.println("--------------------");
		
		// Shift ������ : ���߼���..!
		// shift : �ű��. �̵��ϴ�
		// (������ << ����) �� ����
		// 	<< : �տ� �ִ� ���� 2������ �ٲٰ�, �ڿ� �ִ� ����ŭ �������� �о��.
		//  ����ִ�(������) ĭ ���� 0���� ä���, 2������ �ٽ� 10������ �ٲ��.
		
		// ex) ī��!
		//		24�ð� :  1 << 0 = 1
		//		�������� : 1 << 1 = 2
		//		���� : 1 << 2 = 4
		//		������ : 1 << 3 = 8
		
		// A���� : 2		��������
		// B���� : 8		������
		// C���� : 13		������ + ���� + 24�ð�
		// D���� : 6		���� + ��������
		
		int c = (150 << 6);
		System.out.println(c); // ���۳༮..
		System.out.println("-------");
		
		// ������
		//		���� ������ : a++, a--, !a, ...
		//		���� ������ : a + b, a > 10 , ...
		//		���� ������ : 
		//					������ ������ ���� ������ �� ���
		//					if������ ��ü���������� ������ �����
		//					���ǽ� ? ������ �����Ҷ� �� �� : ���ǺҼ����� �� ��
		
		// ���� ���� �Է��ؼ� �޾ƺ���
		// ���̰� 20�� �̻��̸� '�ȳ��ϼ���'�� ����ϰ�,
		// ���̰� 20�� �̸��̸� 'NAGA!' �� ���
		// ** 3�� ������ **
		System.out.print("���� : ");
		int age = keyboard.nextInt();
		System.out.printf("���̴� %d��\n", age);
		String result = (age >= 20) ? "�ȳ��ϼ���" : "NAGA!";
		System.out.println(result);
		
		// ���̰� 50�� �̻��̸� '�����ϼ���'
		// ���̰� 50�� �̸��̸� '�ȳ��ϼ���' �� ���
		String result2 = (age >= 50) ? "�����ϼ���" : "�ȳ��ϼ���";
		System.out.println(result2);
		
		// ȫ�浿�� : 1������
		// ���̰� ¦�� : 1������
		// �̿ܿ� �������� : 2������
		String classNo = ((age % 2 == 0) || name.equals("ȫ�浿")) ? "1������" : "2������";
		System.out.println(classNo);
		
		// �̸��� �������̸鼭 10�� ���ϸ� 1������
		// �������� 2������
		String classNo2 = (name.equals("������") && (age <= 10)) ? "1������" : "2������";
		System.out.println(classNo2);
	}
}














