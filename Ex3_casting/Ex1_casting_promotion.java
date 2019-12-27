package ex03_casting;

public class Ex1_casting_promotion {
	public static void main(String[] args) {
		
		//캐스팅(형변환)
		//1.프로모션 	- 큰 자료형에 작은 자료형을 대입하는 것(자동)
		//2.디모션		- 작은 자료형에 큰 자료형을 대입하는 것(자동X)
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
