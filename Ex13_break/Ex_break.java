package Ex13_break;

public class Ex_break {
	public static void main(String[] args) {
		//break��: �ݺ��� ������ ���������� ���� ����� �ݸ��� �������� �� ���.
		int n = 1;
		while (true) {
			System.out.println(n);
			n++;
			if (n > 10)	break;
		}
		System.out.println("����");
	}
}
