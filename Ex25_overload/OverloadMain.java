package Ex6_overload;
/*
 * <메소드 Overload>
 * - 같은 이름의 메소드를 '매개변수에 차이를 두어' 여러 버전으로 정의하는 것.
 *   ** 원래 메소드는 선언된 매개변수의 자료형/개수에 맞게 값을 넣어야 실행된다.
 *   
 *   
 *   
 */
public class OverloadMain {
	public static void main(String[] args) {
		Overload o = new Overload(); 
		
		o.myMethod(10);
		o.myMethod(true);
		o.myMethod(3.14);
		o.myMethod("ABC");
		o.myMethod("ABC", "DEF");

		System.out.println(10);
		System.out.println(true);
		System.out.println(3.14);
		System.out.println("ABC");
		// sysout은 모든 형태의 인자값을 받을 수 있다.
		
	}
}
