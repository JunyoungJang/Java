package Ex6_overload;
/*
 * <�޼ҵ� Overload>
 * - ���� �̸��� �޼ҵ带 '�Ű������� ���̸� �ξ�' ���� �������� �����ϴ� ��.
 *   ** ���� �޼ҵ�� ����� �Ű������� �ڷ���/������ �°� ���� �־�� ����ȴ�.
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
		// sysout�� ��� ������ ���ڰ��� ���� �� �ִ�.
		
	}
}
