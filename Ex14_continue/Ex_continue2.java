package Ex14_continue;

public class Ex_continue2 {
	public static void main(String[] args) {
		
		//continue��: �ݺ��� ������ Ư�� ������ �ǳʶٰ��� �� �� ���.
		out : for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j%2 == 0) continue out;
				System.out.print(j + " ");
			}//inner
			System.out.println();
		}//outer
	}
}
