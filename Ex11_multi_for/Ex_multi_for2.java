package Ex11_multi_for;

public class Ex_multi_for2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 + i; j++) {
				if (i +j > 3) 	System.out.print("* ");
				else			System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	
	
}
