import java.util.Scanner;

public class CMain5 {
	
	// ���� : 
	//		DBA(���� �����ͺ��̽� ������)
	//			��������
	//			���/����
	//			��ɾ�� CRUD
	//			���� Ȱ��
	//		DBP(�����ͺ��̽� ���α׷���)
	//			��ɾ�� CRUD
	//			���� Ȱ��
	//		DBU(�����)
	//			���� Ȱ��
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		String role = k.next();

		switch (role) {
		case "DBA":
			System.out.println("���� ����");
			System.out.println("���/����");
		case "DBP":
			System.out.println("��ɾ�� CRUD");
		case "DBU":
			System.out.println("���� Ȱ��");
			break;
		}
	}
}
