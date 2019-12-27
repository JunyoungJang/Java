package Ex16_random;

import java.util.Random;

public class Ex_random {
	public static void main(String[] args) {
		
		//난수
		// 25124 ~ 112741사이의 난수
		//new Random().nextInt( 발생시킬 난수의 범위 ) + 시작수
		//new Random().nextInt( 큰 수 - 작은 수 + 1 ) + 시작수
		int num = new Random().nextInt( 112741 - 25124 + 1 ) + 25124;
		System.out.println( num );
		
	}//main
}









































































