import java.util.Random;

// ���±��� �ߴ� �� - ������ ��� ..!
// �ݺ��� - �̰��� ���..! -> �������!

public class RMain1 {

	// 1. � �۾��� 53�� �ݺ�(Ƚ��)
//	for (�����ʱ�ȭ; ���ǽ�; ���� ����) { // (1. �����ʱ�ȭ �°�) (2. ���ǽ��� ������(��)) (4. ���� ����) (5. �ٽ� ���� ��) (7. ���� ����) (8. �ٽ� ���� ��) (10. ���Ǻ��� �ȸ�����(����)) 
//		����								// (3. ���� ���) (6. ���� ���) (9. ���� ���) (11. �ݺ��� ����)
//	}
	// 2. �۾� - ���ɽð����� �ݺ�(����)

	public static void main(String[] args) {
		// ���� 3�� ����ϰ� ����
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ��\n", i);
		}
		System.out.println("------------");

		// 1, 3, 5, ... , 21 ���� ���
		for (int i = 1; i <= 21; i+=2) {
			System.out.print(i + " ");
			System.out.println();
		}
		
		System.out.println("---------------");
		
		// 5���� 1���� ������� �������� ���
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("--------------");
		// �ݺ����� 5�� ���µ��ȿ� 1 ~ 10������ ���ڸ� �����ϰ� �̰� ������ ?
		Random r = new Random();
		int x = r.nextInt(10) + 1;
		for (int i = 0; i < 5; i++) {
			System.out.println(x);	// ���� �ݺ��� 5��!
		}
		System.out.println("--------------");

		// �ݺ��� �ӿ��� ��������� �� ����!
		// �ݺ����� �� �� �������� ������ ������
		for (int i = 0; i < 5; i++) {
			int x2 = r.nextInt(10) + 1;	// �ٸ� �ݺ��� 5��!
			System.out.println(x2);
		}
		
		System.out.println("--------------");
		// �ݺ��� �ȿ��� ������ ���� ����°��� �����ϴ� �� ����!
		// �ݺ��� �ۿ��� ���� �ϳ� ���� ���� ���°� ���� �� ȿ����!
		int x3 = 0;
		for (int i = 0; i < 5; i++) {
			x3 = r.nextInt(10) + 1 ;	// ������ ���� '����' (O) / ������ '����' (X)
			System.out.println(x3);
		}
		System.out.println("--------------");
		// 1 + 2 + 3 + ... + 10
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("--------------");
		// ���丮��!
		// 7! = ? -> 7 * 6 * 5 * 4 * 3 * 2 * 1
		int mul = 1;
		for (int i = 1; i <= 7; i++) {
			mul *= i;
		}
		System.out.println(mul);
		System.out.println("--------------");
		// 1 ~ 50���� �� �߿�
		// 3�� ����ų� 5�� ����� �� ���� ��
		int sum2 = 0;
		for (int i = 1; i <= 50; i++) {
//			if (i % 3 == 0) {
//				sum2 += i;
//			} else if (i % 5 == 0) {
//				sum2 += i;
//			}
			if (i % 3 == 0 || i % 5 == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
	}
}
