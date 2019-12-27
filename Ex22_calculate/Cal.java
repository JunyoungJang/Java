package Ex2_calculate;

public class Cal {
	public void getResult (int su1, int su2, String op) {
		switch (op) {
		case "+":
			System.out.println("결과 : " + (su1 + su2));
			break;
			
		case "-":
			System.out.println("결과 : " + (su1 - su2));
			break;
			
		case "*":
			System.out.println("결과 : " + (su1 * su2));
			break;
			
		case "/":
			System.out.println("결과 : " + (su1 / su2));
			break;
			
		default:
			System.out.println("올바른 연산기호를 입력하세요.");
			break;
		}
	}
}
