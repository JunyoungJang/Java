package Ex1_method;

public class MethodTest {
	//public	void	test	(int n)
	//����������	��ȯ��	�޼����	�Ķ����
	
	//��ȯ���� void�� �ƴ� �����
	//�ڵ��� �������� �ݵ�� returnŰ���尡 �ʿ��ϴ�.
	public int test(int n) {
		n++;
		System.out.println("n : " + n);
		
		return n;
	}
	
	public String test2 (int num) {
		if (num == 0) {
			return "0�� �Է��� �� �����ϴ�.";
		}
		else {
			return num + "�� �Է��ϼ̽��ϴ�.";
		}
	}
}
