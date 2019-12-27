package ex02_valueType;

public class Ex2_valueType {

	public static void main(String[] args) {
		
		/* ------------------------------------------------------------- */
		//논리형
		//논리형은 true, false. 즉, 사실이다와 사실이 아니다의 두 가지 값만을 저장할 수 있는 자료형.
		boolean b;		 			//선언
		b			= true;			//대입
		b			= false;		//결과값 false
		boolean b2 	= true; 		//동일 변수 선언 안됨. 초기화

		System.out.println("b 	: " + b);
		System.out.println("b2 	: " + b2);
		System.out.println("----------------------------");
		
		/* ------------------------------------------------------------- */
		//문자형
		//문자형은 홑따옴표 안에 한글자만 넣을 수 있는 자료형.
		//Character Type 한글자만 가능.
		char ch 	= 'A';
		System.out.println("ch 	: " + ch);
		
		ch 			= 65 + 1;
		System.out.println("ch 	: " + ch);
		
		/* ------------------------------------------------------------- */
		//정수형
		//Java는 compile전에 정수형은 int로 무조건 인식. 그래서 큰 숫자에 대해서는 (int값이 벗어나게될 경우, L로 붙여야함)
		byte 	by 		= 12;
		int 	num 	= 2100000000;
		//long	test 	= num + 1;
		long 	lo		= 2200000000L;
		System.out.println("by 	: " + by);
		System.out.println("num 	: " + num);
		System.out.println("by 	: " + lo);
		System.out.println("----------------------------");
		
		/* ------------------------------------------------------------- */
		//실수형
		//java의 long과 같은 문제로, default 자료형이 double로 되어 있음.
		float 	f 		= 3.14F;
		double 	d 		= 3.14;
		f 				= 150;
		d 				= 100;
		System.out.println("f 	: " + f);
		System.out.println("d 	: " + d);
	}

}
