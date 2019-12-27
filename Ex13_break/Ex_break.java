package Ex13_break;

public class Ex_break {
	public static void main(String[] args) {
		//break문: 반복문 내에서 강제저으로 가장 가까운 반목문을 빠져나갈 때 사용.
		int n = 1;
		while (true) {
			System.out.println(n);
			n++;
			if (n > 10)	break;
		}
		System.out.println("종료");
	}
}
