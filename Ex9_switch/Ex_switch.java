package Ex09_switch;

public class Ex_switch {
	public static void main(String[] args) {
		//switch�� : if�� ���� ���ǽ����� ����� �����ϴ� ���� �ƴ�
		//�񱳰��� ���� ����� ���� ���.
		//switch(�񱳰�){
		// case ���ǰ�:
		// 		�񱳰��� ���ǰ��� ��ġ�ϸ� ����Ǵ� ����
		// 		break;
		//}
		int n = 13;
		switch(n) { //�񱳰�(����'int,long', ����'char', ���ڿ�'string')
		case 1:		// Case ���ǰ� �ߺ��Ǹ� �ȵ�.
			System.out.println("1. ���� ����");
			break;
		case 2:
			System.out.println("2.���� �Ұ�");
			break;
		case 3:
			System.out.println("3.��      ��");
			break;
		default:
			System.out.println("�޴��� �ùٸ��� �Է��ϼ���.");
			break;
		}//switch
		/* Switch�� ����.
		boolean b = true;
		switch (b) {
		case true:
			break;
		}*/
		
		char ch = '��';
		switch (ch) {
		case 'A' :
			System.out.println("A�� ����");
			break;
		case 'B' :
			System.out.println("B�� ����");
			break; 
		default:
			System.out.println("A�� B�� �Է��ϼ���");
			break;
		}
		
		int num1 = 10;
		int num2 = 20;
		char op = '*';
		switch(op) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		default:
			System.out.println("�����ȣ�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}

