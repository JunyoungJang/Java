package Ex06_if;

public class Ex_if {
	public static void main(String[] args) {
		
		//��� : ���α׷��� �帧�� �����ϴ� ����.
		//�б⹮�� �ݺ������� ������.
		//�б⹮ : if, switch.
		//�ݺ��� : for, while.
		
		//if��
		//if(���ǽ�){
		// ���ǽ��� ���϶� ����Ǵ� ����.
		//}
		int 	n 	= 50;
		String 	str = "�ȳ��ϼ���";
		
		if( n == 50 ) {
			str = "n�� 50�Դϴ�";
		}
		
		if ( n != 50 ) {
			str = "n�� 50�� �ƴմϴ�";
		}
		System.out.println(str);
	}
}