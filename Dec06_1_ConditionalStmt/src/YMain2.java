import java.util.Scanner;

// ���� 2���� �Է¹޾Ƽ�(������ �Լ���)
// �� ���� 2���� �������� ¦���� ��� ����, �ƴϸ� ���� ���Է�

public class YMain2 {
	// x���� �Է¹��� �Լ�
	public static int getX() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("x : ");
		int x = keyboard.nextInt();
		return x;
	}
	// y���� �Է¹��� �Լ�
	public static int getY() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("y : ");
		int y = keyboard.nextInt();
		return y;
	}
	// ������ ����ؼ� ����� ������ �Լ�
	public static int getResult(int x, int y) {
		int sum = x + y;
		return (sum % 2 == 0) ? sum : getResult(x, y); 	// ���ϴ� ���� ������ ������
														// ���� ������ ���ư�
														// -> ó�� Ȧ���� �Է��� ���� ��� ����
		// return (sum % 2 == 0) ? sum : getResult(getX(), getY());
	}
	
	public static void main(String[] args) {
		int x = getX();
		int y = getY();
		int sum = getResult(x, y);
		System.out.println(sum);
	}
}










