
// ���� for�� >> for���ȿ� for�� >> (��ø for��)

public class RMain2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.printf("i�� : %d------\n", i);
			for (int j = 1; j < 6; j++) {
				System.out.printf("j�� : %d\n", j);
			}
		}
		System.out.println("------------------");
		// ������
		// 2 x 1 = 2
		// 2 x 2 = 4
//		for (int dan = 2; dan <= 9; dan++) {
//			System.out.printf("<<< %d�� >>>\n", dan);
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//			}
//		}
		System.out.println("<2��>\t\t<3��>...");
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %d\t", dan, i, dan * i);
			}
			System.out.println();
		}
		System.out.println("--------");
		// ����� -> ���� ��������..!
		
		// ��
		// ����
		// ������
		// ��������
		// ����������
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		// ��
		//	 ��
		//	   ��
		//		 ��
		//		   ��
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == i) {
					System.out.print("��");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// if�� �Ⱦ��� �ϴ� ��� !
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");		// j�� i���� ���� ������
											// ����� �޲���
			}
			System.out.println("��");		// �� �̿��� ������ "��"�� �޲���
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "��" : " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		// ����������
		// ��������
		// ������
		// ����
		// ��
		
		for (int i = 4; i >= 0 ; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 0) ? "��" : "��");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print((i % 2 == 0) ? "��" : "��");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		// ��
		// ������
		// ����������
		// ��������������
		// ������������������
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <= (i * 2) ; j++) {
				System.out.print((i % 2 == 0) ? "��" : "��");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (i * 2) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i * 2) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}













