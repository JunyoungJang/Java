package Ex16_random;

import java.util.Random;

public class Ex_lotto {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		outer : for( int i = 0; i < lotto.length; ) {
			
			// 1 ~ 45사이의 난수
			lotto[i] = new Random().nextInt( 45 ) + 1;
			
			//경우의 수 판단
			for( int j = 0; j < i; j++ ) {
				
				if( lotto[i] == lotto[j] ) {
					continue outer;
				}
				
			}//inner
			
			System.out.print( lotto[i] + " " );
			i++;
			
		}//for
		
	}//main
}







































































