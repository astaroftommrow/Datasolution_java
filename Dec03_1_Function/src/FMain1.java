import java.util.Random;

// ���õ� �Լ� ! 

public class FMain1 {
	// ������ ������ '���'�ϴ� �Լ�!
	public static void red() {
		Random r = new Random(); // ������ ���� ���� �غ� ! 
		int i = r.nextInt();
		System.out.println(i);
	}
	
	// ������ ������ '����'�ϴ� �Լ�! (���ϴ�) // ������ '����'�ϴ°��� ��ǥ!
	public static int blue() {
		Random r = new Random();
		int i = r.nextInt();
		return i;	// i�� �ִ� ���� ���� ����� ����
					// �� �Լ��� ����
	}
	
	// ������ �ϳ� ������
	// Ȧ������ ¦������ ����ϴ� �Լ�
	public static void green(int a) {
		String result = (a % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.printf("%d�� %s!\n", a, result);
	}
	
	// ������ �� �� �־��� ��
	// �� ���ڰ� ũ�� '��', �� ���ڰ� ũ�ų� ������ '��' ����
	public static String purple(int a, int b) {
		String result = (a > b) ? "��" : "��";
		return result;
	}
	
	
	// JVM -> main�Լ��� �ڵ����� ȣ��
	public static void main(String[] args) {
		red();
		// blue()�� ���� ������ ���ڸ� i��� �׸��� ��Ƽ� �ֿܼ� ���
		int i = blue();
		System.out.println(i);
		System.out.println("-----");
		// green()�� ���ؼ� ¦������ Ȧ������ �ֿܼ� ���
		green(i);
		green(5);
		green(8);
		System.out.println("-----");
		String ss = purple(20, 30);
		System.out.println(ss);
		System.out.println("-----");
		
		// ���ɸ޴� (2���� �� �ϳ�)
		// ���� �Լ��� �̿��ؼ�...
		// ������ ���ڸ� 2�� �̾Ƽ�
		// ���� ������ ũ�� '�ʹ�', �ƴϸ� '¥���'
		
		int r1 = blue();
		int r2 = blue();
		System.out.println(r1);
		System.out.println(r2);
		String sss = purple(r1, r2);
		System.out.println(sss);
		String menu = (sss.equals("��")) ? "�ʹ�" : "¥���";
			// ���� ���� "��"�̶�� ������ "�ʹ�"���� �ٲٴ� ��!
		
		// String menu = (r1 > r2) ? "�ʹ�" : "¥���";
		System.out.println(menu);
	}
}












