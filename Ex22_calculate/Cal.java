package Ex2_calculate;

public class Cal {
	public void getResult (int su1, int su2, String op) {
		switch (op) {
		case "+":
			System.out.println("��� : " + (su1 + su2));
			break;
			
		case "-":
			System.out.println("��� : " + (su1 - su2));
			break;
			
		case "*":
			System.out.println("��� : " + (su1 * su2));
			break;
			
		case "/":
			System.out.println("��� : " + (su1 / su2));
			break;
			
		default:
			System.out.println("�ùٸ� �����ȣ�� �Է��ϼ���.");
			break;
		}
	}
}
