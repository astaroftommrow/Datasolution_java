
public class FMain4 {
	
	// �����ε� (Overloading) **** ����������������������� ���!
	//	�Լ��� ����, �Ķ���͸� �ٸ��� �ϴ� ���
	//	ȣ���Ҷ� � ���� �־��Ŀ� ���� �Լ��� �ҷ����� �ϴ� ���
	
	// ���� �ڷ����� �ᵵ, �Ķ������ ������ �ٸ��� �����ε� O
	// �Ķ������ ������ ���Ƶ�, �ٸ� �ڷ����� ����ϸ� �����ε� O
	
	// ���� 2���� ������ �� ���� ������ִ� �Լ�
	public static void printSum(int jksdfhksdlfjskl, int b) {
		System.out.println(jksdfhksdlfjskl + b);
	}
	
	// ���� 3���� ������ �� ���� ������ִ� �Լ�
	public static void printSum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	// �Ǽ� 3���� ������ �� ���� ������ִ� �Լ�
	public static void printSum(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	// ������ ������ (1��) -> ��! ���
	public static void tired(int a) {
		System.out.println("��!");
	}
	
	// ���ڿ��� ������ (1��) -> ��! ���
	public static void tired(String s) {
		System.out.println("��!");
	}
	
	// �Ǽ��� ������ (1��) -> ���ƾƾƾ�! ���
	public static void tired(double d) {
		System.out.println("���ƾƾƾ�!");
	}
	// �ƹ��͵� ���� ������ -> ������.. ���
	public static void tired() {
		System.out.println("������...");
	}
	
	
	
	// ���α׷� ���� �� -> JVM -> main�Լ��� �ڵ����� ȣ��
	public static void main(String[] args) {
		printSum(10, 5);
		printSum(1, 2, 3);
		printSum(1.1, 2.2, 3.3);
		System.out.println("------------------");
		tired(3);
		tired("��zzzz");
		tired(3.1);
		tired();
		
		// �����ε�..�� �˾ƺôµ�...
		// ��� �츮�� ù������ �� �����ε��� ����ϰ� �־��� ! ��0��!
		// System.out.println(); -> �����ε� ��ǥ���� �� ! 
		
	}
}
