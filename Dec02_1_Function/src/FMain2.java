
public class FMain2 {
	
	public static void test(int b) { // �Ķ���� ������ �ҷ����� �� ���� �Լ��ȿ� �ִ�
									// ������ ����Ǿ �׸��� b�� ���� stack�� ����
		int a = 123;
		System.out.println(b);		// 30
		System.out.println(a + b);	// 123 + 30 = 153
	}
	
	public static void main(String[] args) {
		int a = 10;		// �������� (local variable)
		int b = 20;		//  �Լ� ������ ���� ����
						//  �� �Լ� �������� ����� ����!
		int c = 30;
		test(c);
		System.out.println(b); // 20
		
		// ���� ���� �������� ���� �̸��� ������ �� �� �����~
		// ex) int a = 100; -> ����!
	}
}
