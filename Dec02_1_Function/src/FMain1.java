// �Լ� (Function)
//		�����ִ� ���(�۾�)���� ����
//		�ʿ��Ҷ����� �ҷ���(ȣ���ؼ�) ����� ���� O

// JDK (�ڹ� ����ŰƮ) > JRE (�ڹ� ����ȯ��)
// ���� �� JRE�� OS(�ü��)�� ���缭 > JVM (�ڹ� ����ӽ�)
//		-> WORA (Write Once Read AnyWhere) - Java�� ����!
//		OS���� ���α׷��� ������ �ʾƵ� �� ! 

public class FMain1 {

//	public static ����Ÿ�� �Լ���(�Ķ����, �Ķ����, ...) {
//		����
//		return
				
		// ����Ÿ�� : ��ȯ�� ���� �ڷ���
		//	�Լ� ������ ���� �ϼ��� �ǰ�, main�Լ��� ��ȯ�� ������� ���� �ڷ���
		//	return�̶�°� ����ؼ� ��ȯ�ҰŰ�, ����� �̵���!
				
		// �Լ��� : ���״�� �� �Լ��� �̸�
		//		1. ���ڷ� �����ϸ� -> ���� !
		//		2. Ư������, ���� -> ���� !
		//		3. �ڹٹ���(�����) -> ���� !
		//			_�� �����ؼ� ������ ���� ����� �־��� ~
		//		Java�� ��ȭ)
		//		4. �Լ����� ���� ���� ������� �� �� �ְ� !
		//		5. �ҹ��ڷ� ����
		//		6. �������� ���ؼ�
		//			��ü : abcd_efg_hijk
		//			��Ÿü : abcdEfgHijk
		//		7. �ѱ� X
		//	������ vs �Լ���
		//	(���)		(����)
				
		// �Ķ���� (����, parameter) : �Լ��� �����ϴµ� �ʿ��� ���
		// �ʿ��� ������ŭ �ϵ�, �ڷ����� ���� ����ؾ���!
//	}
	
	public static void printMyThink() {
		// ���� ������ ������ ���!
		System.out.println("���� �ƹ� ������ ����.");
		System.out.println("�ֳ��ϸ�");
		System.out.println("���� �ƹ� ������");
		System.out.println("���� �����̴�.");
	}
	
	// �ڱ�Ұ��ϴ� �Լ� (�̸�, �ڵ�����ȣ, ��°� ���)
	public static void introduce() {
		System.out.println("�����");
		System.out.println("010-6449-2117");
		System.out.println("��õ");
	}
	
	// ���� �� ���� ������, ��Ģ���� ����� ������ִ� �Լ�
	// ����ϴ� �Լ�
	// ����̶�� �۾��� �Ϸ���, ���ڰ� �ʿ�
	// �Ķ����(parameter) : �Լ��� �����ϴµ� �ʿ��� ���
	public static void calculate(int x, int y) {
		int plus = x + y;
		int minus = x - y;
		int multiply = x * y;
		double divide = x / (double) y;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		
	}
	
	// ���� �� JVM�� main�� �ڵ����� ȣ��!
	// �츮�� �ڵ��ϼ��ؼ� ����� �� main�� ����� �Լ��� ����!
	public static void main(String[] args) {
		printMyThink();
		printMyThink();
		System.out.println("------------");
		introduce(); // �Լ� ȣ��
		System.out.println("------------");
		calculate(10, 20);
		calculate(8, 2);
	}

}











