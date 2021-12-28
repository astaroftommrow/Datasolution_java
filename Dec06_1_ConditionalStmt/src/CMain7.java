import java.util.Scanner;

// BMI�˻� ���α׷�

// �̸�, Ű(cm), ������(kg) �Է�
// BMI(ü��������) : ������ / (Ű * Ű) -> Ű : m����
//	18.5�̸��̸� ��ü��
//	18.5�̻��̸� ����
//	25�̻��̸� ��ü��
//	30�̻��̸� �浵��
//	35�̻��̸� ��������
//	40�̻��̸� ����

// �̸�, Ű, ������, ��������� ���
public class CMain7 {
	// �̸��� �Է��ϴ� �Լ�
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = k.next();
		return name;
	}
	// Ű�� �Է��ϴ� �Լ�
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű(cm) : ");
		double height = k.nextDouble();
		return height / 100;
	}
	// �����Ը� �Է��ϴ� �Լ�
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("������(kg) : ");
		double weight = k.nextDouble();
		return weight;
	}
	// BMI�� ������ִ� �Լ�
	public static double calcBMI(double weight, double height) {
		double bmi = weight / (height * height);
		return bmi;
	}
	// ����� �������ִ� �Լ�
	// RAM�� �� ������ -> ������ ���̸� �ȴ�!
	// HDD�� �� ������ -> �ڵ带 ���̸� �ȴ�!
	public static String judgeBMI(double bmi) {
		String result = "��ü��";
		if (bmi >= 40) {
			result = "����";
		} else if (bmi >= 35) {
			result = "��������";
		} else if (bmi >= 30) {
			result = "�浵��";
		} else if (bmi >= 25) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		}
		return result;
	}
	// ����� ������ִ� �Լ�
	public static void printResult(String n, double h, double w, double b, String r) {
		System.out.println("----------------------------");
		System.out.printf("%s���� Ű�� %.1fcm, �����Դ� %.1fkg�̰�..\n", n, h * 100, w);
		System.out.printf("ü��������(BMI) : %.1f�Դϴ�\n", b);
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------------");
		System.out.printf("%s���� %s�Դϴ�!\n", n, r);
		System.out.println("----------------------------");
	}
	
	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double bmi = calcBMI(weight, height);
		String result = judgeBMI(bmi);
		printResult(name, height, weight, bmi, result);
		
	}
}














