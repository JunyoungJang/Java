package Ex16_random;

import java.util.Random;

public class Ex_random {
	public static void main(String[] args) {
		
		//����
		// 25124 ~ 112741������ ����
		//new Random().nextInt( �߻���ų ������ ���� ) + ���ۼ�
		//new Random().nextInt( ū �� - ���� �� + 1 ) + ���ۼ�
		int num = new Random().nextInt( 112741 - 25124 + 1 ) + 25124;
		System.out.println( num );
		
	}//main
}









































































