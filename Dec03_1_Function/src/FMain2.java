import java.util.Scanner;

// �񸸵� �˻� ���α׷� (�Լ�.ver)

// Ű, �����Դ� �Է¹��� ��
// ǥ��ü�� = (Ű - 100) * 0.9
// �񸸵� = (����ü�� / ǥ��ü��) * 100
// �񸸵��� 120�� ������ '��', �ƴϸ� '�Ⱥ�'

// �Լ� : main�Լ����� java�� �𸣴� ����� ���� �� �Ѱ��� �˾ƺ� �� �ְ� ... / + ����

// ���࿡.. ǥ��ü���� ���ϴ� ���� 0.8�� �ٲ����..
// �پ��� ����� �Լ� �ϳ��� �����ϰ�, ��������� �����ϰ� ���� ��... (��������)
// �� ���� �� ���� �� ã�� �� ������..?

// ����� �� �з��ؼ� �Լ��� ǥ���� �����..!
//		-> �������� �������� ������..!

// ctrl + shift + /(numpad) : �Լ� �ݱ�
// ctrl + shift + *(numpad) : �Լ� ����

public class FMain2 {
	
	// �񸸵� �˻� ����
	public static void startBimando() {
		System.out.println("�񸸵� �˻� ����!");
	}
	
	// Ű�� �Է¹޴� �Լ�
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = k.nextDouble();
		return height;
	}
	
	// �����Ը� �Է¹޴� �Լ�
	public static double getWeight() {
		// Scanner k = new Scanner(System.in);
		System.out.print("������ : ");
//		double weight = k.nextDouble();
//		return weight;
		return new Scanner(System.in).nextDouble();
		
	}
	// Ű�� ������ ǥ��ü���� �����ִ� �Լ�
	public static double calcStdWeight(double height) {
//		double stdWeight = (height - 100) * 0.9;
//		return stdWeight;
		return (height - 100) * 0.9;
	}
	
	// �޸𸮸� �Ƴ� ���ΰ� vs ������ ���� �� ���ΰ� ? 
	
	
	// ����ü�߰� ǥ��ü���� ������ �񸸵��� ����ؼ� ���� �����ִ� �Լ�
	public static double calcBimando(double weight, double stdWeight) {
		double bimando = (weight / stdWeight) * 100;
		return bimando;
	}
	// ������ �Ⱥ����� ������ ���ִ� �Լ�
	public static String judgeBimando(double bimando) {
		String result = (bimando > 120) ? "��" : "�Ⱥ�";
		return result;
	}
	// ����� ������ִ� �Լ�
	public static void printResult(double h, double w, double sw, double b, String r) {
		System.out.println("-------------------");
		System.out.printf("Ű : %.1fcm\n", h);
		System.out.printf("������ : %.1fkg\n", w);
		System.out.printf("ǥ��ü�� : %.1fkg\n", sw);
		System.out.printf("�񸸵� : %.1f\n", b);
		System.out.printf("����� [%s] �Դϴ�.\n", r);
		System.out.println("-------------------");
	}
	
	
	public static void main(String[] args) {
		startBimando();
		double height = getHeight();
		double weight = getWeight();
		double stdWeight = calcStdWeight(height);
		double bimando = calcBimando(weight, stdWeight);
		String result = judgeBimando(bimando);
		printResult(height, weight, stdWeight, bimando, result);
		
	}
}








