package ex03_casting;

public class Ex2_casting_demotion {
	public static void main(String[] args) {
		
		char 	c 		= 'B';
		int 	n 		= c + 1;
		c 				= (char)n;
		System.out.println("c	: " + c);
		
		float 	f 		= 5.5f;
		n				= (int)f;
		System.out.println("n	: " + n);
	}
}
