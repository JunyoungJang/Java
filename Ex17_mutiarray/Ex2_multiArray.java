package Ex17_mutiarray;

public class Ex2_multiArray {
	public static void main(String[] args) {
		
		String[][] stu = { {"¿µÈñ", "j:100", "a:80"}, 
						   {"Ã¶¼ö", "j:100"} };
		
		for( int i = 0; i < stu.length; i++ ) {
			
			for( int j = 0; j < stu[i].length; j++) {
				
				System.out.print( stu[i][j] + " " );
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}

























































