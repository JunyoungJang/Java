package Ex10_single_for;

public class Ex_for {
	public static void main(String[] args) {
		//for�� : Ư�� ���๮�� ������ �ݺ� �� �� �ֵ��� �� �ִ� ���
		//for(�ʱ��;���ǽ�;������){
		//  ���ǽ��� ���϶� ����Ǵ� ����x
		//}
		
		for (int i = 1;  i <= 3; i++) {
			System.out.println(i + "�ȳ�");
		}
		System.out.println("--------------------------------------------");
		for (int i = 0; i <= 2; i++) {
			System.out.print("�ϼ���");
			System.out.println("�ϼ���");
		}
		System.out.println("--------------------------------------------");
		// 1���� 100���� �ݺ��ϴ� ���忡��
		// 5�� ����� ȭ�鿡 ���
		for (int i = 1; i <= 100; i++) {
			if(i%5 == 0)	System.out.println(i);
		}
		System.out.println("--------------------------------------------");
		System.out.println("99�� ���");
		int dan = 6;
		//dan�� �ش��ϴ� �������� ����Ѵ�.
		//��, 2~9���� ���� �Էµ��� �ʾҴٸ�
		//2~9������ ���ڸ� �������� ��� ������ ��µǰ� �Ѵ�.
		// 6*1 =6...
		if ((int)dan > 0 && (int)dan <10)
			for (int i = 1; i <= 9; i++) {
				int conti_dan = dan * i;
				System.out.print("[" + i + "]" + conti_dan + "/");
			}
		else System.out.println("2~9������ ���ڸ� ��������");
	}
}
