package ex02_valueType;

public class Ex2_valueType {

	public static void main(String[] args) {
		
		/* ------------------------------------------------------------- */
		//����
		//������ true, false. ��, ����̴ٿ� ����� �ƴϴ��� �� ���� ������ ������ �� �ִ� �ڷ���.
		boolean b;		 			//����
		b			= true;			//����
		b			= false;		//����� false
		boolean b2 	= true; 		//���� ���� ���� �ȵ�. �ʱ�ȭ

		System.out.println("b 	: " + b);
		System.out.println("b2 	: " + b2);
		System.out.println("----------------------------");
		
		/* ------------------------------------------------------------- */
		//������
		//�������� Ȭ����ǥ �ȿ� �ѱ��ڸ� ���� �� �ִ� �ڷ���.
		//Character Type �ѱ��ڸ� ����.
		char ch 	= 'A';
		System.out.println("ch 	: " + ch);
		
		ch 			= 65 + 1;
		System.out.println("ch 	: " + ch);
		
		/* ------------------------------------------------------------- */
		//������
		//Java�� compile���� �������� int�� ������ �ν�. �׷��� ū ���ڿ� ���ؼ��� (int���� ����Ե� ���, L�� �ٿ�����)
		byte 	by 		= 12;
		int 	num 	= 2100000000;
		//long	test 	= num + 1;
		long 	lo		= 2200000000L;
		System.out.println("by 	: " + by);
		System.out.println("num 	: " + num);
		System.out.println("by 	: " + lo);
		System.out.println("----------------------------");
		
		/* ------------------------------------------------------------- */
		//�Ǽ���
		//java�� long�� ���� ������, default �ڷ����� double�� �Ǿ� ����.
		float 	f 		= 3.14F;
		double 	d 		= 3.14;
		f 				= 150;
		d 				= 100;
		System.out.println("f 	: " + f);
		System.out.println("d 	: " + d);
	}

}
