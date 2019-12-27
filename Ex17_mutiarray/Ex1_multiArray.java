package Ex17_mutiarray;

public class Ex1_multiArray {
	public static void main(String[] args) {
		
		//1차원 배열이 2개 모이면 2차원 배열
		//1차원 배열이 3개 모이면 3차원 배열
		int[][] test = new int[2][3];
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		//System.out.println( test[0][2] );
		
		for( int i = 0; i < test.length; i++ ) {//y
			
			for( int j = 0; j < test[i].length; j++ ) {//x
				
				System.out.print( test[i][j] + " " );
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}







































































