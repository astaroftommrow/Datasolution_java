import java.util.Scanner;

public class CMain1 {
	// ���� ���� ������ �Է��ؼ� �޾ƿ���
	public static int getKorean() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kor = keyboard.nextInt();
		// �������� - ������ ���� ������!
		return (kor >= 0 && kor <= 100) ? kor : getKorean();
	}

	// ���ǹ� : �ۼ��� �ڵ带 ���ǿ� ���� �ڵ��� ���� �帧��
	// 			�ٸ��� �����ϵ��� �����ϴ� ����
	// if�� : ���ǽ��� ����� true, false�� ���๮�� ����

//	if (���� A) {
//		���� A�� ���������� (���϶�) �� �κ��� ����
//	} else if (���� B) {
//		���� A (X), ���� B (O)�϶� �� �κ��� ����
//	} else if (���� C) {
//		���� A/B (X), ���� C (O)�϶� �� �κ��� ����
//	} else {
//		�´� ������ �ϳ��� ������ �� �κ��� ����
//	}
	
	// ����������...
	// 60�� �̸��̸� '��'
	// 60�� �̻��̸� '��'
	// 70�� �̻��̸� '��'
	// 80�� �̻��̸� '��'
	// 90�� �̻��̸� '��' �� ���
	public static void main(String[] args) {
		int kor = getKorean();
//		if (kor >= 60) {
//			System.out.println("��");
//		} else if (kor >= 70) {
//			System.out.println("��");
//		} else if (kor >= 80) {
//			System.out.println("��");
//		} else if (kor >= 90) {
//			System.out.println("��");
//		} else {
//			System.out.println("��");
//		}
		
		if (kor >= 90) {
			System.out.println("��");
		} else if (kor >= 80) {
			System.out.println("��");
		} else if (kor >= 70) {
			System.out.println("��");
		} else if (kor >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		System.out.println("---------------");
		// ���� ������ 50���� �ȵǸ� ��, �ƴϸ� Ī��
		// ������ 50�� �̻�, 60�� �̸��̸� �ƽ��� �Ҹ� ���
		// ������ 30�� �̸��̸� �ѱ����̽ʴϱ�? ���
		
		// if���ȿ� if���� �� ����ϴ°��� ����!
		//		if - if���� if - else���� ����
		//			if - if : ���� �ٸ� ���ǹ����� �ؼ��� �Ǿ �����ϰ� ��	=>  ȿ����X
		//			if - else : �ϳ��� ������ �����Ǹ� ������ �κ��� �������� ���� => ȿ����O
		
		if (kor < 50) {
			System.out.println("XXXXXXX!");
			if (kor < 30) {
				System.out.println("�ѱ����̽ʴϱ�?");
			}
		} else {
			System.out.println("������������������!");
			if (kor < 60) {
				System.out.println("����ϼ��� !");
			}
		}
		
	}
}













