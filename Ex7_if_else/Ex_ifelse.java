package Ex07_if_else;

public class Ex_ifelse {
	public static void main(String[] args) {
		
		//if else��
		//if (���ǽ�) {
		// ���ǽ��� ���϶� ����Ǵ� ����
		//}
		//else{
		// ���ǽ��� ������ �� ����Ǵ� ����
		//}
		int n = 49;
		String str = "";
		
		if (++n >= 50) {
			str = "n�� 50 �̻��� ��";
		}
		else {
			str = "n�� 50 �̸��� ��";
		}
		System.out.println(str);
		System.out.println("------------------------------------");
		
		//���� age�� ���̸� �����ϰ�
		//30�� �̻��̸� ��Ǹ�ŭ ��̳׿�.
		//�׷��� ������ ���� �� ��ŵ� �ǰھ��
		//�� ����ϴ� if���� �ϼ�
		int age = 100;
		System.out.println("���� : " + age + "��");
		if (age >= 30) 	System.out.println("��Ǹ�ŭ ��̳׿�.");
		else			System.out.println("���� �� ��ŵ� �ǰھ��.");
		System.out.println("------------------------------------");
		
		
		
		
	}
}
