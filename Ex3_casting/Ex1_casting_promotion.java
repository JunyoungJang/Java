package ex03_casting;

public class Ex1_casting_promotion {
	public static void main(String[] args) {
		
		//ĳ����(����ȯ)
		//1.���θ�� 	- ū �ڷ����� ���� �ڷ����� �����ϴ� ��(�ڵ�)
		//2.����		- ���� �ڷ����� ū �ڷ����� �����ϴ� ��(�ڵ�X)
		double 	d 	= 100.5;		//8 byte
		int 	n 	= 200;			//4 byte
		d			= n;			//Promotion casting.
		System.out.println("d	: " + d);
		
		char 	c 	= 'A';			//2 byte
		long	l	= 100;			//8 byte
		l			= c;
		System.out.println("l	: " + l);
		
		
		
	}
}
