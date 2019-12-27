package Ex17_mutiarray;

public class Ex3_multiArray {
	public static void main(String[] args) {
		
		int[][] arr;
		int num = 1;//시작수
		int size = 7;//마방진 사이즈
		
		int y = 0;//행
		int x = 0;//열
		
		x = size / 2;
		
		arr = new int[size][size];
		
		while( num <= size * size ) {
			
			arr[y][x] = num;
			
			if( num % size == 0 ) {
				y++;
			}else {
				y--;
				x++;
			}
			
			if( y < 0 ) {
				y = size - 1;
			}
			
			if( x >= size ) {
				x = 0;
			}
			
			num++;
			
		}//while
		
		//배열의 내용을 출력
		for( int i = 0; i < size; i++ ) {
			
			for( int j = 0; j < size; j++ ) {
				
				//System.out.print( arr[i][j] + " " );
				System.out.printf("%02d ", arr[i][j]);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}


































































