import java.util.Scanner;

public class YMain2 {
	
	// f1 : ������ �ϳ� �Է¹޾Ƽ�
	// �װ� ����� "��" ��� / 0�̸� "0" ��� / ������ "��" ���
	
	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		int i = k.nextInt();
		
		if (i > 0) {
			System.out.println("��");
		} else if (i == 0) {
			System.out.println("0");
		} else {
			System.out.println("��");
		}
	}
	
	// f2 : ������ �ϳ� �Է� �޾Ƽ�
	//	3�� ����� "3�� ���"
	//	�� �ƴϰ� 4�� ����� "4�� ���"
	//	�� �ƴϸ� "����!!!!"
	//	�� �������ִ�(����� ������ ����) �Լ�
	
	public static String f2() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		int i = k.nextInt();
		if (i % 3 == 0) {
			return "3�� ���";
		} else if (i % 4 == 0) {
			return "4�� ���";
		} else {
			return "����!!!!!!";
		}
	}
	
	public static String f3() {
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		
		if (x % 12 == 0) {	// if ((x % 3 == 0) && (x % 4 == 0)  
			return "3�� ��� + 4�� ���";
		} else if (x % 3 == 0) {
			return "3�� ���";
		} else if (x % 4 == 0) {
			return "4�� ���";
		}
		return "����!!!";
	}
	
	public static void main(String[] args) {
		f1();
		String s = f2();
		System.out.println(s);
	}
}













