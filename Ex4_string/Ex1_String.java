package Ex4_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		//StringŬ������ �� ���� Ư¡�� �ִ�.
		//1) ��ü �������� �ΰ���(�Ͻ���, �����)
		//2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�.(�Һ��� Ư¡)
		
//		String s1 = "abc";//�Ͻ��� ��ü ���� - �Ͻ��� ��ü = ������ �ּ� ����
//		String s2 = "abd";
		
		//����� ��ä ����. new ����� ��� ������ ���� ����.
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		//String == strcmp
		if (s3.equals(s4)) {
			System.out.println("s3�� s4�� ���� �����ϴ�.");
		}
		
		//==�� ��ü(Class)�� ���� �� �ּҰ� �񱳰� �ȴ�.
		//int, float, double���� ���´� �� ��.
		if (s3 == s4) {
			System.out.println("s3�� s4�� �ּҰ� �����ϴ�.");
		}
		else {
			System.out.println("s3�� s4�� �ּҰ� �ٸ��ϴ�.");
		}
		//Java�� garbage collector�� �־ memory free���ص���.
		String name = "ȫ�浿";
		name = "��浿";//�ּ� ���� - �����Ͱ� �ٲ����ʰ� �ּҰ� �ٲ�.
		System.out.println(name);
		System.out.println("--------------------------");
		String str = "Hong Gil Dong";
		int len = str.length();
		System.out.println("���ڿ� str�� ���� : " + len);
		
		char ch = str.charAt(5);
		System.out.println("������ ���� : " + ch);
		
		str = "       ȫ �� ��   ";
		String t_str = str.trim();//���� �յ��� �ǹ̾��� ������ �����ϴ� �޼���
		if (t_str.equals("ȫ �� ��")) {
			System.out.println("���� �����ϴ�.");
		}
		
		str = "12312312312321";
		int tmp = Integer.parseInt(str);
		System.out.println(tmp);
	}
}
