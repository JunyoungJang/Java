package Ex17_mutiarray;

public class Ex3_multiArray {
	public static void main(String[] args) {
		
		int[][] arr;
		int num = 1;//���ۼ�
		int size = 7;//������ ������
		
		int y = 0;//��
		int x = 0;//��
		
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
		
		//�迭�� ������ ���
		for( int i = 0; i < size; i++ ) {
			
			for( int j = 0; j < size; j++ ) {
				
				//System.out.print( arr[i][j] + " " );
				System.out.printf("%02d ", arr[i][j]);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}


































































