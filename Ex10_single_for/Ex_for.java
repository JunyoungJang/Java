package Ex10_single_for;

public class Ex_for {
	public static void main(String[] args) {
		//for문 : 특정 수행문을 여러번 반복 할 수 있도록 해 주는 제어문
		//for(초기식;조건식;증감식){
		//  조건식이 참일때 실행되는 영역x
		//}
		
		for (int i = 1;  i <= 3; i++) {
			System.out.println(i + "안녕");
		}
		System.out.println("--------------------------------------------");
		for (int i = 0; i <= 2; i++) {
			System.out.print("하세요");
			System.out.println("하세요");
		}
		System.out.println("--------------------------------------------");
		// 1부터 100까지 반복하는 문장에서
		// 5의 배수만 화면에 출력
		for (int i = 1; i <= 100; i++) {
			if(i%5 == 0)	System.out.println(i);
		}
		System.out.println("--------------------------------------------");
		System.out.println("99단 출력");
		int dan = 6;
		//dan에 해당하는 구구단을 출력한다.
		//단, 2~9사의 값이 입력되지 않았다면
		//2~9사이의 숫자를 넣으세요 라는 문장이 출력되게 한다.
		// 6*1 =6...
		if ((int)dan > 0 && (int)dan <10)
			for (int i = 1; i <= 9; i++) {
				int conti_dan = dan * i;
				System.out.print("[" + i + "]" + conti_dan + "/");
			}
		else System.out.println("2~9사이의 숫자를 넣으세요");
	}
}
