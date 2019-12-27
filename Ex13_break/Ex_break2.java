package Ex13_break;

public class Ex_break2 {
	public static void main(String[] args) {
		outer : for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j % 2 == 0) {
					break outer; // label을 통해 두 개 이상의 반복문을 빠져나올 수 있다.
				}
				System.out.print(j + " ");
			}// inner
			System.out.println();
		}// outer
	}// main
}
